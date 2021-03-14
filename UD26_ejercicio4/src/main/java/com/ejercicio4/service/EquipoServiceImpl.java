/**
 * 
 */
package com.ejercicio4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio4.dao.IEquipoDao;
import com.ejercicio4.dto.Equipo;

/**
 * @author Miguel A. Sastre
 *
 */
@Service
public class EquipoServiceImpl implements IEquipoService{
	
	@Autowired
	IEquipoDao iEquipoDao;

	@Override
	public List<Equipo> listarEquipos() {
		return iEquipoDao.findAll();
	}

	@Override
	public Equipo añadirEquipo(Equipo equipo) {
		return iEquipoDao.save(equipo);
	}

	@Override
	public Equipo actualizarEquipo(Equipo equipo) {
		return iEquipoDao.save(equipo);
	}

	@Override
	public void eliminarEquipo(String codigo) {
		iEquipoDao.deleteById(codigo);
	}

	@Override
	public Equipo getEquipoXId(String codigo) {
		return iEquipoDao.findById(codigo).get();
	}
	
	
}
