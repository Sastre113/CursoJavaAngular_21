/**
 * 
 */
package ejercicios;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio8 extends EjercicioX {

	@Override
	protected String cargarNombreDB() {
		return "LosGrandesAlmacenes";
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
			"Productos:"
				+ "Codigo INT AUTO_INCREMENT,"
				+ "Nombre VARCHAR(100),"
				+ "Precio INT;"
				+ "Codigo"
			+ "+Cajeros:"
				+ "Codigo INT AUTO_INCREMENT,"
				+ "NomApels VARCHAR(255);"
				+ "Codigo"
			+ "+Maquinas_Registradoras:"
				+ "Codigo INT AUTO_INCREMENT,"
				+ "Piso INT;"
				+ "Codigo"
			+ "+Asignado_A:"
				+ "FK_Cajeros_Cajero INT,"
				+ "FK_Maquinas_Registradoras_Maquina INT,"
				+ "FK_Productos_Producto INT;"
				+ "FK_Cajeros_Cajero,FK_Maquinas_Registradoras_Maquina,FK_Productos_Producto;"
				+ "FK_Cajeros_Cajero|Cajeros|Codigo,"
				+ "FK_Maquinas_Registradoras_Maquina|Maquinas_Registradoras|Codigo,"
				+ "FK_Productos_Producto|Productos|Codigo";
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
				".Productos(Nombre,Precio):"
						+ "Manipulador de Campos de Energía Cero,10;"
						+ "Quantum Destabilize,50;"
						+ "Overwatch Standard Issue Pulse Rifle,150;"
						+ "XVL1456,520;"
						+ "Fat-man,1500"
						+ "+" 
				+ this.getNombreDB()+
				".Cajeros(NomApels):"
						+ "G-Man;"
						+ "Gordon Freeman;"
						+ "Albert Einstein;"
						+ "Isaac Newton;"
						+ "Stephen Hawking"
						+ "+" 
				+ this.getNombreDB()+
				".Maquinas_Registradoras(Piso):"
						+ "1;"
						+ "1;"
						+ "2;"
						+ "3;"
						+ "3"
						+ "+" 
				+ this.getNombreDB()+
				".Asignado_A(FK_Cajeros_Cajero,FK_Maquinas_Registradoras_Maquina,FK_Productos_Producto):"
						+ "1,1,1;"
						+ "1,1,5;"
						+ "3,3,4;"
						+ "4,4,3;"
						+ "5,5,2";
	}

}
