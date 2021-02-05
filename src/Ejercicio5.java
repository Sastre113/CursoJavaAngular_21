import java.util.Stack;

import javax.swing.JOptionPane;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio5 {
	/*
	 * 5) Crea una aplicación que nos convierta un número en base decimal a binario.
	 * Esto lo realizara un método al que le pasaremos el numero como parámetro,
	 * devolverá un String con el numero convertido a binario. Para convertir un
	 * numero decimal a binario, debemos dividir entre 2 el numero y el resultado de
	 * esa división se divide entre 2 de nuevo hasta que no se pueda dividir mas, el
	 * resto que obtengamos de cada división formara el numero binario, de abajo a
	 * arriba.
	 */

	static String stackToString(Stack<String> stack) {
		String cadena = "";

		while (!stack.empty()) {
			cadena = cadena + stack.pop() ;
		}

		return cadena;
	}

	static String decimalToBinario(int num) {
		Stack<String> numBinario = new Stack<String>();

		while (num > 1) {
			if (num == 1)
				numBinario.add(Integer.toString(num));
			else {
				numBinario.add(Integer.toString(num % 2));
				num = num / 2;
			}
		}
		numBinario.add(Integer.toString(num));
		return stackToString(numBinario);
	}

	public static void main() {
		int numABinario = Integer.parseInt(JOptionPane.showInputDialog("Dame un número y te lo doy en binario."));
		JOptionPane.showMessageDialog(null, numABinario + " es en binario = " + decimalToBinario(numABinario));
	}

}
