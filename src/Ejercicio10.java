import java.util.Random;

import javax.swing.JOptionPane;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio10 {

	/*
	 * 10) Crea un array de números de un tamaño pasado por teclado, el array
	 * contendrá números aleatorios primos entre los números deseados, por último
	 * nos indicar cual es el mayor de todos. Haz un método para comprobar que el
	 * número aleatorio es primo, puedes hacer todos lo métodos que necesites.
	 */

	public static int esNumero(String strNum) {
		int auxNum;

		if (strNum == null) {
			System.err.println(strNum + " no es número valido, se usará 1.");
			auxNum = 1;
		}			
		else
			try {
				auxNum = Integer.parseInt(strNum);
			} catch (NumberFormatException e) {
				System.err.println(strNum + " no es número valido, se usará 1.");
				auxNum = 1;
			}

		return auxNum;
	}

	static int [] generarArrayNumRandom(int rangoInf, int rangoSup,int size) {
		Random numRandom = new Random();
		int arrayNum[] = new int[size];
		
		for (int i = 0; i < size; i++) {
			do {
				arrayNum[i] = numRandom.nextInt(rangoSup - rangoInf) + rangoInf;
			} while (!esPrimo(arrayNum[i]));	
		}

		
		return arrayNum;
	}

	
	
	static boolean esPrimo(int num) {
		int punt = 2;
		boolean esPrimo = true;
		
		if(punt < num)
			do {
				esPrimo = (((Math.abs(num))%punt) == 0) ? false: true;
				punt++;
			} while (esPrimo && (punt < num));	
		else if (num == 0 || num == 1)
			esPrimo = false;
		
		return esPrimo;
	}
	
	static void mostrarArray(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Posición " + i + ": " + array[i]);
		}
	}
	
	static void mayorNumero(int[] array) {
		int mayor = array[0];
		
		for(int i = 0; i < array.length; i++)
			if(array[i] > mayor) mayor = array[i];
		
		JOptionPane.showMessageDialog(null, "El número más grande del array es: " + mayor);
	}
	
	
	public static void main() {
		boolean rangoValido = false;
		JOptionPane.showMessageDialog(null, "Aviso: Este ejercicio muestra resultados por consola");
		int rangoInf, rangoSup,sizeArray = esNumero(JOptionPane.showInputDialog("Introduce el tamaño deseado para el array"));
	
		// Hay que comprobar que el rango sea valido.
		JOptionPane.showMessageDialog(null, "Introduzca un rango para los números aleatorios");
		
		do {
			 rangoInf =  Integer.parseInt(JOptionPane.showInputDialog("Dame un rango [a , b] (Nº enteros). Dame a = ?"));
			 rangoSup =  Integer.parseInt(JOptionPane.showInputDialog("Dame un rango [" + rangoInf + " , b]. Dame b = ?"));
			
			if(rangoInf < rangoSup) {
				rangoValido = true;
				
			}else
				JOptionPane.showMessageDialog(null, "Rango introducido incorrecto. b > a ");
				
		} while (!rangoValido);

		
		mostrarArray(generarArrayNumRandom(rangoInf, rangoSup,sizeArray));
		mayorNumero(generarArrayNumRandom(rangoInf, rangoSup,sizeArray));
	}

}
