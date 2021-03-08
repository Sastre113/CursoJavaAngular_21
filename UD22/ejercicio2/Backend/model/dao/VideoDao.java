/**
 * 
 */
package Backend.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import Backend.model.conexion.ConexionEj2;
import Backend.model.dto.VideoDto;

/**
 * @author Miguel A. Sastre
 *
 */
public class VideoDao {
	
	public void insertarVideo(VideoDto nuevoVideo) {
		ConexionEj2 conex = new ConexionEj2();
		
		try {
			Statement st = conex.getConnection().createStatement();
			String sql = "INSERT INTO Videos VALUES ('"+ "0"  +"',"
					+ "'" + nuevoVideo.getTitle() + "'," 
					+ "'" + nuevoVideo.getDirector() + "'," + "'"
					+ nuevoVideo.getCli_id() + "');";
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
	
	public VideoDto buscarVideo(int id) {
		ConexionEj2 conex = new ConexionEj2();
		VideoDto video = new VideoDto();
		boolean existe = false;
		
		try {
			String sql = "SELECT * FROM Videos where id = ? ";
			PreparedStatement consulta = conex.getConnection().prepareStatement(sql);
			consulta.setInt(1, id);
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				existe = true;
				video.setId(Integer.parseInt(res.getString("id")));
				video.setTitle(res.getString("title"));
				video.setDirector(res.getString("director"));
				video.setCli_id(Integer.parseInt(res.getString("cli_id")));
			}
			res.close();
			conex.desconectar();
			System.out.println(sql);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, no se conecto");
			System.out.println(e);
		}
		
		if (!existe) {
			video = null;
		}

		return video;
	}
	
	public LinkedList<VideoDto> getAllVideo(){
		ConexionEj2 conex = new ConexionEj2();
		LinkedList<VideoDto> listaVideos = new LinkedList<>();
		
		try {
			String sql = "SELECT * FROM Videos";
			PreparedStatement consulta = conex.getConnection().prepareStatement(sql);
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				VideoDto video = new VideoDto();
				video.setId(Integer.parseInt(res.getString("id")));
				video.setTitle(res.getString("title"));
				video.setDirector(res.getString("director"));
				video.setCli_id(Integer.parseInt(res.getString("cli_id")));
				listaVideos.add(video);
			}
			res.close();
			conex.desconectar();
			System.out.println(sql);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, no se conecto");
			System.out.println(e);
		}
		
		if(listaVideos.isEmpty())
			listaVideos = null;
		
		return listaVideos;
	}
}
