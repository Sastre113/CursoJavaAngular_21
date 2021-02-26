/**
 * 
 */
package ejercicios;

/**
 * @author Miguel A. Sastre
 *
 */
public class Ejercicio4 extends EjercicioX {

	@Override
	protected String cargarNombreDB() {
		return "PeliculasYSalas";
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
			"Peliculas:"
				+ "Codigo INT AUTO_INCREMENT,"
				+ "Nombre VARCHAR(100),"
				+ "CalificacionEdad INT;"
				+ "Codigo"
			+ "+Salas:"
				+ "Codigo INT AUTO_INCREMENT,"
				+ "Nombre VARCHAR(100),"
				+ "FK_codigo_Pelicula INT NULL;"
				+ "Codigo;"
				+ "FK_codigo_Pelicula|Peliculas|Codigo";
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
				".Peliculas(Nombre,CalificacionEdad):"
						+ "La comunidad del anillo, 7;"
						+ "La dos torres, 7;"
						+ "Mad Max, 16;"
						+ "La cabaña del bosque, 16;"
						+ "12 Angry Men,16"
						+ "+" 
				+ this.getNombreDB()+
				".Salas(nombre,FK_codigo_Pelicula):"
						+ "Valporquero,1;"
						+ "Altamira ,2;"
						+ "Drach,3;"
						+ "Jameos del Agua,1;"
						+ "Nerja,1";
	}

}
