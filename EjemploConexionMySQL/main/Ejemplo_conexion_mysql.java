package main;


//CRUD A MYSQL

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import auxiliar.MiUsuario;


public class Ejemplo_conexion_mysql {
	
	public static Connection conexion;
	private static final String USER = MiUsuario.getUSUARIO();
	private static final String PASS = MiUsuario.getCONTRASEÑA();

	public static void main(String[] args) {
		// LLAMADA A METODOS MYSQL
		openConnection();
		createDB("BD_prueba1");
		createTable("BD_prueba1","Tabla_1");
		insertData("BD_prueba1","Tabla_1","name", "lastname", "age", "H");
		getValues("BD_prueba1","Tabla_1");
		deleteRecord("BD_prueba1","Tabla_1", "1");
		closeConnection();
	}

	
	//METODO QUE ABRE LA CONEXION CON SERVER MYSQL
	public static void openConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion=DriverManager.getConnection("jdbc:mysql://192.168.1.50:3306/?useTimezone=true&serverTimezone=UTC",USER,PASS);//credenciales temporales
			System.out.print("Server Connected");
			fecha();
			
		}catch(SQLException | ClassNotFoundException ex  ){
			System.out.print("No se ha podido conectar con mi base de datos");
			fecha();
			System.out.println(ex.getMessage());
			
		}
		
	}
		
	//METODO QUE CIERRA LA CONEXION CON SERVER MYSQL
	public static void closeConnection() {
		try {
			conexion.close();
			System.out.print("Server Disconnected");
			fecha();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.print("Error cerrando conexion");
			fecha();
		}
	}
	
	//METODO QUE CREA LA BASE DE DATOS
	public static void createDB(String name) {
		try {
			String Query="CREATE DATABASE "+ name;
			Statement st= conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("DB creada con exito!");
			
		JOptionPane.showMessageDialog(null, "Se ha creado la DB " +name+ "de forma exitosa.");
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error creando la DB.");
		}	
	}

	//METODO QUE CREA TABLAS MYSQL
	public static void createTable(String db,String name) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE "+name+""
					+ "(ID INT PRIMARY KEY AUTO_INCREMENT, Nombre VARCHAR(50),Apellido VARCHAR(50),"
					+ "Edad VARCHAR(3), Sexo VARCHAR(1))";
			Statement st= conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
			
		}
		
	}
	
	//METODO QUE INSERTA DATOS EN TABLAS MYSQL
	public static void insertData(String db, String table_name, String name, String lastname, String age, String gender) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "INSERT INTO " + table_name + " (Nombre, Apellido, Edad, Sexo) VALUE(" 
					+ "\"" + name + "\", "
					+ "\"" + lastname + "\", "
					+ "\"" + age + "\", "
					+ "\"" + gender + "\"); ";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			
			System.out.println("Datos almacenados correctamente");;
			
		} catch (SQLException ex ) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}
					
	}
	
	//METODO QUE OBTIENE VALORES MYSQL
	public static void getValues(String db, String table_name) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "SELECT * FROM " + table_name;
			Statement st = conexion.createStatement();
			java.sql.ResultSet resultSet;
			resultSet = st.executeQuery(Query);
			
			while (resultSet.next()) {
				System.out.println("ID: " +  resultSet.getString("ID") + " "
						+ "Nombre: " +  resultSet.getString("Nombre") + " "
						+ "Apellido:" + resultSet.getString("Apellido") +  " "
						+ "Edad: " +  resultSet.getString("Edad") + " "
						+ "Sexo: " +  resultSet.getString("Sexo") + " "
						);
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error en la adquisicion de datos");
		}
	
	}
	 
	//METODO QUE LIMPIA TABLAS MYSQL
	public static void deleteRecord(String db, String table_name, String ID) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "DELETE FROM " + table_name + " WHERE ID = \"" + ID + "\"";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			
			System.out.println("Registros de tabla ELIMINADOS con exito!");
						
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
		}
	}	

	
	//METODO QUE ELIMINA TABLAS MYSQL
	public static void deleteTAbla(String db, String table_name) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "DROP TABLE " + table_name + ";";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			
			System.out.println("TABLA ELIMINADA con exito!");
						
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error borrando la tabla");
		}
	}	
	
	
	//METODO QUE MUESTRA FECHA
	public static void fecha() {
		Date date = new Date();
		DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		System.out.println(" - " + hourdateFormat.format(date));
		}
	
	

}