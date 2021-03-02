/**
 * 
 */
package main;

import java.awt.EventQueue;
import views.VentanaConRatonOyente;

/**
 * @author Miguel A. Sastre
 *
 */
public class ejercicio5App {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaConRatonOyente frame = new VentanaConRatonOyente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
