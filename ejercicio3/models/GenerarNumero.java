/**
 * 
 */
package models;

import java.util.Random;

import excepcion.excepcionParImpar;

/**
 * @author Miguel A. Sastre
 *
 */
public class GenerarNumero {
	
	protected int rangoInf;
	protected int rangoSup;
	
	/**
	 * @param rangoInf
	 * @param rangoSup
	 */
	public GenerarNumero(int rangoInf, int rangoSup) {
		this.rangoInf = rangoInf;
		this.rangoSup = rangoSup;
	}
	

	public void generar() {
		System.out.println("Generando número aleatorio...");
		int numero = new Random().nextInt(this.getRangoSup() - this.getRangoInf() + this.getRangoInf());
		
		try {
			System.out.println("El número aleatorio generado es: " + numero);
			if(numero%2 == 0)
				throw new excepcionParImpar(numero);
			else
				throw new excepcionParImpar(numero);
			
		} catch (excepcionParImpar e) {
			System.out.println(e.getParidad());
		}
		
	}


	/**
	 * @return the rangoInf
	 */
	public int getRangoInf() {
		return rangoInf;
	}


	/**
	 * @return the rangoSup
	 */
	public int getRangoSup() {
		return rangoSup;
	}
	
	
	
}
