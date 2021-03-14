/**
 * 
 */
package com.ejercicio2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio2.dao.ICientificoDao;
import com.ejercicio2.dto.Cientifico;

/**
 * @author Miguel A. Sastre
 *
 */
@Service
public class CientificoServiceImpl implements ICientificoService{
	
	@Autowired
	ICientificoDao iCientificoDao;

	@Override
	public List<Cientifico> listarCientificos() {
		return iCientificoDao.findAll();
	}

	@Override
	public Cientifico añadirCientifico(Cientifico cientifico) {
		return iCientificoDao.save(cientifico);
	}

	@Override
	public Cientifico actualizarCientifico(Cientifico cientifico) {
		return iCientificoDao.save(cientifico);
	}

	@Override
	public void eliminarCientifico(String id) {
		iCientificoDao.deleteById(id);
	}

	@Override
	public Cientifico getCientificoXId(String id) {
		return iCientificoDao.findById(id).get();
	}
	
	
}
