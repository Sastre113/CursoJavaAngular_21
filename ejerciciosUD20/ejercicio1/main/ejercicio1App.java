package main;

import java.awt.EventQueue;
import views.InterfazBasica;

/**
 * Hello world!
 *
 */
public class ejercicio1App 
{
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazBasica frame = new InterfazBasica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
