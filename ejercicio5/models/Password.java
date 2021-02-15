/**
 * 
 */
package models;

import java.util.LinkedList;
import java.util.Random;

/**
 * @author Miguel A. Sastre
 *
 */
public class Password {
	
	protected static final int DEFAULT_LENGTH = 8;
	protected int longitud;
	protected String contraseña;
	
	/**
	 * Constructor por defecto.
	 */
	
	public Password() {
		this(DEFAULT_LENGTH);
	}
	
	/**
	 * Constructor con longitud como argumento pasado.
	 * @param longitud
	 * @param contraseña
	 */
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarPassword();
	}
	
	/**
	 * Comprueba si la contraseña es fuerte.
	 * Para considerarla fuerte debe cumplir el siguiente criterio:
	 * 	· 2 más mayúsculas.
	 *  · 1 más minúsculas.
	 *  · 5 más números.
	 * 
	 * @return True si se cumple la condición.
	 */
	public boolean esFuerte() {
		boolean esFuerte = false;
		char [] array = this.getContraseña().toCharArray();
		int minuscula = 0,mayuscula = 0,numero = 0;

		for(int i = 0; i < this.getLongitud(); i++) {
			int charElegido = array[i];
			
			if(charElegido > 96 && charElegido < 123)
				minuscula++;
			if(charElegido > 64 && charElegido < 91)
				mayuscula++;
			else
				numero++;
		}
		
		return (minuscula > 1 && mayuscula > 2 && numero > 5) ? true:false;
	}
	
	/**
	 * Método que generá una contraseña aleatoria.
	 * El algoritmo primero generá una elección del tipo de caracter alfanumerico 
	 * corresponderá, para luego generar uno aleatorio de ese tipo.
	 * 
	 * @return String Contraseña
	 */
	public String  generarPassword() {
		String pass = "";
		int tipoChar;
		LinkedList<Pair<Integer,Integer>> rango = new LinkedList<Pair<Integer,Integer>>(){{
			add(new Pair(48,57)); // Números
			add(new Pair(65,90)); // Letras maýusculas
			add(new Pair(97,122)); // Letras minúsculas
		}};
	
		for(int i = 0; i < this.getLongitud(); i++) {
			tipoChar = new Random().nextInt(3);
			pass += (char) (new Random().nextInt(rango.get(tipoChar).getRight() - rango.get(tipoChar).getLeft())
					+ rango.get(tipoChar).getLeft());
		}
		
		return pass;
	}
	
	
	/**
	 * @return the longitud
	 */
	
	public int getLongitud() {
		return longitud;
	}
	
	/**
	 * @param longitud the longitud to set
	 */
	
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	/**
	 * @return the contraseña
	 */
	
	public String getContraseña() {
		return contraseña;
	}

	@Override
	public String toString() {
		return "La contraseña: " + this.getContraseña() + "\nCon longitud: " + this.getLongitud() + "\n¿Se considera fuerte?: " + this.esFuerte();
	}
	
	
	
}
