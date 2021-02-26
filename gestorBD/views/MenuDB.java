/**
 * 
 */
package views;

import auxiliar.AuxMethod;
import models.GestorDB;

/**
 * @author Miguel A. Sastre
 *
 */
public class MenuDB {
	protected static GestorDB miGestor;
	
	private static String pruebas = "Profesor:dni CHAR(8) UNIQUE,\n"
			+ "    nombre VARCHAR(255) UNIQUE,\n"
			+ "    apellido1 VARCHAR(15) UNIQUE,\n"
			+ "    apellido2 VARCHAR(15) UNIQUE,\n"
			+ "    direccion VARCHAR(255),\n"
			+ "    titulo VARCHAR(30),\n"
			+ "    gana INT NOT NULL;dni";
	private static String pruebas2 = "Curso:cod_curso INT UNIQUE,\n"
			+ "    nombre_curso VARCHAR(100),\n"
			+ "    maximo_alumno INT,\n"
			+ "    fecha_inicio DATE,\n"
			+ "    fecha_fin DATE,\n"
			+ "    num_horas INT,\n"
			+ "    FK_dni_Profesor CHAR(8) UNIQUE;cod_curso;FK_dni_Profesor|Profesor|dni";
	
	private static String prueba3 = "Profesor:dni CHAR(8) UNIQUE,\n"
			+ "    nombre VARCHAR(255) UNIQUE,\n"
			+ "    apellido1 VARCHAR(15) UNIQUE,\n"
			+ "    apellido2 VARCHAR(15) UNIQUE,\n"
			+ "    direccion VARCHAR(255),\n"
			+ "    titulo VARCHAR(30),\n"
			+ "    gana INT NOT NULL;dni+Curso:cod_curso INT UNIQUE,nombre_curso VARCHAR(100),maximo_alumno INT,"
			+ "fecha_inicio DATE,fecha_fin DATE,num_horas INT,FK_dni_Profesor CHAR(8) UNIQUE;cod_curso;FK_dni_Profesor|Profesor|dni";
	private static String prueba4 = "pepe.Profesor:50640549,Miguel,Sastre,Galvez,Una direccion,HaCkEr,100 ";
	
	
	
	
	public static void iniciar() {
		miGestor = new GestorDB();
		int opcion = -1, intentos = 0;
		boolean exit = false;
		
		
		do {
			if(intentos == 9) {
				if(AuxMethod.darOpciones(new String [] {"Reintentar conexión","Salir"}) == 1)
					exit = true;
			} else
				miGestor.conectar();
			
			if(miGestor.estaConectado()) {
				opcion = AuxMethod.menuEjercicios(9, "Elige un ejercicio", "Opciones");
				switch(opcion) {
				case 1:
					miGestor.crearDB(AuxMethod.solicitarDatosString("Dame nombre db"));
					break;
				case 2:
					miGestor.crearTablas("pepe",prueba3);
					break;
				case 3:
					miGestor.insertarDatos(prueba4);
					break;
				default:
					miGestor.desconectar();
					AuxMethod.mostrarInfo("Desconectado del servidor\n¡Hasta pronto!");
					exit = true;
					break;
				}
			} else
				intentos++;
				
		}while(!exit);
	}	
}