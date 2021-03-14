/**
 * 
 */
package com.ejercicio2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio2.dao.IEmpleadoDao;
import com.ejercicio2.dto.Empleado;

/**
 * @author Miguel A. Sastre
 *
 */
@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	IEmpleadoDao iEmpleadoDao;
	
	@Override
	public List<Empleado> listarEmpleados() {
		return iEmpleadoDao.findAll();
	}

	@Override
	public Empleado añadirEmpleado(Empleado empleado) {
		return iEmpleadoDao.save(empleado);
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		return iEmpleadoDao.save(empleado);
	}

	@Override
	public void eliminarEmpleado(String dni) {
		iEmpleadoDao.deleteById(dni);
	}

	@Override
	public Empleado getEmpleadosXDni(String dni) {
		return iEmpleadoDao.findById(dni).get();
	}

	

}
