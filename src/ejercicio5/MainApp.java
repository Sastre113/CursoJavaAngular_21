package ejercicio5;

import java.util.LinkedList;
import java.util.Random;

/**
 * @author Miguel A. Sastre
 *
 */

public class MainApp {	
	
	
	public static String randomName() {
		String [] name = {"Pedro","Maria","Juan","Elisabeth","Geralt","Yennefer","Yaskier","Undomiel","Aragorn",
				"Cirilla","Gandalf","Eowyn","Santiago","Carlota","Fran","Monica","Jose","Josefa","Marcos","Matilda",
				"Maria","Miguel"};
		return name[new Random().nextInt(name.length)];
	}
	
	public static char randomSex() {
		return new Random().nextBoolean() == true ? 'H':'M';
	}
	
 	public static LinkedList<Alumno> nuevaListaAlumnos(int maxAlumnos){
 		LinkedList<Alumno> lista = new LinkedList<Alumno>();
 		int nMaxAlumnos = maxAlumnos;
 		
 		for(int i = 0; i < nMaxAlumnos; i++)
 			lista.add(new Alumno(randomName(), new Random().nextInt(16-7) + 7 , randomSex() ,
 					new Random().nextInt(11)));
 		
 		
 		return lista;
 	}
 	
 	public static String randomMateria() {
 		String [] asignatura = {"Matemáticas," , "Filosofía" , "Física"};
 		return asignatura[new Random().nextInt(asignatura.length)];
 	}
 	
 	public static Profesor nuevoProfesor() {
 		return new Profesor(randomName(),  new Random().nextInt(65- 25) + 25, randomSex(), randomMateria());
 	}
	
 	public static Profesor nuevoProfesor(String asignaturaPredefinida) {
 		return new Profesor(randomName(),  new Random().nextInt(65- 25) + 25, randomSex(), asignaturaPredefinida);
 	}
	
	
	public static void main(String[] args) {
		Aula aula1 = new Aula(1,30,randomMateria(),nuevoProfesor(),nuevaListaAlumnos(30));
		aula1.mostrarAlumnosAprobados();
		Aula aula2 = new Aula(1,30,"Matemáticas",nuevoProfesor("Matemáticas"),nuevaListaAlumnos(30));
		aula2.mostrarAlumnosAprobados();
	}
}
