package Backend.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import Backend.model.conexion.ConexionEj2;
import Backend.model.dto.ClienteDto;


/**
 * 
 */


/**
 * @author Miguel A. Sastre
 *
 */
public class ClienteDaoEj2 {

	public void registrarCliente(ClienteDto nuevoCliente) {

		ConexionEj2 conex = new ConexionEj2();

		try {
			Statement st = conex.getConnection().createStatement();
			String sql = "INSERT INTO Cliente VALUES ('"+ "0"  +"',"+ "'" + nuevoCliente.getNombre() + "'," 
					+ "'" + nuevoCliente.getApellido() + "'," + "'"
					+ nuevoCliente.getDireccion() + "'," + "'" + nuevoCliente.getDni() + "'," + "'"
					+ nuevoCliente.getFecha() + "');";
			st.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Información",
					JOptionPane.INFORMATION_MESSAGE);
			System.out.println(sql);
			st.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se Registro");
		}
	}

	public ClienteDto buscarCliente(int id) {
		ConexionEj2 conex = new ConexionEj2();
		ClienteDto cliente = new ClienteDto();
		boolean existe = false;

		try {
			String sql = "SELECT * FROM Cliente where id = ? ";
			PreparedStatement consulta = conex.getConnection().prepareStatement(sql);
			consulta.setInt(1, id);
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				existe = true;
				cliente.setId(Integer.parseInt(res.getString("id")));
				cliente.setNombre(res.getString("nombre"));
				cliente.setApellido(res.getString("apellido"));
				cliente.setDireccion(res.getString("direccion"));
				cliente.setDni(Integer.parseInt(res.getString("dni")));
				cliente.setFecha(res.getString("fecha"));
			}
			res.close();
			conex.desconectar();
			System.out.println(sql);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, no se conecto");
			System.out.println(e);
		}

		if (!existe) {
			cliente = null;
		}

		return cliente;
	}

	public void modificarCliente(ClienteDto cliente) {

		ConexionEj2 conex = new ConexionEj2();
		try {
			String sql = "UPDATE Cliente SET id= ? ,nombre = ? , apellido=?, "
					+ "direccion=? , dni=? , fecha= ? WHERE id= ? ";
			PreparedStatement pst = conex.getConnection().prepareStatement(sql);

			pst.setInt(1, cliente.getId());
			pst.setString(2, cliente.getNombre());
			pst.setString(3, cliente.getApellido());
			pst.setString(4, cliente.getDireccion());
			pst.setInt(5, cliente.getDni());
			pst.setString(6, cliente.getFecha());
			pst.setInt(7, cliente.getId());
			pst.executeUpdate();

			JOptionPane.showMessageDialog(null, " Se ha Modificado Correctamente ", "Confirmación",
					JOptionPane.INFORMATION_MESSAGE);
			System.out.println(sql);

		} catch (SQLException e) {

			System.out.println(e);
			JOptionPane.showMessageDialog(null, "Error al Modificar", "Error", JOptionPane.ERROR_MESSAGE);

		}
	}

	public void eliminarPersona(String id) {
		ConexionEj2 conex = new ConexionEj2();
		try {
			String sql = "DELETE FROM Cliente WHERE id='" + id + "'";
			Statement st = conex.getConnection().createStatement();
			st.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, " Se ha Eliminado Correctamente", "Información",
					JOptionPane.INFORMATION_MESSAGE);
			System.out.println(sql);
			st.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se Elimino");
		}
	}

}
