/**
 * 
 */
package com.ejercicio2.service;

import java.util.List;

import com.ejercicio2.dto.Cientifico;
import com.ejercicio2.dto.AsignadoA;

/**
 * @author Miguel A. Sastre
 *
 */
public interface IAsignadoAService {
	
	public List<AsignadoA> listarAsignadoA();
	
	public AsignadoA añadirAsignadoA(AsignadoA asignadoA);
	
	public AsignadoA actualizarAsignadoA(AsignadoA asignadoA);
	
	public void eliminarAsignadoA(Integer id);
	
	public AsignadoA getAsignadoAXId(Integer id);
}
