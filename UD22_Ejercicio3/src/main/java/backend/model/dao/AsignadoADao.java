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
import backend.model.dto.AsignadoA;

/**
 * @author Miguel A. Sastre
 *
 */
public class AsignadoADao {
	
	
	public void añadirAsignado(AsignadoA nuevoAsignado) {
		Conectar conex = new Conectar();
		
		try {
			Statement st = conex.getConnection().createStatement();
			String sql = "INSERT INTO Asignado_A VALUES ('"+ nuevoAsignado.getCientifico() +"',"
					+ "'" + nuevoAsignado.getProyecto() + "');";
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
	
	public AsignadoA buscarAsignado(String cientifico) {
		Conectar conex = new Conectar();
		AsignadoA asignadoA = new AsignadoA();
		boolean existe = false;
		
		try {
			String sql = "SELECT * FROM Asignado_A where FK_dni_Cientificos = ? ";
			PreparedStatement consulta = conex.getConnection().prepareStatement(sql);
			consulta.setString(1, cientifico);
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				existe = true;
				asignadoA.setCientifico(res.getString("FK_dni_Cientificos"));
				asignadoA.setProyecto(res.getString("FK_id_Proyecto"));
			}
			res.close();
			conex.desconectar();
			System.out.println(sql);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, no se conecto");
			System.out.println(e);
		}
		
		if (!existe) {
			asignadoA = null;
		}

		return asignadoA;
	}
	
	public LinkedList<AsignadoA> getAllAsignadoA(){
		Conectar conex = new Conectar();
		LinkedList<AsignadoA> lista = new LinkedList<>();
		
		try {
			String sql = "SELECT * FROM Asignado_A";
			PreparedStatement consulta = conex.getConnection().prepareStatement(sql);
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				AsignadoA asignado = new AsignadoA();
				asignado.setCientifico(res.getString("FK_dni_Cientificos"));
				asignado.setProyecto(res.getString("FK_id_Proyecto"));
				lista.add(asignado);
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
	
	public void eliminarAsignado(String cientifico) {
		Conectar conex = new Conectar();
		
		try {
			String sql = "DELETE FROM Asignado_A WHERE cientifico='" + cientifico + "'";
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
