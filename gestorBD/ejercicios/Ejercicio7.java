/**
 * 
 */
package ejercicios;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio7 extends EjercicioX {

	@Override
	protected String cargarNombreDB() {
		return "LosCientificos";
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
			"Proyecto:"
				+ "Id CHAR(4),"
				+ "Nombre VARCHAR(255),"
				+ "Horas INT;"
				+ "Id"
			+ "+Cientificos:"
				+ "DNI  VARCHAR(8),"
				+ "NomApels VARCHAR(255);"
				+ "DNI"
			+ "+Asignado_A:"
				+ "FK_Cientificos_DNI VARCHAR(8),"
				+ "FK_Proyecto_Id CHAR(4);"
				+ "FK_Cientificos_DNI,FK_Proyecto_Id;"
				+ "FK_Proyecto_Id|Proyecto|Id,"
				+ "FK_Cientificos_DNI|Cientificos|DNI";
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
				".Proyecto(Id,Nombre,Horas):"
						+ "G98M,Manipulador de Campos de Energía Cero,10;"
						+ "GL23,Quantum Destabilize,50;"
						+ "OSIP,Overwatch Standard Issue Pulse Rifle,150;"
						+ "TAU0,XVL1456,520;"
						+ "BFG5,Fat-man,2"
						+ "+" 
				+ this.getNombreDB()+
				".Cientificos(DNI,NomApels):"
						+ "83225367,G-Man;"
						+ "10284470,Gordon Freeman;"
						+ "38444048,Albert Einstein;"
						+ "40219395,Isaac Newton;"
						+ "79260594,Stephen Hawking"
						+ "+" 
				+ this.getNombreDB()+
				".Asignado_A(FK_Cientificos_DNI,FK_Proyecto_Id):"
						+ "83225367,G98M;"
						+ "10284470,G98M;"
						+ "38444048,BFG5;"
						+ "40219395,TAU0;"
						+ "79260594,TAU0";
	}

}
