/**
 * 
 */
package com.ejercicio4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio4.dao.IEquipoDao;
import com.ejercicio4.dao.IInvestigadorDao;
import com.ejercicio4.dto.Equipo;
import com.ejercicio4.dto.Investigador;

/**
 * @author Miguel A. Sastre
 *
 */
@Service
public class InvestigadorServiceImpl implements IInvestigadorService{
	
	@Autowired
	IInvestigadorDao iInvestigadorDao;

	@Override
	public List<Investigador> listarInvestigadores() {
		return iInvestigadorDao.findAll();
	}

	@Override
	public Investigador añadirInvestigador(Investigador investigador) {
		return iInvestigadorDao.save(investigador);
	}

	@Override
	public Investigador actualizarInvestigador(Investigador investigador) {
		return iInvestigadorDao.save(investigador);
	}

	@Override
	public void eliminarInvestigador(String id) {
		iInvestigadorDao.deleteById(id);
	}

	@Override
	public Investigador getInvestigadorXId(String id) {
		return iInvestigadorDao.findById(id).get();
	}
}
