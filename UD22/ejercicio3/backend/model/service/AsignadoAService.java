/**
 * 
 */
package backend.model.service;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import backend.controller.Controlador;
import backend.model.dao.AsignadoADao;
import backend.model.dto.AsignadoA;

/**
 * @author Miguel A. Sastre
 *
 */
public class AsignadoAService {
	private Controlador controlador;
	
	public void validarAñadir(AsignadoA nuevoAsignado) {
		if(!nuevoAsignado.getCientifico().isBlank()) {
			AsignadoADao asignadoDao = new AsignadoADao();
			asignadoDao.añadirAsignado(nuevoAsignado);
		} else
			JOptionPane.showMessageDialog(null,"El documento de la persona debe ser mas de 3 digitos","Advertencia",
					JOptionPane.WARNING_MESSAGE);
	}
	
	
	public AsignadoA validarBuscarAsignado(String cientifico) {
		AsignadoADao asignadoDao;
		AsignadoA asignadoEncontrado = null;
		
		try {
			if(!cientifico.isBlank()) {
				asignadoDao = new AsignadoADao();
				asignadoEncontrado = asignadoDao.buscarAsignado(cientifico);
			}
			else
				JOptionPane.showMessageDialog(null,"El documento de la persona debe ser mas de 3 digitos","Advertencia",JOptionPane.WARNING_MESSAGE);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Se ha presentado un Error","Error",JOptionPane.ERROR_MESSAGE);
		}
		
		return asignadoEncontrado;
	}
	
	
	public LinkedList<AsignadoA> validarBuscarTodos() {
		LinkedList<AsignadoA> lista = new LinkedList<>();
		
		try {
			lista = new AsignadoADao().getAllAsignadoA();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se ha presentado un Error", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		return lista;
	}
	
	public void validarEliminar(String cientifico) {
		new AsignadoADao().eliminarAsignado(cientifico);
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
