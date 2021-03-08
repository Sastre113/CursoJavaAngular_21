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
import backend.model.dto.Cientifico;

/**
 * @author Miguel A. Sastre
 *
 */
public class CientificoDao {
	

	public void añadirCientifico(Cientifico nuevoCientifico) {
		Conectar conex = new Conectar();
		
		try {
			Statement st = conex.getConnection().createStatement();
			String sql = "INSERT INTO Cientificos VALUES ('"+ nuevoCientifico.getDni() +"',"
					+ "'" + nuevoCientifico.getNomApels() + "');";
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
	
	public Cientifico buscarCientifico(String dni) {
		Conectar conex = new Conectar();
		Cientifico cientifico = new Cientifico();
		boolean existe = false;
		
		try {
			String sql = "SELECT * FROM Cientificos where dni = ? ";
			PreparedStatement consulta = conex.getConnection().prepareStatement(sql);
			consulta.setString(1, dni);
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				existe = true;
				cientifico.setDni(res.getString("dni"));
				cientifico.setNomApels(res.getString("nomapels"));
			}
			res.close();
			conex.desconectar();
			System.out.println(sql);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, no se conecto");
			System.out.println(e);
		}
		
		if (!existe) {
			cientifico = null;
		}

		return cientifico;
	}
	
	public LinkedList<Cientifico> getAllCientifico(){
		Conectar conex = new Conectar();
		LinkedList<Cientifico> lista = new LinkedList<>();
		
		try {
			String sql = "SELECT * FROM Cientificos";
			PreparedStatement consulta = conex.getConnection().prepareStatement(sql);
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				Cientifico cientifico = new Cientifico();
				cientifico.setDni(res.getString("dni"));
				cientifico.setNomApels(res.getString("nomapels"));
				lista.add(cientifico);
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
	
	public void eliminarCientifico(String cientifico) {
		Conectar conex = new Conectar();
		
		try {
			String sql = "DELETE FROM Cientificos WHERE dni='" + cientifico + "'";
			Statement st = conex.getConnection().createStatement();
			st.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, " Se ha Eliminado Correctamente a " + cientifico, "Información",
					JOptionPane.INFORMATION_MESSAGE);
			System.out.println(sql);
			st.close();
			conex.desconectar();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se elimino \"" + cientifico +"\"");
		}
	}
}
