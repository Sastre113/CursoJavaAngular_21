import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Miguel A. Sastre
 *
 */
public class MainAPP {

	static String[] autoGenerarOpciones(int size) {
		String[] options = new String[size];

		for (int i = 0; i < size; i++) {
			if (i < 9)
				options[i] = "Ejercicio 0" + (i + 1);
			else
				options[i] = "Ejercicio " + (i + 1);
		}

		return options;
	}

	public static int esNumeroInt(String strNum) {
		int auxNum;

		if (strNum == null) {
			auxNum = 1;
			System.err.println(strNum + " no es número valido, se usará 1.");
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

	public static double esNumeroDouble(String strNum) {
		double auxNum;

		if (strNum == null) {
			auxNum = 1.0;
			System.err.println(strNum + " no es número valido, se usará 1.");
		}
			
		else
			try {
				auxNum = Double.parseDouble(strNum);
			} catch (NumberFormatException e) {
				System.err.println(strNum + " no es número valido, se usará 1.");
				auxNum = 1.0;
			}

		return auxNum;
	}
	
	static void mostrarArray(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Posición " + i + ": " + array[i]);
		}
	}
	
	static boolean esPrimo(int num) {
		int punt = 2;
		boolean esPrimo = true;
		num = Math.abs(num);
		
		
		if(punt < num)
			do {
				esPrimo = ((num%punt) == 0) ? false: true;
				punt++;
			} while (esPrimo && (punt < num));	
		else if (num == 0 || num == 1)
			esPrimo = false;
		
		return esPrimo;
	}

	public static void main(String[] args) {

		String todasOpciones[] = autoGenerarOpciones(12);
		boolean exit = false;
		do {
			Object opcion = JOptionPane.showInputDialog(null, "Selecciona un ejercicio", "Elegir",
					JOptionPane.QUESTION_MESSAGE, null, todasOpciones, todasOpciones[0]);

			if (opcion != null) {
				int opcionElegida = Integer.parseInt(opcion.toString().substring(10, 12));
				System.out.println("Opcion elegida " + opcionElegida);

				switch (opcionElegida) {
				case 1:
					Ejercicio1.main();
					break;
				case 2:
					Ejercicio2.main();
					break;
				case 3:
					Ejercicio3.main();
					break;
				case 4:
					Ejercicio4.main();
					break;
				case 5:
					Ejercicio5.main();
					break;
				case 6:
					Ejercicio6.main();
					break;
				case 7:
					Ejercicio7.main();
					break;
				case 8:
					Ejercicio8.main();
					break;
				case 9:
					Ejercicio9.main();
					break;
				case 10:
					Ejercicio10.main();
					break;
				case 11:
					Ejercicio11.main();
					break;
				case 12:
					Ejercicio12.main();
					break;
				}
			} else
				exit = true;

		} while (!exit);

	}

}
