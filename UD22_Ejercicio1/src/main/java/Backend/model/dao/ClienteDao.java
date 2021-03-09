/**
 * 
 */
package Backend.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Backend.model.conexion.Conexion;
import Backend.model.dto.Cliente;

/**
 * @author Miguel A. Sastre
 *
 */

public class ClienteDao {

	public void registrarCliente(Cliente nuevoCliente) {

		Conexion conex = new Conexion();

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

	public Cliente buscarCliente(int id) {
		Conexion conex = new Conexion();
		Cliente cliente = new Cliente();
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

	public void modificarCliente(Cliente cliente) {

		Conexion conex = new Conexion();
		try {
			String sql = "UPDATE cliente SET id= ? ,nombre = ? , apellido=?, "
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
		Conexion conex = new Conexion();
		try {
			String sql = "DELETE FROM cliente WHERE id='" + id + "'";
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
