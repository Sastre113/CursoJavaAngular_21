import java.util.Random;

import javax.swing.JOptionPane;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio12 {
	/*
	 * 12) Crea un array de números de un tamaño pasado por teclado, el array
	 * contendrá números aleatorios entre 1 y 300 y mostrará aquellos números que
	 * acaben en un dígito que nosotros le indiquemos por teclado (debes controlar
	 * que se introduce un numero correcto), estos deben guardarse en un nuevo
	 * array. Por ejemplo, en un array de 10 posiciones le indicamos mostrar los
	 * números acabados en 5, podría salir 155, 25, etc.
	 */

	static int[] generarArrayNumRandom(int rangoInf, int rangoSup, int size, int digitoFinal) {
		Random numRandom = new Random();
		int arrayNum[] = new int[size];

		for (int i = 0; i < size; i++) {
			do {
				arrayNum[i] = numRandom.nextInt(rangoSup - rangoInf) + rangoInf;
			} while (!(arrayNum[i] % 10 == digitoFinal));
		}

		return arrayNum;
	}

	public static void main() {
		JOptionPane.showMessageDialog(null, "Aviso: Este ejercicio muestra resultados por consola");
		int sizeArray = Math.abs(MainAPP.esNumeroInt((JOptionPane.showInputDialog("Introduce el tamaño deseado para el array"))));
		int digitoFinal = Math.abs(MainAPP.esNumeroInt(JOptionPane.showInputDialog("Indique en que digito quiere que acaben.")));

		int array[] = generarArrayNumRandom(1, 300, sizeArray,digitoFinal);

		MainAPP.mostrarArray(array);
	}

}
