/**
 * 
 */
package com.ejercicio4.service;

import java.util.List;

import com.ejercicio4.dto.Investigador;

/**
 * @author Miguel A. Sastre
 *
 */
public interface IInvestigadorService {
	
	public List<Investigador> listarInvestigadores();
	
	public Investigador añadirInvestigador(Investigador investigador);
	
	public Investigador actualizarInvestigador(Investigador investigador);
	
	public void eliminarInvestigador(String id);
	
	public Investigador getInvestigadorXId(String id);
	
}
