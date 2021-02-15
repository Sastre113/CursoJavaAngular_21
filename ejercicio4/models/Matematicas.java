/**
 * 
 */
package models;

import excepcion.ExcepcionMatematica;

/**
 * @author Miguel A. Sastre
 *
 */
public class Matematicas {
	
	public static int sumaEntera(int a, int b) {
		return a + b;
	}
	
	public static int sumaPositiva(int a, int b) throws ExcepcionMatematica {
		if(a < 0 || b < 0)
			throw new ExcepcionMatematica(a,b);

		return a + b;
	}
	
	public static int sumaNegativa(int a, int b) throws ExcepcionMatematica {
		if(a > 0 || b > 0)
			throw new ExcepcionMatematica(a,b);

		return a - b;
	}
	
	public static int multiplicacionPositiva(int a, int b) throws ExcepcionMatematica {
		if(a < 0 || b < 0)
			throw new ExcepcionMatematica(a,b);
		
		return a * b;
	}
		
	public static double division(int denominador, int numerador) {
		int division = 0;
		try {
			division = denominador/numerador;
		} catch (ArithmeticException e) {
			e.getMessage();
			e.printStackTrace();
		}
		return division;
	}
	
	public static double raizCuadrada(double a) {
		double resultado = 0;
		try {
			resultado = Math.sqrt(a);
			if(Double.isNaN(resultado))
				throw new ArithmeticException();
		} catch (ArithmeticException e) {
			e.getCause();
			e.printStackTrace();
		}
		
		return resultado;
	}
}
