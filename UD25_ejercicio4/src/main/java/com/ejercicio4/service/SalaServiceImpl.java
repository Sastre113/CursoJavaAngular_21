/**
 * 
 */
package com.ejercicio4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio4.dao.ISalaDao;
import com.ejercicio4.dto.Sala;

/**
 * @author Miguel A. Sastre
 *
 */
@Service
public class SalaServiceImpl implements ISalaService {

	@Autowired
	ISalaDao iSalaDao;
	
	@Override
	public List<Sala> listarSalas() {
		return iSalaDao.findAll();
	}

	@Override
	public Sala añadirSalas(Sala sala) {
		return iSalaDao.save(sala);
	}

	@Override
	public Sala actualizarSalas(Sala sala) {
		return iSalaDao.save(sala);
	}

	@Override
	public void eliminarSalas(Long id) {
		iSalaDao.deleteById(id);
	}

	@Override
	public Sala getSalasXId(Long id) {
		return iSalaDao.findById(id).get();
	}

	

}
