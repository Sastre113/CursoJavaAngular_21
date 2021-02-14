/**
 * 
 */
package main;

import excepcion.MiExcepcion;

/**
 * @author Miguel A. Sastre
 *
 */
public class ejercicio2App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mensaje mostrado por pantalla");
		
		try {
			if(true)
				throw new MiExcepcion();
		} catch (MiExcepcion e) {
			System.out.println("Excepcion capturada con mensaje: " + e.getMsg());
		} finally {
			System.out.println("Programa terminado");
		}
	}

}
