package main;
import views.*;



/**
 * @author Miguel A. Sastre
 *
 */	
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("prueb");
		
		String prueba = "Tabla1:Atributo1,Atributo2,Atributo3;ClavePrimera1;FK1|tablaRef|IdRef,FK2|tablaRef|IdRef,FK3|tablaRef|IdRef"
				+ "+Tabla2:Atributo1,Atributo2,Atributo3;ClavePrimera1;FK1,FK2,FK3";
		String tablasSeparadas [] = prueba.split("\\+");
		
		
		
		String nombreValores [] = tablasSeparadas[0].split(":");
		String camposSeparados [] = nombreValores[1].split(";");
		
		String atributos [] = camposSeparados[0].split(",");
		String PK [] = camposSeparados[1].split(",");
		String FK [] = 	camposSeparados[2].split(",");
		String valorFK [] = FK[0].split("\\|");
		
		System.out.println(prueba.substring(0, prueba.length()-1) + ")");
		MenuDB.iniciar();
	}

}
