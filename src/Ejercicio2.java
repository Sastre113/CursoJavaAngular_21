import java.util.Random;

import javax.swing.JOptionPane;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio2 {
	/*
	 * 2) Crea una aplicación que nos genere una cantidad de números enteros
	 * aleatorios que nosotros le pasaremos por teclado. 
	 * Crea un método donde pasamos como parámetros entre que números queremos que los genere, podemos
	 * pedirlas por teclado antes de generar los números. Este método devolverá un
	 * número entero aleatorio. Muestra estos números por pantalla.
	 * 
	 */
	
	
	static int random() {
		int rangoInf =  Integer.parseInt(JOptionPane.showInputDialog("Dame un rango [a , b] (Nº enteros). Dame a = ?"));
		int rangoSup =  Integer.parseInt(JOptionPane.showInputDialog("Dame un rango [" + rangoInf + " , b]. Dame b = ?"));
		Random numRandom = new Random();
		
		
		return numRandom.nextInt(rangoSup-rangoInf) + rangoInf;
	}
	
	
	
	public static void main() {
		JOptionPane.showMessageDialog(null, "Voy a generar un número aleatorio");
		JOptionPane.showMessageDialog(null, "El número aleatorio generado es  " + random());
	}

}
