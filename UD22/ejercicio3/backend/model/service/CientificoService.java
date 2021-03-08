/**
 * 
 */
package backend.model.service;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import backend.controller.Controlador;
import backend.model.dao.CientificoDao;
import backend.model.dto.Cientifico;


/**
 * @author Miguel A. Sastre
 *
 */
public class CientificoService {
	private Controlador controlador;
	
	public void validarAñadir(Cientifico nuevoCientifico) {
		if(nuevoCientifico.getDni().length() > 6)
			new CientificoDao().añadirCientifico(nuevoCientifico);
		else
			JOptionPane.showMessageDialog(null,"El dni del cientifico debe tener más 6 digitos","Advertencia",
					JOptionPane.WARNING_MESSAGE);
	}
	
	
	public Cientifico validarBuscarCientifico(String cientifico) {
		Cientifico asignadoEncontrado = null;
		
		try {
			if(cientifico.length() > 6) 
				asignadoEncontrado = new CientificoDao().buscarCientifico(cientifico);
			else
				JOptionPane.showMessageDialog(null,"El dni del cientifico debe tener más 6 digitos","Advertencia",JOptionPane.WARNING_MESSAGE);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Se ha presentado un Error","Error",JOptionPane.ERROR_MESSAGE);
		}
		
		return asignadoEncontrado;
	}
	
	
	public LinkedList<Cientifico> validarBuscarTodos() {
		LinkedList<Cientifico> lista = new LinkedList<>();
		
		try {
			lista = new CientificoDao().getAllCientifico();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se ha presentado un Error", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		return lista;
	}
	
	public void validarEliminar(String cientifico) {
		new CientificoDao().eliminarCientifico(cientifico);
	}
	
	
	/**
	 * @return the controlador
	 */
	public Controlador getControlador() {
		return controlador;
	}

	/**
	 * @param controlador the controlador to set
	 */
	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}
	

}
