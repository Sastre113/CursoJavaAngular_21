/**
 * 
 */
package main;

import models.GenerarNumero;

/**
 * @author Miguel A. Sastre
 *
 */
public class ejercicio3App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			GenerarNumero numRandom = new GenerarNumero(0,1000);
			numRandom.generar();	
	}

}
