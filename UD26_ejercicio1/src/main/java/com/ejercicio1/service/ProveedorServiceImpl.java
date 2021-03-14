/**
 * 
 */
package com.ejercicio1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio1.dao.IPiezaDao;
import com.ejercicio1.dao.IProveedorDao;
import com.ejercicio1.dto.Pieza;
import com.ejercicio1.dto.Proveedor;

/**
 * @author Miguel A. Sastre
 *
 */
@Service
public class ProveedorServiceImpl implements IProveedorService{
	
	@Autowired
	IProveedorDao iProveedorDao;

	@Override
	public List<Proveedor> listarProveedores() {
		return iProveedorDao.findAll();
	}

	@Override
	public Proveedor añadirProveedor(Proveedor proveedor) {
		return iProveedorDao.save(proveedor);
	}

	@Override
	public Proveedor actualizarProveedor(Proveedor proveedor) {
		return iProveedorDao.save(proveedor);
	}

	@Override
	public void eliminarProveedor(String id) {
		iProveedorDao.deleteById(id);
	}

	@Override
	public Proveedor getProveedorXId(String id) {
		return iProveedorDao.findById(id).get();
	}
	
	
}
