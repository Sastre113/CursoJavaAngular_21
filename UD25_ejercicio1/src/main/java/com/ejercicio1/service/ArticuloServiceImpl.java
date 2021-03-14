/**
 * 
 */
package com.ejercicio1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio1.dao.IArticuloDao;
import com.ejercicio1.dto.Articulo;

/**
 * @author Miguel A. Sastre
 *
 */
@Service
public class ArticuloServiceImpl implements IArticuloService {

	@Autowired
	IArticuloDao iArticuloDao;
	
	@Override
	public List<Articulo> listarArticulos() {
		return iArticuloDao.findAll();
	}

	@Override
	public Articulo añadirArticulos(Articulo articulo) {
		return iArticuloDao.save(articulo);
	}

	@Override
	public Articulo actualizarArticulos(Articulo articulo) {
		return iArticuloDao.save(articulo);
	}

	@Override
	public void eliminarArticulos(Long id) {
		iArticuloDao.deleteById(id);
	}

	@Override
	public Articulo getArticulosXId(Long id) {
		return iArticuloDao.findById(id).get();
	}

	

}
