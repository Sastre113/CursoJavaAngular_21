import javax.swing.JOptionPane;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio4 {
	/*
	 * 4) Crea una aplicación que nos calcule el factorial de un número pedido por
	 * teclado, lo realizara mediante un método al que le pasamos el número como
	 * parámetro. Para calcular el factorial, se multiplica los números anteriores
	 * hasta llegar a uno. Por ejemplo, si introducimos un 5, realizara esta
	 * operación 5*4*3*2*1=120.
	 */
	
	// Método recursivo
	static int factorialRecursivo(int numDado){
		int num = Math.abs(numDado);
        if ( num <= 1 ) {
            return 1;
        } else {
            return num*factorial(num-1);
        }
   }
	
	// Método no recursivo
	static int factorial(int num) {
		int numFac = 1;
		
		for(int i = 1; i <= num; i++)
			numFac = i * numFac;
		
		return numFac;
	}
	
	public static void main() {
		int numFac =  Integer.parseInt(JOptionPane.showInputDialog("Dame un número y te calculo su factorial"));
		JOptionPane.showMessageDialog(null, "Su factorial es " + factorialRecursivo(numFac));

	}

}
