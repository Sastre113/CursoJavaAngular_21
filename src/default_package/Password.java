/**
 * 
 */
package default_package;

import java.util.Random;

/**
 * @author Miguel A. Sastre
 *
 */

/*
 * 2. Haz una clase llamada Password que siga las siguientes condiciones: 
 * 	• Que tenga los atributos longitud y contraseña . Por defecto, la longitud será de 8. 
 * 	• Los constructores serán los siguiente: 
 * 		- Un constructor por defecto. 
 * 		- Un constructor con la longitud que nosotros le pasemos. 
 * 			Generara una contraseña aleatoria con esa longitud.
 */


public class Password {
	
	
	private double contraseña;
	private int longitud;
	private static final int DEFAULT_LENGTH = 8;
	
	public Password() {
		this(DEFAULT_LENGTH);
	}
	
	/**
	 * @param longitud
	 */
	public Password(int longitud) {
		super();
		this.longitud = longitud;
		this.contraseña = this.passwordGenerator(longitud);
	}
	
	/**
	 * @param size
	 * @return random password
	 */
	private double passwordGenerator(double size) {
		return new Random().nextDouble() * Math.pow(10, longitud-1);
	}
}
