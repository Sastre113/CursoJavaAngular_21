/**
 * 
 */
package com.ejercicio3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio3.dao.ICajaDao;
import com.ejercicio3.dto.Caja;

/**
 * @author Miguel A. Sastre
 *
 */
@Service
public class CajaServiceImpl implements ICajaService {

	@Autowired
	ICajaDao iCajaDao;
	
	@Override
	public List<Caja> listarCajas() {
		return iCajaDao.findAll();
	}

	@Override
	public Caja añadirCajas(Caja caja) {
		return iCajaDao.save(caja);
	}

	@Override
	public Caja actualizarCajas(Caja caja) {
		return iCajaDao.save(caja);
	}

	@Override
	public void eliminarCajas(String numReferencia) {
		iCajaDao.deleteById(numReferencia);
	}

	@Override
	public Caja getCajasXId(String numReferencia) {
		return iCajaDao.findById(numReferencia).get();
	}

	

}
