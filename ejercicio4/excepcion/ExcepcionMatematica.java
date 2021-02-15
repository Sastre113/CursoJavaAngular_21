/**
 * 
 */
package excepcion;

/**
 * @author Miguel A. Sastre
 *
 */
public class ExcepcionMatematica extends Exception {
	
	protected int a;
	protected int b;
	
	
	public ExcepcionMatematica(int a,int b) {
		this.a = a;
		this.b = b;
	}
	
	public void numeroPositivo() {
		if(this.a > 0)
			System.err.println("This number is positive: " + this.a);
		if(this.b > 0)
			System.err.println("This number is positive: " + this.b);
	}
	
	public void numeroNegativo() {
		if(this.a < 0)
			System.err.println("This number is negative: " + this.a);
		if(this.b < 0)
			System.err.println("This number is negative: " + this.b);
	}
	
}
