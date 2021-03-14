/**
 * 
 */
package com.ejercicio3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio3.dao.IAlmacenDao;
import com.ejercicio3.dto.Almacen;

/**
 * @author Miguel A. Sastre
 *
 */
@Service
public class AlmacenServiceImpl implements IAlmacenService{
	
	@Autowired
	IAlmacenDao iFrabricanteDao;

	@Override
	public List<Almacen> listarAlmacenes() {
		return iFrabricanteDao.findAll();
	}

	@Override
	public Almacen añadirAlmacen(Almacen almacen) {
		return iFrabricanteDao.save(almacen);
	}

	@Override
	public Almacen actualizarAlmacen(Almacen almacen) {
		return iFrabricanteDao.save(almacen);
	}

	@Override
	public void eliminarAlmacen(Long codigo) {
		iFrabricanteDao.deleteById(codigo);
	}

	@Override
	public Almacen getAlmacenXId(Long codigo) {
		return iFrabricanteDao.findById(codigo).get();
	}
	
	
}
