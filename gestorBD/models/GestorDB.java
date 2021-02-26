/**
 * 
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import auxiliar.AuxMethod;
import auxiliar.MiUsuario;

/**
 * @author Miguel A. Sastre
 *
 */
public class GestorDB {
	
	
	/**
	 * Variables para conexión con la BD
	 */
	private final String DB_URL = "jdbc:mysql://192.168.1.50:3306/?allowMultiQueries=true&useTimezone=true&serverTimezone=UTC";
	private final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private Connection conexion = null;
	
	/**
	 * Variables de identificación
	 */
	private final String USER = MiUsuario.getUSUARIO();
	private final String PWD = MiUsuario.getCONTRASEÑA();
	
	/**
	 * Método para conectar con el servidor
	 */
	public void conectar() {
		try {
			if(!this.estaConectado()) {
				Class.forName(this.DRIVER);
				this.setConexion(DriverManager.getConnection(this.DB_URL, this.USER, this.PWD));
				AuxMethod.mostrarInfo("¡Conexión con el server establecidad!");
			}			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Método para desconectar del servidor
	 */
	
	public void desconectar() {
		try {
			this.getConexion().close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Método encargado de construir los ejercicios propuestos.
	 * 
	 * @param nombreDB
	 * @param valoresBruto
	 * @param datos
	 */
	public void construirDB(String nombreDB, String valoresBruto, String datos) {
		this.crearDB(nombreDB);
		this.crearTablas(nombreDB, valoresBruto);
		this.insertarDatos(datos);
	}
	
	
	/**
	 * 
	 * @param nombreDB
	 */
	
	public void crearDB(String nombreDB) {
		String query = "CREATE DATABASE " + nombreDB;
		try {
			Statement st = this.getConexion().createStatement();
			st.executeUpdate(query);
			AuxMethod.mostrarInfo("Se ha creado con exito la DB : " + nombreDB );
		} catch (SQLException e) {
			AuxMethod.mostrarInfo(e.getMessage());
			e.printStackTrace();
		}
	}
	
	/**
	 * valoresBruto formato --> NombreTabla1:Atributo1, ... ,AtributoN;PK1, ... , PKn;FK1 , ... , FKn 
	 * 							+ ... 
	 * 							+ NombreTablaN:... 
	 * @param valoresBruto
	 */
	
	public void crearTablas(String nombreDB,String valoresBruto) {
		String fk[], valores[] ,camposSeparados [] ,tabla [],  tablasSeparadas[] = valoresBruto.split("\\+");
		String query = "";
		
		try {
			Statement st = this.getConexion().createStatement();
			st.executeUpdate("USE " + nombreDB + ";");
			
			for(int i = 0; i < tablasSeparadas.length; i++) {
				// Tabla[0] = Nombre Tabla
				// Tabla[1] = Atributo1, ... ,AtributoN;PK1, ... , PKn;FK1 , ... , FKn
				
				tabla = tablasSeparadas[i].split(":");
				
				//	camposSeparados[0] = Atributo1, ... ,AtributoN
				//	camposSeparados[1] = PK1, ... , PKn
				// 	camposSeparados[2] = FK1 , ... , FKn 
				
				camposSeparados = tabla[1].split(";");
				query = "CREATE TABLE " + tabla[0] + " ( ";
				
				for(int j = 0; j < camposSeparados.length; j++) {
					// j = 0 --> valores[0] = Atributo1, ... ,AtributoN
					// j = 1 --> valores[1] = PK1, ... , PKn
					// j = 2 --> valores[2] = FK1 , ... , FKn 
					
					valores = camposSeparados[j].split(",");
					for(int z = 0; z < valores.length; z++) {
						
						switch(j) {
						case 0: // Caso Attritube
							query += valores[z] + ",";
							break;
						case 1: // Caso Primary Key
							if(z == 0)
								query += "PRIMARY KEY (";
							
							query += valores[z] + ",";
							
							if( z == valores.length-1) {
								query = this.eliminarUltimoCaracter(query) + "),";
							}
							break;
						case 2:// Caso Foreign key
							// FK --> Atrib|TablaRefer|AtribRef
							fk = valores[z].split("\\|");
							query += "CONSTRAINT " + fk[0] +" FOREIGN KEY (" + fk[0] +") REFERENCES " + fk[1] + "(" + fk[2] +")"
										+ " ON DELETE CASCADE ON UPDATE CASCADE," ;
							break;			
						}
					}
				}
				query = this.eliminarUltimoCaracter(query) + ")";
				
				st = this.getConexion().createStatement();
				st.executeUpdate(query);
			}
		} catch (SQLException e) {
			AuxMethod.mostrarInfo(e.getMessage());
			e.getStackTrace();
		}
		
	}
	
	
	/**
	 * Método que inserta los datos pasados
	 * Datos formato --> NombreTabla(Atributo1,..., AtributoN): A1 = valor1,...,valorN  ; ... ; An = valor1,...,valorN + ... + NombreTablaN:...
	 * 															Siendo Ax, un conjunto de valores que se quiere ingresar.
	 * @param datos
	 */
	
	public void insertarDatos(String datos) {
		String valores[],conjuntoDatos[], tabla[],tablasSeparadas [] = datos.split("\\+");
		String query = "";
		PreparedStatement pst = null;
		
		try {
			for(int i = 0; i < tablasSeparadas.length; i++) {
				tabla = tablasSeparadas[i].split(":");
				query = "INSERT INTO " + tabla[0] + " ";
				conjuntoDatos = tabla[1].split(";");
				
				
				for(int j = 0; j < conjuntoDatos.length; j++) {
					valores = conjuntoDatos[j].split(",");
					if(j == 0)
						query += this.parametrosEntrada(valores.length);
					pst = this.getConexion().prepareStatement(query);
					
					for(int k = 0; k < valores.length; k++) {
						pst.setString(k+1, valores[k]);
					}
					pst.executeUpdate();
				}
			}
		} catch (SQLException e) {
			AuxMethod.mostrarInfo(e.getMessage());
			e.getStackTrace();
		}
	}
	
	/**
	 * Método que calcula cuantos parametros de entrada se necesitan
	 * y preparala la query para un preparedStatement.
	 * @param numParametros
	 * @return String
	 */
	
	private String parametrosEntrada(int numParametros) {
		String query = "VALUES (";
		
		for(int i = 0; i < numParametros; i++)
			query += "?,";
		
		return this.eliminarUltimoCaracter(query) + ");";
	}
	
	/**
	 * Método para eliminar el ultimo carácter de una cadena
	 * @param cadena
	 * @return
	 */
	private String eliminarUltimoCaracter(String cadena) {
		return cadena.substring(0, cadena.length()-1);
	}
	
	
	/**
	 * @return boolean 
	 */
	
	public boolean estaConectado() {
		return this.conexion != null;
	}
	
	/**
	 * @return the conexion
	 */
	
	public Connection getConexion() {
		return conexion;
	}

	/**
	 * @param conexion the conexion to set
	 */
	
	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	
	
}
