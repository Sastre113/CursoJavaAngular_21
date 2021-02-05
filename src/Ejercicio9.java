import java.util.Random;

import javax.swing.JOptionPane;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio9 {

	/*
	 * 9) Crea un array de números donde le indicamos por teclado el tamaño del
	 * array, rellenaremos el array con números aleatorios entre 0 y 9. Al final
	 * muestra por pantalla el valor de cada posición y la suma de todos los
	 * valores. Tareas a realizar: Haz un método para rellenar el array(que tenga
	 * como parámetros los números entre los que tenga que generar) y otro para
	 * mostrar el contenido y la suma del array.
	 */

	public static int esNumero(String strNum) {
		int auxNum;

		if (strNum == null)
			auxNum = 1;
		else
			try {
				auxNum = Integer.parseInt(strNum);
			} catch (NumberFormatException e) {
				auxNum = 1;
			}

		return auxNum;
	}

	static int[] introducirValores(int size) {
		Random numRandom = new Random();
		int arrayNum[] = new int[size];
		
		
		
		for (int i = 0; i < size; i++) {
			arrayNum[i] = numRandom.nextInt(9);
		}

		return arrayNum;
	}

	static void mostrarArray(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Posición " + i + ": " + array[i]);
			sum = sum + array[i];
		}
		System.out.println("La suma total es: " + sum);
			
	}

	public static void main() {
		JOptionPane.showMessageDialog(null, "Aviso: Este ejercicio muestra resultados por consola");
		int sizeArray = esNumero(JOptionPane.showInputDialog("Introduce el tamaño deseado para el array"));
		mostrarArray(introducirValores(sizeArray));

	}

}
