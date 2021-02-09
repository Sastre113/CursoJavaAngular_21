/**
 * 
 */
package ejercicio1;


/**
 * @author Miguel A. Sastre
 *
 */
public class MainApp {

	
	private static Electrodomestico [] cargarArray() {
		Electrodomestico [] electrodomestico = new Electrodomestico [10];
		
		electrodomestico[0] = new Lavadora();
		electrodomestico[1] = new Television();
		electrodomestico[2] = new Electrodomestico(200,"Morado",'A',70);
		electrodomestico[3] = new Lavadora(200,30);
		electrodomestico[4] = new Television(50,true);
		electrodomestico[5] = new Electrodomestico(200,"Negro",'E',70);
		electrodomestico[6] = new Lavadora(50);
		electrodomestico[7] = new Television(60,false);
		electrodomestico[8] = new Electrodomestico(150,35);
		electrodomestico[9] = new Television(200,32);
		
		return electrodomestico;
	}
	
	
	private static String calcularPrecioFinal(Electrodomestico [] electrodomestico) {	
		double precioFinal = 0 , precioLavadoras = 0, precioTelevisores = 0;
			
		
		for(int i = 0; i < electrodomestico.length; i++) {
			precioFinal += electrodomestico[i].precioFinal();
			
			if(electrodomestico[i] instanceof Lavadora)
				precioLavadoras += electrodomestico[i].precioFinal();
			
			if(electrodomestico[i] instanceof Television)
				precioTelevisores += electrodomestico[i].precioFinal();
		}
	
		return "Precio total de todos los Electrodomestico: " + precioFinal + "\n" + 
		"Precio total de todos los Lavadora: " + precioLavadoras + "\n" + 
		"Precio total de todos los Television: " + precioTelevisores;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Electrodomestico [] electrodomestico = cargarArray();
		
		System.out.println("Estado inicial de los electrodomesticos");
		for(int i = 0; i < electrodomestico.length; i++)
			System.out.println(electrodomestico[i]);
		
		System.out.println(calcularPrecioFinal(electrodomestico));
	}

}
