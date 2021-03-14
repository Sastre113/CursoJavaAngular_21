/**
 * 
 */
package com.ejercicio3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio3.dao.IMaquinaRegistradoraDao;
import com.ejercicio3.dao.IProductoDao;
import com.ejercicio3.dto.MaquinaRegistradora;
import com.ejercicio3.dto.Producto;

/**
 * @author Miguel A. Sastre
 *
 */
@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	IProductoDao iProductoDao;

	@Override
	public List<Producto> listarProductoes() {
		return iProductoDao.findAll();
	}

	@Override
	public Producto añadirProducto(Producto producto) {
		return iProductoDao.save(producto);
	}

	@Override
	public Producto actualizarProducto(Producto producto) {
		return iProductoDao.save(producto);
	}

	@Override
	public void eliminarProducto(Long id) {
		iProductoDao.deleteById(id);
	}

	@Override
	public Producto getProductoXId(Long id) {
		return iProductoDao.findById(id).get();
	}
	
	
}
