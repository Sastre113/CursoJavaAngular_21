/**
 * 
 */
package ejercicio5;

import java.util.Random;

/**
 * @author Miguel A. Sastre
 *
 */
public class Alumno extends Persona {

	
	private double calificacion;
	
	/**
	 * @param nombre
	 * @param edad
	 * @param sexo
	 */
	public Alumno(String nombre, int edad, char sexo,double calificacion) {
		super(nombre, edad, sexo);
		this.calificacion = calificacion;
	}
	
	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	@Override
	public boolean estaPresente() {
		return new Random().nextBoolean();
	}

}
