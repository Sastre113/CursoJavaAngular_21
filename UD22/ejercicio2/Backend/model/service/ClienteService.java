package Backend.model.service;

/**
 * 
 */

import javax.swing.JOptionPane;

import Backend.controller.ControllerEj2;
import Backend.model.dao.ClienteDaoEj2;
import Backend.model.dto.ClienteDto;


/**
 * @author Miguel A. Sastre
 *
 */
public class ClienteService {
	private ControllerEj2 clienteController;
	public static boolean consultaCliente = false;
	public static boolean modificaCliente = false;

	public void setController(ControllerEj2 clienteController) {
		this.setController(clienteController);
	}

	public void validarRegistro(ClienteDto nuevoCliente) {
		ClienteDaoEj2 cliente;

		if (nuevoCliente.getDni() > Math.pow(10, 6)) {
			cliente = new ClienteDaoEj2();
			cliente.registrarCliente(nuevoCliente);
		} else
			JOptionPane.showMessageDialog(null, "El documento de la persona debe ser mas de 6 digitos", "Advertencia",
					JOptionPane.WARNING_MESSAGE);
	}

	public ClienteDto validarConsulta(String dni) {
		ClienteDaoEj2 ClienteDaoEj2;
		ClienteDto clienteBuscado = null;

		try {

			ClienteDaoEj2 = new ClienteDaoEj2();
			consultaCliente = true;
			clienteBuscado = ClienteDaoEj2.buscarCliente(Integer.parseInt(dni));

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Debe ingresar un dato numerico", "Error", JOptionPane.ERROR_MESSAGE);
			consultaCliente = false;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se ha presentado un Error", "Error", JOptionPane.ERROR_MESSAGE);
			consultaCliente = false;
		}

		return clienteBuscado;
	}

	public void validarModificacion(ClienteDto modCliente) {
		ClienteDaoEj2 cliente;
		if (modCliente.getNombre().length() > 3) {
			cliente = new ClienteDaoEj2();
			cliente.modificarCliente(modCliente);
			modificaCliente = true;
		} else {
			JOptionPane.showMessageDialog(null, "El nombre de la persona debe ser mayor a 5 digitos", "Advertencia",
					JOptionPane.WARNING_MESSAGE);
			modificaCliente = false;
		}
	}

	public void validarEliminacion(String id) {
		ClienteDaoEj2 ClienteDaoEj2 = new ClienteDaoEj2();
		ClienteDaoEj2.eliminarPersona(id);
	}

	/**
	 * @return the clienteController
	 */
	public ControllerEj2 getClienteController() {
		return clienteController;
	}

	/**
	 * @param clienteController the clienteController to set
	 */
	public void setClienteController(ControllerEj2 clienteController) {
		this.clienteController = clienteController;
	}

}
