/**
 * 
 */
package com.ejercicio1.service;

import java.util.List;
import com.ejercicio1.dto.Pieza;

/**
 * @author Miguel A. Sastre
 *
 */
public interface IPiezaService {
	
	public List<Pieza> listarPiezas();
	
	public Pieza añadirPieza(Pieza pieza);
	
	public Pieza actualizarPieza(Pieza pieza);
	
	public void eliminarPieza(Long id);
	
	public Pieza getPiezaXId(Long id);
	
}
