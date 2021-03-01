/**
 * 
 */
package main;

import java.awt.EventQueue;

import views.IndiceMasaCorporal;


/**
 * @author Miguel A. Sastre
 *
 */
public class ejercicio6App {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IndiceMasaCorporal frame = new IndiceMasaCorporal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
