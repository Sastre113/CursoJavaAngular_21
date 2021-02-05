import javax.swing.JOptionPane;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio8 {

	/*
	 * 8) Crea un array de 10 posiciones de números con valores pedidos por teclado.
	 * Muestra por consola el indice y el valor al que corresponde. Haz dos métodos,
	 * uno para rellenar valores y otro para mostrar.
	 * 
	 */

	static double[] introducirValores() {
		double arrayNum[] = new double[10];

		for (int i = 0; i < 10; i++) {
			arrayNum[i] = MainAPP.esNumeroDouble(JOptionPane.showInputDialog("Faltan " + (10 - i) + " números por introducir"));
		}

		return arrayNum;
	}

	static void mostrarArray(double[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.println("Posición " + i + ": " + array[i]);
	}

	public static void main() {
		JOptionPane.showMessageDialog(null, "Aviso: Este ejercicio muestra el resultado por consola");
		mostrarArray(introducirValores());
	}

}
