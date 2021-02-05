import javax.swing.JOptionPane;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio6 {
	/*
	 * 6) Crea una aplicación que nos cuente el número de cifras de un número entero
	 * positivo (hay que controlarlo) pedido por teclado. Crea un método que realice
	 * esta acción, pasando el número por parámetro, devolverá el número de cifras.
	 */
	
	static int contarCifras(int numero) {
		return Integer.toString(Math.abs(numero)).length();
	}
	
	public static void main() {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Dame un número y te digo cuantas cifras tiene."));
		System.out.println(numero);
		JOptionPane.showMessageDialog(null, "El número dado tiene " + contarCifras(numero));
	}

}
