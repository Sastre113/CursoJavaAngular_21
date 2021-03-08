/**
 * 
 */
package backend.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import backend.model.conexion.Conectar;
import backend.model.dto.Proyecto;

/**
 * @author Miguel A. Sastre
 *
 */
public class ProyectoDao {

	public void añadirProyecto(Proyecto nuevoProyecto) {
		Conectar conex = new Conectar();
		
		try {
			Statement st = conex.getConnection().createStatement();
			String sql = "INSERT INTO Proyectos VALUES ('"+ nuevoProyecto.getId() +"',"
					+ "'" + nuevoProyecto.getNombre()+ "'," 
					+ "'" + nuevoProyecto.getHoras() + "');";
			st.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Información",
					JOptionPane.INFORMATION_MESSAGE);
			System.out.println(sql);
			st.close();
			conex.desconectar();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se añadio");
		}
	}
	
	public Proyecto buscarProyecto(String id) {
		Conectar conex = new Conectar();
		Proyecto proyecto = new Proyecto();
		boolean existe = false;
		
		try {
			String sql = "SELECT * FROM Proyectos where id = ? ";
			PreparedStatement consulta = conex.getConnection().prepareStatement(sql);
			consulta.setString(1, id);
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				existe = true;
				proyecto.setId(res.getString("id"));
				proyecto.setNombre(res.getString("nombre"));
				proyecto.setHoras(Double.parseDouble(res.getString("horas")));
			}
			res.close();
			conex.desconectar();
			System.out.println(sql);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, no se conecto");
			System.out.println(e);
		}
		
		if (!existe) {
			proyecto = null;
		}

		return proyecto;
	}
	
	public LinkedList<Proyecto> getAllProyecto(){
		Conectar conex = new Conectar();
		LinkedList<Proyecto> lista = new LinkedList<>();
		
		try {
			String sql = "SELECT * FROM Proyectos";
			PreparedStatement consulta = conex.getConnection().prepareStatement(sql);
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				Proyecto proyecto = new Proyecto();
				proyecto.setId(res.getString("id"));
				proyecto.setNombre(res.getString("nombre"));
				proyecto.setHoras(Double.parseDouble(res.getString("horas")));
				lista.add(proyecto);
			}
			res.close();
			conex.desconectar();
			System.out.println(sql);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, no se conecto");
			System.out.println(e);
		}
		
		if(lista.isEmpty())
			lista = null;
		
		return lista;
	}
	
	public void eliminarProyecto(String id) {
		Conectar conex = new Conectar();
		
		try {
			String sql = "DELETE FROM Proyectos WHERE id='" + id + "'";
			Statement st = conex.getConnection().createStatement();
			st.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, " Se ha Eliminado Correctamente a " + id, "Información",
					JOptionPane.INFORMATION_MESSAGE);
			System.out.println(sql);
			st.close();
			conex.desconectar();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se elimino \"" + id +"\"");
		}
	}
}
