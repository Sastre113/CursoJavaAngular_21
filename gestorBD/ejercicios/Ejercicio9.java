/**
 * 
 */
package ejercicios;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio9 extends EjercicioX {

	@Override
	protected String cargarNombreDB() {
		return "LosInvestigadores";
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
			"Facultad:"
				+ "Codigo CHAR(4),"
				+ "Nombre VARCHAR(100);"
				+ "Codigo"
			+ "+Investigadores:"
				+ "DNI  VARCHAR(8),"
				+ "NomApels VARCHAR(255),"
				+ "FK_Investigadores_Facultad  CHAR(4);"
				+ "DNI;"
				+ "FK_Investigadores_Facultad|Facultad|Codigo"
			+ "+Equipos:"
				+ "NumSerie CHAR(4),"
				+ "Nombre VARCHAR(100),"
				+ "FK_Facultad CHAR(4);"
				+ "NumSerie;"
				+ "FK_Facultad|Facultad|Codigo"
				
			+ "+Reserva:"
				+ "FK_Investigadores_DNI VARCHAR(8),"
				+ "FK_Equipos_NumSerie CHAR(4),"
				+ "Comienzo DATETIME,"
				+ "Fin DATETIME;"
				+ "FK_Investigadores_DNI,FK_Equipos_NumSerie;"
				+ "FK_Investigadores_DNI|Investigadores|DNI,"
				+ "FK_Equipos_NumSerie|Equipos|NumSerie";
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
				".Facultad(Codigo,Nombre):"
						+ "1,Black Mesa;"
						+ "2,Manhattan;"
						+ "3,Woolsthorpe Manor;"
						+ "4,Oxford;"
						+ "5,Lambda"
						+ "+" 
				+ this.getNombreDB()+
				".Investigadores(DNI,NomApels,FK_Investigadores_Facultad):"
						+ "83225367,G-Man,1;"
						+ "10284470,Gordon Freeman,1;"
						+ "38444048,Albert Einstein,2;"
						+ "40219395,Isaac Newton,3;"
						+ "79260594,Stephen Hawking,5"
						+ "+" 
				+ this.getNombreDB()+
				".Equipos(NumSerie,Nombre,FK_Facultad):"
						+ "G98M,Manipulador de Campos de Energía Cero,1;"
						+ "GL23,Quantum Destabilize,1;"
						+ "OSIP,Overwatch Standard Issue Pulse Rifle,2;"
						+ "TAU0,XVL1456,3;"
						+ "BFG5,Fat-man,2"
						+ "+" 
				+ this.getNombreDB()+
				".Reserva(FK_Investigadores_DNI,FK_Equipos_NumSerie,Comienzo,Fin ):"
						+ "10284470,TAU0,2001-01-1,2001-03-30;"
						+ "38444048,G98M,1993-02-18,2001-01-1;"
						+ "79260594,BFG5,1945-06-12,2007-01-1;"
						+ "40219395,OSIP,1993-02-18,2000-02-18;"
						+ "83225367,GL23,1946-06-12,1993-02-18";
	}

}
