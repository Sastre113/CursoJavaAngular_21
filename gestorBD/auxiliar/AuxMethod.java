package auxiliar;
import javax.swing.JOptionPane;

/**
 * @author Miguel A. Sastre
 *
 */

public class AuxMethod {
	
	public static int menuEjercicios(int numEjercicios, String textoSeleccion, String textoTitulo) {
		int opcionElegida;
		String todasOpciones[] = AuxMethod.autoGenerarOpciones(numEjercicios);
		Object opcion = JOptionPane.showInputDialog(null,textoSeleccion , textoTitulo ,
				JOptionPane.QUESTION_MESSAGE, null, todasOpciones, todasOpciones[0]);
		
		if(opcion == null)
			opcionElegida = -1;
		else
			opcionElegida = Integer.parseInt(opcion.toString().substring(10, 12));
		
		return opcionElegida;
	}
	
	
	public static Object menuDesplegable(String [] opciones) {
		Object opcion = JOptionPane.showInputDialog(null, "Selecciona un ejercicio", "Elegir",
				JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		return opcion;
	}
	
	
	public static String[] autoGenerarOpciones(int size) {
		String[] options = new String[size];
		for (int i = 0; i < size; i++) {
			if (i < 9)
				options[i] = "Ejercicio 0" + (i + 1);
			else
				options[i] = "Ejercicio " + (i + 1);
		}
		return options;
	}
	

	public static boolean esNumero(String strNum) {
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
	
	public static String solicitarDatosString(String texto) {
		return JOptionPane.showInputDialog(texto);
	}
	
	public static int solicitarDatosInt(String texto) {
		String strNum = "";
		do {
			strNum = JOptionPane.showInputDialog(texto);
		} while (!esNumero(strNum));
		return Integer.parseInt(strNum);
	}
	
	public static double solicitarDatosDouble(String texto) {
		String strNum = "";
		do {
			strNum = JOptionPane.showInputDialog(texto);
		} while (!esNumero(strNum));
		return Double.parseDouble(strNum);
	}
	
	public static void mostrarInfo(String text) {
		JOptionPane.showMessageDialog(null, text);
	}
	
	public static int darOpciones(String [] opciones) {
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
	
	public static int darOpciones(String [] opciones, String textoOpciones) {
		int opcion = JOptionPane.showOptionDialog(
				   null,
				   textoOpciones, 
				   "Selector de opciones",
				   JOptionPane.YES_NO_CANCEL_OPTION,
				   JOptionPane.QUESTION_MESSAGE,
				   null, 
				   opciones,   
				   opciones[0]);
		return opcion;
	}
	


}