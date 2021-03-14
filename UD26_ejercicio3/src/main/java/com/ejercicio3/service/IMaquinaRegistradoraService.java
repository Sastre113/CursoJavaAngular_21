/**
 * 
 */
package com.ejercicio3.service;

import java.util.List;

import com.ejercicio3.dto.MaquinaRegistradora;

/**
 * @author Miguel A. Sastre
 *
 */
public interface IMaquinaRegistradoraService {
	
	public List<MaquinaRegistradora> listarMaquinaRegistradoras();
	
	public MaquinaRegistradora añadirMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora);
	
	public MaquinaRegistradora actualizarMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora);
	
	public void eliminarMaquinaRegistradora(Long id);
	
	public MaquinaRegistradora getMaquinaRegistradoraXId(Long id);
	
}
