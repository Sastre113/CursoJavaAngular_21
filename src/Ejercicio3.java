import javax.swing.JOptionPane;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio3 {
	/*
	 * 3) Crea una aplicación que nos pida un número por teclado y con un método se
	 * lo pasamos por parámetro para que nos indique si es o no un número primo,
	 * debe devolver true si es primo sino false. Un número primo es aquel solo
	 * puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es primo, ya que 25 es
	 * divisible entre 5, sin embargo, 17 si es primo.
	 */
	
	static boolean esPrimo(int num) {
		int punt = 2;
		boolean esPrimo = true;
		
		if(punt < num)
			do {
				esPrimo = (((Math.abs(num))%punt) == 0) ? false: true;
				punt++;
			} while (esPrimo && (punt < num));	
		else if (num == 0 || num == 1)
			esPrimo = false;
		
		return esPrimo;
	}
	
	public static void main() {
		int numPrimo =  Integer.parseInt(JOptionPane.showInputDialog("Dame un número y te digo si es primo(Debe ser un nº entero)"));
		
		if(esPrimo(numPrimo))
			JOptionPane.showMessageDialog(null, numPrimo + " es un número primo");
		else
			JOptionPane.showMessageDialog(null, numPrimo + " NO es un número primo");
	}
}
