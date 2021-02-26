/**
 * 
 */
package ejercicios;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio5 extends EjercicioX {

	@Override
	protected String cargarNombreDB() {
		return "LosDirectores";
	}

	/**
	 * valoresBruto formato --> NombreTabla1:Atributo1, ... ,AtributoN;PK1, ... , PKn;FK1 , ... , FKn 
	 * 							+ ... 
	 * 							+ NombreTablaN:... 
	 * @param valoresBruto
	 */
	
	@Override
	protected String cargarTablas() {
		return 
			"Despachos:"
				+ "Numero INT,"
				+ "Capacidad INT;"
				+ "Numero"
			+ "+Directores:"
				+ "DNI  VARCHAR(8),"
				+ "NomApels VARCHAR(255),"
				+ "FK_codigo_Despacho INT NULL,"
				+ "FK_codigo_DNIJefe VARCHAR(8);"
				+ "DNI;"
				+ "FK_codigo_Despacho|Despachos|Numero,"
				+ "FK_codigo_DNIJefe|Directores|DNI";
	}

	/**
	 * Método que inserta los datos pasados
	 * Datos formato --> NombreTabla(Atributo1,..., AtributoN): A1 = valor1,...,valorN  ; ... ; An = valor1,...,valorN + ... + NombreTablaN:...
	 * 															Siendo Ax, un conjunto de valores que se quiere ingresar.
	 * @param datos
	 */
	
	
	@Override
	protected String cargarDatos() {
		return 
				this.getNombreDB()+
				".Despachos(Numero,Capacidad):"
						+ "1,50;"
						+ "2,10;"
						+ "3,25;"
						+ "4,5;"
						+ "5,2"
						+ "+" 
				+ this.getNombreDB()+
				".Directores(DNI,NomApels,FK_codigo_Despacho,FK_codigo_DNIJefe):"
						+ "79033066,G-Man,1,79033066;"
						+ "10284470,Gordon Freeman,1,79033066;"
						+ "83225367,Albert Einstein,2,83225367;"
						+ "38444048,Isaac Newton,3,83225367;"
						+ "40219395,Stephen Hawking,2,83225367";
	}

}
