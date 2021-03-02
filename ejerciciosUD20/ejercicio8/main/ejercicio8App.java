/**
 * 
 */
package main;

import java.awt.EventQueue;
import views.CalcularCambioMonedasAvanzado;


/**
 * @author Miguel A. Sastre
 *
 */
public class ejercicio8App {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcularCambioMonedasAvanzado frame = new CalcularCambioMonedasAvanzado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
