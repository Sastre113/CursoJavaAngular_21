/**
 * 
 */
package views;

import auxiliar.AuxMethod;
import ejercicios.*;
import models.GestorDB;

/**
 * @author Miguel A. Sastre
 *
 */
public class MenuDB {
	protected static GestorDB miGestor;

	private static String pruebas = "Profesor:dni CHAR(8) UNIQUE,\n" + "    nombre VARCHAR(255) UNIQUE,\n"
			+ "    apellido1 VARCHAR(15) UNIQUE,\n" + "    apellido2 VARCHAR(15) UNIQUE,\n"
			+ "    direccion VARCHAR(255),\n" + "    titulo VARCHAR(30),\n" + "    gana INT NOT NULL;dni";
	private static String pruebas2 = "Curso:cod_curso INT UNIQUE,\n" + "    nombre_curso VARCHAR(100),\n"
			+ "    maximo_alumno INT,\n" + "    fecha_inicio DATE,\n" + "    fecha_fin DATE,\n" + "    num_horas INT,\n"
			+ "    FK_dni_Profesor CHAR(8) UNIQUE;cod_curso;FK_dni_Profesor|Profesor|dni";

	private static String prueba3 = "Profesor:dni CHAR(8) UNIQUE,\n" + "    nombre VARCHAR(255) UNIQUE,\n"
			+ "    apellido1 VARCHAR(15) UNIQUE,\n" + "    apellido2 VARCHAR(15) UNIQUE,\n"
			+ "    direccion VARCHAR(255),\n" + "    titulo VARCHAR(30),\n"
			+ "    gana INT NOT NULL;dni+Curso:cod_curso INT UNIQUE,nombre_curso VARCHAR(100),maximo_alumno INT,"
			+ "fecha_inicio DATE,fecha_fin DATE,num_horas INT,FK_dni_Profesor CHAR(8) UNIQUE;cod_curso;FK_dni_Profesor|Profesor|dni";
	private static String prueba4 = "pepe.Profesor:50640549,Miguel,Sastre,Galvez,Una direccion,HaCkEr,100 ";

	public static void iniciar() {
		miGestor = new GestorDB();
		int opcion = -1, intentos = 0;
		boolean exit = false;

		do {
			if (intentos == 9) {
				if (AuxMethod.darOpciones(new String[] { "Reintentar conexión", "Salir" }) == 1)
					exit = true;
			} else
				miGestor.conectar();

			if (miGestor.estaConectado()) {
				opcion = AuxMethod.menuEjercicios(9, "Elige un ejercicio", "Opciones");
				switch (opcion) {
				case 1:
					Ejercicio1 ejercicio1 = new Ejercicio1();
					miGestor.construirDB(ejercicio1.getNombreDB(), ejercicio1.getTablas(), ejercicio1.getDatos());
					break;
				case 2:
					Ejercicio2 ejercicio2 = new Ejercicio2();
					miGestor.construirDB(ejercicio2.getNombreDB(), ejercicio2.getTablas(), ejercicio2.getDatos());
					break;
				case 3:
					Ejercicio3 ejercicio3 = new Ejercicio3();
					miGestor.construirDB(ejercicio3.getNombreDB(), ejercicio3.getTablas(), ejercicio3.getDatos());
					break;
				case 4:
					Ejercicio4 ejercicio4 = new Ejercicio4();
					miGestor.construirDB(ejercicio4.getNombreDB(), ejercicio4.getTablas(), ejercicio4.getDatos());
					break;
				case 5:
					Ejercicio5 ejercicio5 = new Ejercicio5();
					miGestor.construirDB(ejercicio5.getNombreDB(), ejercicio5.getTablas(), ejercicio5.getDatos());
					break;
				case 6:
					Ejercicio6 ejercicio6 = new Ejercicio6();
					miGestor.construirDB(ejercicio6.getNombreDB(), ejercicio6.getTablas(), ejercicio6.getDatos());
					break;
				case 7:
					Ejercicio7 ejercicio7 = new Ejercicio7();
					miGestor.construirDB(ejercicio7.getNombreDB(), ejercicio7.getTablas(), ejercicio7.getDatos());
					break;
				case 8:
					Ejercicio8 ejercicio8 = new Ejercicio8();
					miGestor.construirDB(ejercicio8.getNombreDB(), ejercicio8.getTablas(), ejercicio8.getDatos());
					break;
				case 9:
					Ejercicio9 ejercicio9 = new Ejercicio9();
					miGestor.construirDB(ejercicio9.getNombreDB(), ejercicio9.getTablas(), ejercicio9.getDatos());
					break;
				default:
					miGestor.desconectar();
					AuxMethod.mostrarInfo("Desconectado del servidor\n¡Hasta pronto!");
					exit = true;
					break;
				}
			} else
				intentos++;

		} while (!exit);
	}
}