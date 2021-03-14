/**
 * 
 */
package com.ejercicio2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio2.dao.ICientificoDao;
import com.ejercicio2.dao.IProyectoDao;
import com.ejercicio2.dto.Cientifico;
import com.ejercicio2.dto.Proyecto;

/**
 * @author Miguel A. Sastre
 *
 */
@Service
public class ProyectoServiceImpl implements IProyectoService{
	
	@Autowired
	IProyectoDao iProyectoDao;

	@Override
	public List<Proyecto> listarProyectos() {
		return iProyectoDao.findAll();
	}

	@Override
	public Proyecto añadirProyecto(Proyecto proyecto) {
		return iProyectoDao.save(proyecto);
	}

	@Override
	public Proyecto actualizarProyecto(Proyecto proyecto) {
		return iProyectoDao.save(proyecto);
	}

	@Override
	public void eliminarProyecto(String id) {
		iProyectoDao.deleteById(id);
	}

	@Override
	public Proyecto getProyectoXId(String id) {
		return iProyectoDao.findById(id).get();
	}
	
	
}
