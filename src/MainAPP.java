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

	public static void main(String[] args) {

		String todasOpciones[] = autoGenerarOpciones(12);
		boolean exit = false;
		do {
			Object opcion = JOptionPane.showInputDialog(null, "Selecciona un ejercicio", "Elegir",
					JOptionPane.QUESTION_MESSAGE, null, todasOpciones, todasOpciones[0]);

			if (opcion != null) {
				int opcionElegida = Integer.parseInt(opcion.toString().substring(10, 12));
				System.out.println("Opcion elegida "+ opcionElegida);

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
				default:
					System.out.println(opcionElegida);
					break;
				}
			} else
				exit = true;
			
		} while (!exit);

	}

}
