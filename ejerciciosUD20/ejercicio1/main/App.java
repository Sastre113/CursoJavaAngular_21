package com.ejercicio1.ejercicio1;

import java.awt.EventQueue;

import com.ejercicio1.views.InterfazBasica;

/**
 * Hello world!
 *
 */
public class App 
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
