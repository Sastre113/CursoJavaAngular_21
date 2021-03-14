/**
 * 
 */
package com.ejercicio3.service;

import java.util.List;

import com.ejercicio3.dto.Caja;
import com.ejercicio3.dto.Almacen;

/**
 * @author Miguel A. Sastre
 *
 */
public interface ICajaService {
	
	public List<Caja> listarCajas();
	
	public Caja añadirCajas(Caja caja);
	
	public Caja actualizarCajas(Caja caja);
	
	public void eliminarCajas(String numReferencia);
	
	public Caja getCajasXId(String numReferencia);
}
