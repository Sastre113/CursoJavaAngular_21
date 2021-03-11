/**
 * 
 */
package com.SpringRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringRest.dao.ITrabajadorDao;
import com.SpringRest.dto.Trabajador;

/**
 * @author Miguel A. Sastre
 *
 */
@Service
public class TrabajadorServiceImpl implements ITrabajadorService{
	
	@Autowired
	ITrabajadorDao iTrabajadorDao;

	@Override
	public List<Trabajador> listarTrabajadores() {
		// TODO Auto-generated method stub
		return iTrabajadorDao.findAll();
	}

	@Override
	public Trabajador añadirTrabajador(Trabajador trabajador) {
		// TODO Auto-generated method stub
		return iTrabajadorDao.save(trabajador);
	}

	@Override
	public Trabajador getOneTrabajador(Integer id) {
		// TODO Auto-generated method stub
		return iTrabajadorDao.findById(id).get();
	}

	@Override
	public Trabajador actualizarTrabajador(Trabajador trabajador) {
		// TODO Auto-generated method stub
		return iTrabajadorDao.save(trabajador);
	}

	@Override
	public void eliminarTrabajador(Integer id) {
		// TODO Auto-generated method stub
		iTrabajadorDao.deleteById(id);
	}

	
}
