/**
 * 
 */
package ejercicios;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio3 extends EjercicioX {

	@Override
	protected String cargarNombreDB() {
		return "LosAlmacenes";
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
			"Almacenes:"
				+ "Codigo INT AUTO_INCREMENT,"
				+ "Lugar VARCHAR(100),"
				+ "Capacidad INT;"
				+ "Codigo"
			+ "+Cajas:"
				+ "numreferencia CHAR(5),"
				+ "contenido VARCHAR(100),"
				+ "valor INT,"
				+ "FK_codigo_Almacenes INT NULL;"
				+ "numreferencia;"
				+ "FK_codigo_Almacenes|Almacenes|Codigo";
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
				".Almacenes(lugar,capacidad):"
						+ "Black Mesa, 10;"
						+ "Aperture Science, 15;"
						+ "Wasterlands, 5;"
						+ "Screw,7;"
						+ "Nostromos,6"
						+ "+" 
				+ this.getNombreDB()+
				".Cajas(numreferencia,contenido,valor,FK_codigo_Almacenes):"
						+ "GAWYB,Tijeras,50,2;"
						+ "35YET,Piedras,150,5;"
						+ "A56GH,Papel,20,1;"
						+ "QM773,Tijeras,70,2;"
						+ "XYK3S,Piedras,100,3";
	}

}
