/**
 * 
 */
package main;

import java.awt.EventQueue;
import views.VentanaConInteraccion;

/**
 * @author Miguel A. Sastre
 *
 */
public class ejercicio2App {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaConInteraccion frame = new VentanaConInteraccion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
