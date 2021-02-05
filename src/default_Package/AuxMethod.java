package default_Package;

import javax.swing.JOptionPane;

public class AuxMethod {
	
	static void menu(int numEjercicios) {

		String todasOpciones[] = autoGenerarOpciones(numEjercicios);
		boolean exit = false;
		do {
			Object opcion = JOptionPane.showInputDialog(null, "Selecciona un ejercicio de la UD7", "UD7",
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
				}
			} else
				exit = true;

		} while (!exit);
	}
	
	
	static private String[] autoGenerarOpciones(int size) {
		String[] options = new String[size];

		for (int i = 0; i < size; i++) {
			if (i < 9)
				options[i] = "Ejercicio 0" + (i + 1);
			else
				options[i] = "Ejercicio " + (i + 1);
		}

		return options;
	}
	

	static private boolean esNumero(String strNum) {
		boolean esNum = true;

		if (strNum == null) 
			esNum = false;
		else
			try {
				Double.parseDouble(strNum);
			} catch (NumberFormatException e) {
				esNum = false;
			}

		return esNum;
	}
	
	static String solicitarDatosString(String texto) {
		return JOptionPane.showInputDialog(texto);
	}
	
	static int solicitarDatosInt(String texto) {
		String strNum = "";
		do {
			strNum = JOptionPane.showInputDialog(texto);
		} while (!esNumero(strNum));
		return Integer.parseInt(strNum);
	}
	
	static void mostrarInfo(String text) {
		JOptionPane.showMessageDialog(null, text);
	}
	
	static int darOpciones(String [] opciones) {
		int opcion = JOptionPane.showOptionDialog(
				   null,
				   "Eliga una opcion", 
				   "Selector de opciones",
				   JOptionPane.YES_NO_CANCEL_OPTION,
				   JOptionPane.QUESTION_MESSAGE,
				   null, 
				   opciones,   
				   opciones[0]);
		return opcion;
	}

}
