/**
 * 
 */
package Models;

/**
 * @author Miguel A. Sastre
 *
 */
public class Espectador extends Persona {

	protected double dinero;
	
	/**
	 * @param nombre
	 * @param edad
	 */
	public Espectador(String nombre, int edad, double dinero) {
		super(nombre, edad);
		this.dinero = dinero;
	}
	
	/**
	 * Métodos "Getters"
	 */
	
	public double getDinero() {
		return dinero;
	}
}
