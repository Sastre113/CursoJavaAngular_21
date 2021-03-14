/**
 * 
 */
package com.ejercicio3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio3.dao.IVentaDao;
import com.ejercicio3.dto.Venta;

/**
 * @author Miguel A. Sastre
 *
 */
@Service
public class VentaServiceImpl implements IVentaService {

	@Autowired
	IVentaDao iVentaDao;
	
	@Override
	public List<Venta> listarVenta() {
		return iVentaDao.findAll();
	}

	@Override
	public Venta añadirVenta(Venta venta) {
		return iVentaDao.save(venta);
	}

	@Override
	public Venta actualizarVenta(Venta venta) {
		return iVentaDao.save(venta);
	}

	@Override
	public void eliminarVenta(Long codigoPieza) {
		iVentaDao.deleteById(codigoPieza);
	}

	@Override
	public Venta getVentaXId(Long id) {
		return iVentaDao.findById(id).get();
	}

	

	

}
