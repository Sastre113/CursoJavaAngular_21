/**
 * 
 */
package com.ejercicio1.service;

import java.util.List;
import com.ejercicio1.dto.Fabricante;

/**
 * @author Miguel A. Sastre
 *
 */
public interface IFabricanteService {
	
	public List<Fabricante> listarFabricantes();
	
	public Fabricante añadirFabricante(Fabricante fabricante);
	
	public Fabricante actualizarFabricante(Fabricante fabricante);
	
	public void eliminarFabricante(Long id);
	
	public Fabricante getFabricanteXId(Long id);
	
}
