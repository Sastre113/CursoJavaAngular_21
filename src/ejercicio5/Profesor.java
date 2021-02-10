/**
 * 
 */
package ejercicio5;

import java.util.Random;

/**
 * @author Miguel A. Sastre
 *
 */
public class Profesor extends Persona {

	
	private String materia;
	
	/**
	 * @param nombre
	 * @param edad
	 * @param sexo
	 */
	public Profesor(String nombre, int edad, char sexo, String materia) {
		super(nombre, edad, sexo);
		this.materia = materia;
	}


	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	@Override
	public boolean estaPresente() {
		return (new Random().nextInt(4) != 0) ? true : false;
	}

}
