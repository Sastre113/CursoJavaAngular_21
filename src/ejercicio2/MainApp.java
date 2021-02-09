/**
 * 
 */
package ejercicio2;


/**
 * @author Miguel A. Sastre
 *
 */

public class MainApp {
	
	private static Serie [] cargarSeries() {
		Serie [] series = new Serie[5];
		
		series[0] = new Serie();
		series[1] = new Serie("The Wire","David Simon");
		series[2] = new Serie("Firefly",1,"Sci-fi","Joss Whedon");
		series[3] = new Serie("Los soprano","David Chase");
		series[4] = new Serie("Los simpson",32,"Comedia","Matt Groening");

		return series;
	}
	
	private static Videojuego [] cargarVideojuegos() {
		Videojuego [] videojuegos = new Videojuego [5];
		
		videojuegos[0] = new Videojuego();
		videojuegos[1] = new Videojuego("The Witcher",350);
		videojuegos[2] = new Videojuego("GTA V",30,"FPS","Rockstar games");
		videojuegos[3] = new Videojuego("Half Life",5);
		videojuegos[4] = new Videojuego("World of Warcraft",100,"MMO","Blizzard");
		
		return videojuegos;
	}
	
	private static void cuentaEntregados(Serie[] entregado) {
		int cuenta = 0;
		for(int i = 0; i < entregado.length; i++) {
			if(entregado[i].isEntregado()) cuenta++;
		}
			System.out.println("Series entregadas : " + cuenta);
	}
	
	private static void cuentaEntregados(Videojuego[] entregado) {
		int cuenta = 0;
		for(int i = 0; i < entregado.length; i++) {
			if(entregado[i].isEntregado()) cuenta++;
		}
			System.out.println("Videojuegos entregados : " + cuenta);
	}
	
	private static void buscarMayor(Serie[] entregado) {
		int mayor = 0;
		
		for(int i = 1; i < entregado.length; i++) {
			if(entregado[mayor].compareTo(entregado[i].totalTemporadas) == 1)
				mayor = i;
				
		}
		
		System.out.println(entregado[mayor].toString());
	}
	
	private static void buscarMayor(Videojuego[] entregado) {
		int mayor = 0;
		
		for(int i = 1; i < entregado.length; i++) {
			if(entregado[mayor].compareTo(entregado[i].horas) == 1)
				mayor = i;
		}
		
		System.out.println(entregado[mayor].toString());
	}
	
	public static void main(String[] args) {
		Serie [] series = cargarSeries();
		Videojuego [] videojuegos = cargarVideojuegos();
		
		series[0].entregar();
		series[2].entregar();
		videojuegos[1].entregar();
		videojuegos[3].entregar();
		videojuegos[4].entregar();
		
		cuentaEntregados(series);
		cuentaEntregados(videojuegos);
		buscarMayor(series);
		buscarMayor(videojuegos);
		
	}
}
