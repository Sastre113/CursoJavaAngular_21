package ejercicio4;

/**
 * @author Miguel A. Sastre
 *
 */

public class MainApp {	
	public static void main(String[] args) {
		Raices test1 = new Raices(6,-5,1);
		Raices test2 = new Raices(1,-2,1);
		Raices test3 = new Raices(1,1,1);
		
		System.out.println("Test1: ");
		test1.calcular(); // x1 = 6/12 = 0.5  , x2 = 4/12 = 0.333..
		System.out.println("Test2: ");
		test2.calcular(); // x1 = 1
		System.out.println("Test3: ");
		test3.calcular(); // No tiene solución real.
		
	}
}
