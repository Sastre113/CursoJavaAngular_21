/**
 * 
 */
package excepcion;

/**
 * @author Miguel A. Sastre
 *
 */
public class excepcionParImpar extends Exception{

	protected int number;
	
	
	/**
	 * @param numero
	 */
	public excepcionParImpar(int numero) {
		this.number = numero;
	}
	
	
	public String getParidad() {
		return (this.number%2 == 0) ? "Es par" : "Es impar";
	}
	
}
