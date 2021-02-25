/**
 * 
 */
package views;

import auxiliar.AuxMethod;
import models.GestorDB;

/**
 * @author Miguel A. Sastre
 *
 */
public class MenuDB {
	protected static GestorDB miGestor;
	
	public static void iniciar() {
		miGestor = new GestorDB();
		int opcion = -1, intentos = 0;
		boolean exit = false;
		
		
		do {
			if(intentos == 9) {
				if(AuxMethod.darOpciones(new String [] {"Reintentar conexión","Salir"}) == 1)
					exit = true;
			} else
				miGestor.conectar();
			
			if(miGestor.estaConectado()) {
				opcion = AuxMethod.menuEjercicios(9, "Elige un ejercicio", "Opciones");
				switch(opcion) {
				case 1:
					break;
				default:
					miGestor.desconectar();
					AuxMethod.mostrarInfo("Desconectado del servidor\n¡Hasta pronto!");
					exit = true;
				}
			} else
				intentos++;
				
		}while(!exit);
	}	
}
