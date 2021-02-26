/**
 * 
 */
package ejercicios;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio6 extends EjercicioX {

	@Override
	protected String cargarNombreDB() {
		return "LasPiezasYProveedores";
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
			"Piezas:"
				+ "Codigo INT AUTO_INCREMENT,"
				+ "Nombre VARCHAR(100);"
				+ "Codigo"
			+ "+Proveedores:"
				+ "ID  CHAR(4),"
				+ "Nombre VARCHAR(100);"
				+ "ID"
			+ "+Suministra:"
				+ "FK_codigo_CodigoPieza INT UNIQUE,"
				+ "FK_ID_IdProveedor CHAR(4),"
				+ "Precio INT;"
				+ "FK_codigo_CodigoPieza,FK_ID_IdProveedor;"
				+ "FK_codigo_CodigoPieza|Piezas|Codigo,"
				+ "FK_ID_IdProveedor|Proveedores|ID";
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
				".Piezas(Nombre):"
						+ "Manipulador de Campos de Energía Cero;"
						+ "Quantum Destabilize;"
						+ "Overwatch Standard Issue Pulse Rifle;"
						+ "XVL1456;"
						+ "Fat-man"
						+ "+" 
				+ this.getNombreDB()+
				".Proveedores(ID,Nombre):"
						+ "G98M,G-Man;"
						+ "GL23,Gordon Freeman;"
						+ "OSIP,Albert Einstein;"
						+ "TAU0,Isaac Newton;"
						+ "BFG5,Stephen Hawking"
						+ "+" 
				+ this.getNombreDB()+
				".Suministra(FK_codigo_CodigoPieza,FK_ID_IdProveedor,Precio):"
						+ "1,G98M,100;"
						+ "2,GL23,50;"
						+ "3,OSIP,200;"
						+ "4,TAU0,30;"
						+ "5,BFG5,25";
	}

}
