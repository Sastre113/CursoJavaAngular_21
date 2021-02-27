/**
 * 
 */
package main;

import java.awt.EventQueue;

import views.Calculadora;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio4App {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
