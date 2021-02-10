package Main;

import Models.Cine;
import Models.Espectador;
import Models.Pelicula;

/**
 * @author Miguel A. Sastre
 *
 */

public class MainApp {	
	public static void main(String[] args) {
		Cine sala1 = new Cine(new Pelicula("Mad Max",2.45,18,"George Miller"), 4.5);
		
		sala1.sentarUsuario("5E", new Espectador("Geralt",113,150));
		sala1.sentarUsuario("8I", new Espectador("Yennefer",98,20));
		sala1.sentarUsuario("1A", new Espectador("Yaskier",32,6));
		sala1.sentarUsuario("2I", new Espectador("Zoltan",72,4)); // No podrá entrar, no tiene suficiente dinero.
		sala1.sentarUsuario("1A", new Espectador("Ciri",72,10));  // 1A esta ocupada, ocupará 1B
		sala1.sentarUsuario("5E", new Espectador("Emiel Regis Rohellec Terzieff-Godefroy",72,10)); //  5E esta ocupada, ocupará 1C
		System.out.println(sala1.toString());
	}
}
