/**
 * 
 */
package com.ejercicio3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio3.dao.IMaquinaRegistradoraDao;
import com.ejercicio3.dto.MaquinaRegistradora;

/**
 * @author Miguel A. Sastre
 *
 */
@Service
public class MaquinaRegistradoraServiceImpl implements IMaquinaRegistradoraService{
	
	@Autowired
	IMaquinaRegistradoraDao iMaquinaRegistradoraDao;

	@Override
	public List<MaquinaRegistradora> listarMaquinaRegistradoras() {
		return iMaquinaRegistradoraDao.findAll();
	}

	@Override
	public MaquinaRegistradora añadirMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora) {
		return iMaquinaRegistradoraDao.save(maquinaRegistradora);
	}

	@Override
	public MaquinaRegistradora actualizarMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora) {
		return iMaquinaRegistradoraDao.save(maquinaRegistradora);
	}

	@Override
	public void eliminarMaquinaRegistradora(Long codigo) {
		iMaquinaRegistradoraDao.deleteById(codigo);
	}

	@Override
	public MaquinaRegistradora getMaquinaRegistradoraXId(Long codigo) {
		return iMaquinaRegistradoraDao.findById(codigo).get();
	}
	
	
}
