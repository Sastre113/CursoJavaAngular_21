/**
 * 
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
	private final String DB_URL = "jdbc:mysql://192.168.1.50:3306/?useTimezone=true&serverTimezone=UTC";
	private final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private Connection conexion = null;
	
	/**
	 * Variables de identificación
	 */
	private final String USER = MiUsuario.getUSUARIO();
	private final String PWD = MiUsuario.getCONTRASEÑA();
	
	
	public void conectar() {
		try {
			Class.forName(this.DRIVER);
			this.setConexion(DriverManager.getConnection(this.DB_URL, this.USER, this.PWD));
			AuxMethod.mostrarInfo("¡Conexión con el server establecidad!");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void desconectar() {
		try {
			this.getConexion().close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
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
