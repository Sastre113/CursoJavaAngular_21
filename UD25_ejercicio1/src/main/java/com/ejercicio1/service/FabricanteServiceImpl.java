/**
 * 
 */
package com.ejercicio1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio1.dao.IFabricanteDao;
import com.ejercicio1.dto.Fabricante;

/**
 * @author Miguel A. Sastre
 *
 */
@Service
public class FabricanteServiceImpl implements IFabricanteService{
	
	@Autowired
	IFabricanteDao iFrabricanteDao;

	@Override
	public List<Fabricante> listarFabricantes() {
		return iFrabricanteDao.findAll();
	}

	@Override
	public Fabricante añadirFabricante(Fabricante fabricante) {
		return iFrabricanteDao.save(fabricante);
	}

	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		return iFrabricanteDao.save(fabricante);
	}

	@Override
	public void eliminarFabricante(Long id) {
		iFrabricanteDao.deleteById(id);
	}

	@Override
	public Fabricante getFabricanteXId(Long id) {
		return iFrabricanteDao.findById(id).get();
	}
	
	
}
