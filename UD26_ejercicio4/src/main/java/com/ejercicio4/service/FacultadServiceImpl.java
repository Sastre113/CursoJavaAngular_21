/**
 * 
 */
package com.ejercicio4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio4.dao.IFacultadDao;
import com.ejercicio4.dto.Facultad;

/**
 * @author Miguel A. Sastre
 *
 */
@Service
public class FacultadServiceImpl implements IFacultadService{
	
	@Autowired
	IFacultadDao iFacultadDao;

	@Override
	public List<Facultad> listarFacultads() {
		return iFacultadDao.findAll();
	}

	@Override
	public Facultad añadirFacultad(Facultad facultad) {
		return iFacultadDao.save(facultad);
	}

	@Override
	public Facultad actualizarFacultad(Facultad facultad) {
		return iFacultadDao.save(facultad);
	}

	@Override
	public void eliminarFacultad(Long codigo) {
		iFacultadDao.deleteById(codigo);
	}

	@Override
	public Facultad getFacultadXId(Long codigo) {
		return iFacultadDao.findById(codigo).get();
	}
	
	
}
