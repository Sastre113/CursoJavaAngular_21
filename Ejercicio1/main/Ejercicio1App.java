/**
 * 
 */
package main;

import java.awt.EventQueue;

import views.Saludar;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio1App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Saludar frame = new Saludar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
