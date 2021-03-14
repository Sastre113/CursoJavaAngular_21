/**
 * 
 */
package com.ejercicio2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio2.dao.IAsignadoADao;
import com.ejercicio2.dto.AsignadoA;

/**
 * @author Miguel A. Sastre
 *
 */
@Service
public class AsignadoAServiceImpl implements IAsignadoAService {

	@Autowired
	IAsignadoADao iAsignadoADao;
	
	@Override
	public List<AsignadoA> listarAsignadoA() {
		return iAsignadoADao.findAll();
	}

	@Override
	public AsignadoA añadirAsignadoA(AsignadoA asignadoA) {
		return iAsignadoADao.save(asignadoA);
	}

	@Override
	public AsignadoA actualizarAsignadoA(AsignadoA asignadoA) {
		return iAsignadoADao.save(asignadoA);
	}

	@Override
	public void eliminarAsignadoA(Integer id) {
		iAsignadoADao.deleteById(id);
	}

	@Override
	public AsignadoA getAsignadoAXId(Integer id) {
		return iAsignadoADao.findById(id).get();
	}

	

}
