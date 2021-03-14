/**
 * 
 */
package com.ejercicio2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio2.dao.IDepartamentoDao;
import com.ejercicio2.dto.Departamento;

/**
 * @author Miguel A. Sastre
 *
 */
@Service
public class DepartamentoServiceImpl implements IDepartamentoService{
	
	@Autowired
	IDepartamentoDao iFrabricanteDao;

	@Override
	public List<Departamento> listarDepartamentos() {
		return iFrabricanteDao.findAll();
	}

	@Override
	public Departamento añadirDepartamento(Departamento departamento) {
		return iFrabricanteDao.save(departamento);
	}

	@Override
	public Departamento actualizarDepartamento(Departamento departamento) {
		return iFrabricanteDao.save(departamento);
	}

	@Override
	public void eliminarDepartamento(Long id) {
		iFrabricanteDao.deleteById(id);
	}

	@Override
	public Departamento getDepartamentoXCodigo(Long codigo) {
		return iFrabricanteDao.findById(codigo).get();
	}


	
}
