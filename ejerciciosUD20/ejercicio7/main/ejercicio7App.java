/**
 * 
 */
package main;

import java.awt.EventQueue;
import views.CalculadoraCambioMoneda;


/**
 * @author Miguel A. Sastre
 *
 */
public class ejercicio7App {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraCambioMoneda frame = new CalculadoraCambioMoneda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
