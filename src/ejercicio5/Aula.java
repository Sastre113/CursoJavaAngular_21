/**
 * 
 */
package ejercicio5;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Miguel A. Sastre
 *
 */
public class Aula {
	
	
	/**
	 * Atributos
	 */
	
	protected int idAula;
	protected int nMaxAlumnos;
	protected String asignatura;
	
	/*
	 * Estado del aula:
	 *  hayClase = true, se puede dar clase
	 *  ecc no hay clase.
	 */
	protected boolean hayClase; 
	
	/*
	 * Profesor asignado al aula.
	 */
	
	protected Profesor profesor;
	
	/*
	 * Lista de alumnos asignados al aula.
	 */
	
	protected LinkedList<Alumno> listaAlumnos;
	
	
	/**
	 *
	 */
	
	public Aula(int id, int maxAlumnos, String asignatura,Profesor profesor, LinkedList<Alumno> listaAlumnos) {
		this.idAula = id;
		this.nMaxAlumnos = maxAlumnos;
		this.asignatura = asignatura;
		this.profesor = profesor;
		this.listaAlumnos = listaAlumnos;
		this.hayClase = sePuedeDarClase(profesor,listaAlumnos);
		
	}
	
	public boolean sePuedeDarClase(Profesor profesor, LinkedList<Alumno> listaAlumnos) {
		boolean hayClase = false;
		int alumnosPresentes = 0;
		
		if(profesor.estaPresente() && this.comprobarAsignaturaProfesor()) {
			Iterator<Alumno> it = listaAlumnos.iterator();
			
			while(it.hasNext()) {
				if(it.next().estaPresente())
					alumnosPresentes++;
			}
			
			hayClase = (alumnosPresentes >= (this.nMaxAlumnos/2)) ? true:false;
		}
		
		return hayClase;
	}
	
	public boolean comprobarAsignaturaProfesor() {
		return this.profesor.getMateria().compareToIgnoreCase(this.asignatura) == 0;
	}
	
	public void mostrarAlumnosAprobados() {
		if(!this.hayClase)
			System.out.println("No hay clase.");
		else {
			int alumnosAprobados = 0, alumnasAprobadas = 0;
			Iterator<Alumno> it = this.listaAlumnos.iterator();
			
			while(it.hasNext()) {
				Alumno alumno = it.next();
				if(alumno.getCalificacion() >= 5)
					if(alumno.getSexo() == 72)
						alumnosAprobados++;
					else
						alumnasAprobadas++;
			}
			
			System.out.println("Alumnas aprobadas: "+ alumnasAprobadas + "\nAlumnos aprobados: " + alumnosAprobados);
		}
		
	}

	public int getIdAula() {
		return idAula;
	}

	public int getnMaxAlumnos() {
		return nMaxAlumnos;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public boolean isHayClase() {
		return hayClase;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public LinkedList<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}
}
