/**
 * 
 */
package main;

import java.awt.EventQueue;

import views.Encuestador;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio3App {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Encuestador frame = new Encuestador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
