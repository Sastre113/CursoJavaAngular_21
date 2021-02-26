/**
 * 
 */
package ejercicios;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio2 extends EjercicioX {

	@Override
	protected String cargarNombreDB() {
		return "LosEmpleados";
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
			"Departamentos:"
				+ "Codigo INT,"
				+ "Nombre VARCHAR(100),"
				+ "Presupuesto INT;"
				+ "Codigo"
			+ "+Empleados:"
				+ "DNI VARCHAR(8),\n"
				+ "Nombre VARCHAR(100),\n"
				+ "Apellidos VARCHAR(255),\n"
				+ "FK_codigo_Departamentos INT NULL;"
				+ "DNI; "
				+ "FK_codigo_Departamentos|Departamentos|Codigo";
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
				".Departamentos(codigo,nombre,presupuesto):"
						+ "1,Black Mesa, 76000;"
						+ "2,Aperture Science, 150000;"
						+ "3,Wasterlands, 25000;"
						+ "4,Screw,50000;"
						+ "5,Nostromos,250000"
						+ "+" 
				+ this.getNombreDB()+
				".Empleados(dni,nombre,apellidos,FK_codigo_Departamentos):"
						+ "79033066,Gordon,Freeman,1;"
						+ "10284470,G-,Man,1;"
						+ "83225367,Albert,Einstein,3;"
						+ "38444048,Isaac,Newton,2;"
						+ "63773951,Marie,Curie,3";
	}

}
