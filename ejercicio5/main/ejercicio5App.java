/**
 * 
 */
package main;

import java.util.Scanner;

import models.Password;

/**
 * @author Miguel A. Sastre
 *
 */

public class ejercicio5App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int longitudUsuario = 0;

		System.out.println("¿De que tamaño quieres el array de contraseñas?");
		Password[] arrayPass = new Password[scan.nextInt()];
		boolean[] arrayEsFuerte = new boolean[arrayPass.length];

		System.out.println("¿Que longitud quieres para las contraseñas?");
		longitudUsuario = scan.nextInt();

		for (int i = 0; i < arrayPass.length; i++)
			arrayPass[i] = new Password(longitudUsuario);

		for (int i = 0; i < arrayPass.length; i++) {
			arrayEsFuerte[i] = arrayPass[i].esFuerte();

			System.out.println(arrayPass[i].getContraseña() + " " + arrayEsFuerte[i]);
		}

	}

}
