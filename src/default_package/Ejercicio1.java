package default_package;

import java.util.Hashtable;
import java.util.Set;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio1 {
	/*
	 * 1) Crea una aplicación que calcule la nota media de los alumnos
	 * pertenecientes al curso de programación. Una vez calculada la nota media se
	 * guardara esta información en un diccionario de datos que almacene la nota
	 * media de cada alumno. Todos estos datos se han de proporcionar por pantalla
	 */
	
	static Hashtable<Integer,Alumno> dBNotas = new Hashtable<Integer,Alumno>(); 
	
	static private void mostrarAlumnos() {
		Set<Integer> it = dBNotas.keySet();
		String text = "";
		for(Integer alumno : it) {
			text += dBNotas.get(alumno).toString();
		}
		
		AuxMethod.mostrarInfo(text);
	}
	
	
	public static void main() {
		String [] opciones = {"Mostrar alumnos","Añadir nuevo alumno"};
		int opcion;
		boolean exit = false;
		
		// Datos de prueba
		int testNotas [] = {5,8,7};
		dBNotas.put(0, new Alumno("Alumno 1", testNotas) );
		dBNotas.put(1, new Alumno("Alumno 2", testNotas) );
		
		do {
			opcion =  AuxMethod.darOpciones(opciones);
			System.out.println(opcion);
			switch(opcion) {
			case 0: // Mostrar alumnos
				if (dBNotas.isEmpty()) {
					AuxMethod.mostrarInfo("No hay alumnos almacenados.");
				} else {
					mostrarAlumnos();
				}
				break;
			case 1: // Añadir alumno
				String nombreApellido = AuxMethod.solicitarDatosString("Nombre y apellido del alumno");
				int numEjercicios = AuxMethod.solicitarDatosInt("Ejercicio resueltos por el alumno");
				int notas[] = new int[numEjercicios];
				
				for(int i = 0; i < numEjercicios; i++)
					notas[i] = AuxMethod.solicitarDatosInt("Introduzca calificación UD" + (i+1));
				
				dBNotas.put(dBNotas.size() + 1, new Alumno(nombreApellido,notas));
				AuxMethod.mostrarInfo("¡Alumno añadido con éxito!");
				break;
			default:
				exit = true;
				break;
			}
			
		} while (!exit);
	}

}
