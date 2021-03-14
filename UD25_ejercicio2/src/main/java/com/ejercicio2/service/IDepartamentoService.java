/**
 * 
 */
package com.ejercicio2.service;

import java.util.List;

import com.ejercicio2.dto.Departamento;

/**
 * @author Miguel A. Sastre
 *
 */
public interface IDepartamentoService {
	
	public List<Departamento> listarDepartamentos();
	
	public Departamento añadirDepartamento(Departamento departamento);
	
	public Departamento actualizarDepartamento(Departamento departamento);
	
	public void eliminarDepartamento(Long codigo);
	
	public Departamento getDepartamentoXCodigo(Long codigo);
	
}
