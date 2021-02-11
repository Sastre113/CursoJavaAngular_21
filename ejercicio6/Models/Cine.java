/**
 * 
 */
package Models;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Miguel A. Sastre
 *
 */
public class Cine {
	
	/**
	 * Atributos 
	 */
	
	protected Pelicula pelicula;
	protected double precioEntrada;
	protected LinkedList<HashMap<Character,Espectador>>  asientos;
	
	/**
	 * @param pelicula
	 * @param precioEntrada
	 * @param asientos
	 */
	
	public Cine(Pelicula pelicula, double precioEntrada) {
		this.pelicula = pelicula;
		this.precioEntrada = precioEntrada;
		this.asientos = crearSala();
	}

	/**
	 * Método para inicializar la sala de cine. 
	 * El tamaño esta fijado en 8 filas y 9 columnas.
	 * @return LinkedList<HashMap<Character, Espectador>> 
	 */
	
	private LinkedList<HashMap<Character, Espectador>> crearSala() {
		LinkedList<HashMap<Character, Espectador>> cine = new LinkedList<HashMap<Character, Espectador>>();
		
		for(int i = 0; i < 8; i++) {
			HashMap<Character, Espectador> columnas = new HashMap<Character, Espectador>();
			for(int j = 0; j < 9; j++) {
				columnas.put((char)(65 + j), null);
			}
			cine.add(columnas);
		}
		return cine;
	}
	
	/**
	 * Método para saber si un asiento esta ocupado.
	 * @param fila
	 * @param columna
	 * @return True si el asiento elegido esta libre
	 */
	
	public boolean sitioNoOcupado(int fila, char columna) {
		return this.asientos.get(fila).get(columna) == null;
	}
	
	
	/**
	 * Sobrecarga del método sentarUsuario. Este método permite
	 * que se pueda elegir la butaca como un String.
	 * @param posicion
	 * @param cliente
	 */
	
	public void sentarUsuario(String posicion, Espectador cliente) {
		char [] arrayChar = posicion.toCharArray();
		sentarUsuario(Character.getNumericValue(arrayChar[0]) , arrayChar[1], cliente);
	}
	
	/**
	 * Método encargado de sentar a un nuevo espectador.
	 * Para poder sentarlo, primero debe tener dinero suficiente y
	 * la cumplir con la edad mínima de la película.
	 * Luego, el método buscará en el sitio indicado por el usuario
	 * para comprobar si está libre. Si no está libré el método buscará
	 * otro sitio libre. 
	 * @param fila
	 * @param columna
	 * @param cliente
	 */
	
	public void sentarUsuario(int fila, char columna, Espectador cliente) {
		fila = fila-1; // Compensanción del indexado real que tiene "LinkedList".
		if(cliente.getDinero() >= this.getPrecioEntrada() && cliente.getEdad() >= this.getPelicula().getMinEdad()) {
			if(sitioNoOcupado(fila,columna))
				this.asientos.get(fila).replace(columna, cliente);
			else {
				
				LinkedList<HashMap<Character, Espectador>> asientos = this.getAsientos();	
				Iterator<HashMap<Character, Espectador>> itFila = asientos.iterator();
				boolean exit = false;
				
				while(itFila.hasNext() & !exit) {
					HashMap<Character, Espectador> filaCompleta = itFila.next();
					Iterator<Character> itColumna = filaCompleta.keySet().iterator();
					while(itColumna.hasNext() & !exit) {
						char asiento = itColumna.next();
						if(filaCompleta.get(asiento) == null) {
							exit = true;
							filaCompleta.replace(asiento, cliente);
						}
					}
				}
				
				
			}
		}
		else
			System.out.println("El espectador "+ cliente.getNombre() +" no tiene suficiente dinero para entrar en este cine.");
	}

	
	/**
	 * Sobrecarga del metodo toString(). Devolverá el estado actual del cine
	 * indicando la película, su precio, el director y la edad mínima.
	 * Por último se dibujará el estado de las butacas en el cine.
	 * Si las butacas están ocupadas se indicará con "XX".
	 * @return String con el estado del cine.
	 */
	
	@Override
	public String toString() {
		String sala = "";
		
		for(int i = this.asientos.size() - 1; i >= 0; i--) {
			for(int j = 0; j < this.asientos.get(i).size(); j++) {
				if(j < this.asientos.get(i).size() - 1) {
					if(sitioNoOcupado(i,(char)(65 + j))) {
						sala += (i+1) + Character.toString(65 + j) + " - ";
					} else
						sala += "XX -";
				} else {
					if(sitioNoOcupado(i,(char)(65 + j))) {
						sala += (i+1) + Character.toString(65 + j) + "\n";
					} else
						sala += "XX\n";
				}
				
			}
		}	
		
		return "Cine\nPelicula proyectada= " + this.getPelicula().getTitulo() + " ,precioEntrada= " + this.getPrecioEntrada() +" €"
			+"\nDirector: "+ this.getPelicula().getDirector() +"\nEdad minima: "+ this.getPelicula().getMinEdad() + " \n\n" + sala;
	}
	
	
	/**
	 * Métodos "Getters" y "Setters"
	 */
	
	/**
	 * @return el objeto "Pelicula" 
	 */
	
	public Pelicula getPelicula() {
		return pelicula;
	}

	/**
	 * @param pelicula
	 */
	
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	/**
	 * @return el precio de la entrada
	 */
	public double getPrecioEntrada() {
		return precioEntrada;
	}

	
	/**
	 * @param precioEntrada
	 */
	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
	
	/**
	 * @return Lista con todos los asiento del cine
	 */
	
	public LinkedList<HashMap<Character, Espectador>> getAsientos() {
		return asientos;
	}
	
}
