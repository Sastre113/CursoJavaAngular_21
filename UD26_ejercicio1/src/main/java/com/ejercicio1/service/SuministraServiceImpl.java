/**
 * 
 */
package com.ejercicio1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio1.dao.ISuministraDao;
import com.ejercicio1.dto.Suministra;

/**
 * @author Miguel A. Sastre
 *
 */
@Service
public class SuministraServiceImpl implements ISuministraService {

	@Autowired
	ISuministraDao iSuministraDao;
	
	@Override
	public List<Suministra> listarSuministra() {
		return iSuministraDao.findAll();
	}

	@Override
	public Suministra añadirSuministra(Suministra suministra) {
		return iSuministraDao.save(suministra);
	}

	@Override
	public Suministra actualizarSuministra(Suministra suministra) {
		return iSuministraDao.save(suministra);
	}

	@Override
	public void eliminarSuministra(Integer codigoPieza) {
		iSuministraDao.deleteById(codigoPieza);
	}

	@Override
	public Suministra getSuministraXCodigoPieza(Integer codigoPieza) {
		return iSuministraDao.findById(codigoPieza).get();
	}

	

}
