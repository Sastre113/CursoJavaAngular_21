/**
 * 
 */
package com.ejercicio3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio3.dao.ICajeroDao;
import com.ejercicio3.dto.Cajero;

/**
 * @author Miguel A. Sastre
 *
 */
@Service
public class CajeroServiceImpl implements ICajeroService{
	
	@Autowired
	ICajeroDao iCajeroDao;

	@Override
	public List<Cajero> listarCajeros() {
		return iCajeroDao.findAll();
	}

	@Override
	public Cajero añadirCajero(Cajero cajero) {
		return iCajeroDao.save(cajero);
	}

	@Override
	public Cajero actualizarCajero(Cajero cajero) {
		return iCajeroDao.save(cajero);
	}

	@Override
	public void eliminarCajero(Long codigo) {
		iCajeroDao.deleteById(codigo);
	}

	@Override
	public Cajero getCajeroXId(Long codigo) {
		return iCajeroDao.findById(codigo).get();
	}
	
	
}
