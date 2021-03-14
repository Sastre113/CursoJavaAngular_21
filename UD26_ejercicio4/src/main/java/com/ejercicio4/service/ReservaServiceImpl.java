/**
 * 
 */
package com.ejercicio4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio4.dao.IReservaDao;
import com.ejercicio4.dto.Reserva;

/**
 * @author Miguel A. Sastre
 *
 */
@Service
public class ReservaServiceImpl implements IReservaService {

	@Autowired
	IReservaDao iReservaDao;
	
	@Override
	public List<Reserva> listarReserva() {
		return iReservaDao.findAll();
	}

	@Override
	public Reserva añadirReserva(Reserva reserva) {
		return iReservaDao.save(reserva);
	}

	@Override
	public Reserva actualizarReserva(Reserva reserva) {
		return iReservaDao.save(reserva);
	}

	@Override
	public void eliminarReserva(String codigoPieza) {
		iReservaDao.deleteById(codigoPieza);
	}

	@Override
	public Reserva getReservaXId(String id) {
		return iReservaDao.findById(id).get();
	}

	

	

}
