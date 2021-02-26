/**
 * 
 */
package ejercicios;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio1 extends EjercicioX {

	@Override
	protected String cargarNombreDB() {
		return "LaTiendaInformatica";
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
				"Fabricantes:"
				+ "	 CODIGO int NOT NULL AUTO_INCREMENT,\n"
				+ "  NOMBRE varchar(100) NOT NULL"
				+ ";CODIGO"
			+ "+Articulos:"
				+ "CODIGO int NOT NULL AUTO_INCREMENT,\n"
				+ "NOMBRE varchar(100) NOT NULL,\n"
				+ "PRECIO decimal(10,0) NOT NULL,\n"
				+ "FABRICANTE int NOT NULL;CODIGO;"
				+ "FABRICANTE|Fabricantes|CODIGO";
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
				this.getNombreDB()+".Fabricantes(NOMBRE):"
						+ 			"NVIDIA;"
						+ 			"AMD;"
						+ 			"INTEL;"
						+ 			"ASUS;"
						+ 			"MSI"
						+ "+" + this.getNombreDB()+".Articulos(NOMBRE,PRECIO,FABRICANTE):"
								+ "RTX 2070,600,1;"
								+ "RX 480,300,2;"
								+ "ROG POWER,180,3;"
								+ "K68,150,5;"
								+ "RTX 3080,900,1";
	}

}
