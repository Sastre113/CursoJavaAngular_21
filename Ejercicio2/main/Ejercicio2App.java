/**
 * 
 */
package main;

import java.awt.EventQueue;

import views.Peliculas;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio2App {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Peliculas frame = new Peliculas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
