/**
 * 
 */
package main;

import java.awt.EventQueue;
import views.VentanaConMasInteraccion;

/**
 * @author Miguel A. Sastre
 *
 */
public class ejercicio3App {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaConMasInteraccion frame = new VentanaConMasInteraccion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
