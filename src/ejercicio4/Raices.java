/**
 * 
 */
package ejercicio4;

/**
 * @author Miguel A. Sastre
 *
 */
public class Raices {

	protected double a, b , c;
	
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void obtenerRaices() {
		double formulaGeneralPositiva = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(a * 2),
				formulaGeneralNegativa = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(a * 2);
		System.out.println("Tiene 2 soluciones reales\n" + "Solución 1: " + formulaGeneralPositiva + "\nSolución 2: " + formulaGeneralNegativa);
	}
	
	public void obtenerRaiz() {
		double formulaGeneral = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(a * 2);
		System.out.println("Tiene una solución " + formulaGeneral);
	}
	
	public double getDiscriminante() {
		return Math.pow(this.b, 2) - 4 * this.a * this.c;
	}
	
	public boolean tieneRaices() {
		return this.getDiscriminante() > 0;
	}
	
	public boolean tieneRaiz() {
		return this.getDiscriminante() == 0;
	}
	
	public void calcular() {
		if(this.tieneRaiz())
			this.obtenerRaiz();
		else if (this.tieneRaices())
			this.obtenerRaices();	
		else
			System.out.println("La ecuación no posee soluciones reales");
	}
}
