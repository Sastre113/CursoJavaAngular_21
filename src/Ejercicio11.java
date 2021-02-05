import javax.swing.JOptionPane;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio11 {
	/*
	 * 11) Crea dos arrays de números con la dimensión pasada por teclado. Uno de
	 * ellos estará rellenado con números aleatorios y el otro apuntara al array
	 * anterior, reasigna los valores del segundo array con valores aleatorios.
	 * Después, crea un método que tenga como parámetros, los dos arrays y devuelva
	 * uno nuevo con la multiplicación de la posición 0 del array1 con el del array2
	 * y así sucesivamente. Por último, muestra el contenido de cada array
	 */

	static int [] proArray(int array1 [],int array2 []){
		int newArray [] = new int [array1.length];
		
		for(int i = 0; i < array1.length; i++)
			newArray[i] = array1[i] * array2[i];
		
		return newArray;
	}

	public static void main() {
		JOptionPane.showMessageDialog(null, "Aviso: Este ejercicio muestra resultados por consola");
		// Voy a reutilizar los metodos auxiliares de ejercicios anteriores.
		int sizeArray = Ejercicio10
				.esNumero(JOptionPane.showInputDialog("Introduce el tamaño deseado para el array"));

		int array1[] = Ejercicio10.generarArrayNumRandom(1, 100, sizeArray);
		int array2[] = array1; // ¿El ejercicio pide apuntar por referencia a otro array?

		array2 = Ejercicio10.generarArrayNumRandom(1, 100, sizeArray);

		int newArray[] = proArray(array1, array2);
		System.out.println("Array1");
		Ejercicio10.mostrarArray(array1);
		System.out.println("Array2");
		Ejercicio10.mostrarArray(array2);
		System.out.println("Nuevo Array");
		Ejercicio10.mostrarArray(newArray);
	}

}
