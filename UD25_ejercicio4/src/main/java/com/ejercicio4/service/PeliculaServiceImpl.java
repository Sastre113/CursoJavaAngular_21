/**
 * 
 */
package com.ejercicio4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio4.dao.IPeliculaDao;
import com.ejercicio4.dto.Pelicula;

/**
 * @author Miguel A. Sastre
 *
 */
@Service
public class PeliculaServiceImpl implements IPeliculaService{
	
	@Autowired
	IPeliculaDao iPeliculaDao;

	@Override
	public List<Pelicula> listarPeliculas() {
		return iPeliculaDao.findAll();
	}

	@Override
	public Pelicula añadirPelicula(Pelicula pelicula) {
		return iPeliculaDao.save(pelicula);
	}

	@Override
	public Pelicula actualizarPelicula(Pelicula pelicula) {
		return iPeliculaDao.save(pelicula);
	}

	@Override
	public void eliminarPelicula(Long id) {
		iPeliculaDao.deleteById(id);
	}

	@Override
	public Pelicula getPeliculaXId(Long id) {
		return iPeliculaDao.findById(id).get();
	}
	
	
}
