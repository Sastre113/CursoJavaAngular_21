/**
 * 
 */
package com.ejercicio1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio1.dao.IPiezaDao;
import com.ejercicio1.dto.Pieza;

/**
 * @author Miguel A. Sastre
 *
 */
@Service
public class PiezaServiceImpl implements IPiezaService{
	
	@Autowired
	IPiezaDao iPiezaDao;

	@Override
	public List<Pieza> listarPiezas() {
		return iPiezaDao.findAll();
	}

	@Override
	public Pieza añadirPieza(Pieza pieza) {
		return iPiezaDao.save(pieza);
	}

	@Override
	public Pieza actualizarPieza(Pieza pieza) {
		return iPiezaDao.save(pieza);
	}

	@Override
	public void eliminarPieza(Long codigo) {
		iPiezaDao.deleteById(codigo);
	}

	@Override
	public Pieza getPiezaXId(Long codigo) {
		return iPiezaDao.findById(codigo).get();
	}
	
	
}
