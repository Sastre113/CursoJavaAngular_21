/**
 * 
 */
package main;

import java.awt.EventQueue;

import views.VentanaConInteraccion;
import views.VentanaConMasInteraccion;
import views.VentanaConRatonOyente;
import views.VentanaOyente;

/**
 * @author Miguel A. Sastre
 *
 */
public class ejercicio4App {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaOyente frame = new VentanaOyente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
