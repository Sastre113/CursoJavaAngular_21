import javax.swing.JOptionPane;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio7 {
	/*
	 * 7) Crea un aplicación que nos convierta una cantidad de euros introducida por
	 * teclado a otra moneda, estas pueden ser a dolares, yenes o libras. El método
	 * tendrá como parámetros, la cantidad de euros y la moneda a pasar que sera una
	 * cadena, este no devolverá ningún valor, mostrara un mensaje indicando el
	 * cambio (void). El cambio de divisas son:  0.86 libras es un 1 € 1.28611
	 * $ es un 1 € 129.852 yenes es un 1 €
	 */
	
	
	static void cambioDivisa(double euros, double cambio, String signo ) {
		JOptionPane.showMessageDialog(null, euros + "€ equivale a " + euros*cambio + signo );
	}
	
	public static void main() {
		String [] todasOpciones = {"Dolares","Yenes","Libras"};
		Object opcion = JOptionPane.showInputDialog(null, "Elige a que moneda quieres cambiar tus euros", "Elegir",
				JOptionPane.QUESTION_MESSAGE, null, todasOpciones, todasOpciones[0]);
		int euros =  Math.abs(Integer.parseInt(JOptionPane.showInputDialog("Dame la cifra en euros"))); 
		
		switch(opcion.toString()) {
		case "Dolares":
			cambioDivisa(euros,1.28611,"$");
			break;
		case "Yenes":
			cambioDivisa(euros,129.852,"¥");
			break;
		case "Libras":
			cambioDivisa(euros,0.86,"£");
			break;
		}
	}

}
