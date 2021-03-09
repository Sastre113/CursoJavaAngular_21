/**
 * 
 */
package Backend.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Backend.controller.ControllerEj2;
import Backend.model.dto.VideoDto;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Miguel A. Sastre
 *
 */
public class VentanaMostrarTodosVideos extends JFrame{

	private ControllerEj2 controller;
	private JPanel contentPane;
	JTextArea textArea = new JTextArea();
	
	
	public VentanaMostrarTodosVideos() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				mostrarTodosVideos();
			}
			@Override
			public void windowActivated(WindowEvent e) {
				mostrarTodosVideos();
			}
		});
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblTitulo = new JLabel("Todos los Alquileres");
		lblTitulo.setBounds(5, 5, 424, 19);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		contentPane.add(lblTitulo);
		textArea.setLineWrap(true);
		textArea.setTabSize(10);
		contentPane.add(textArea);
		textArea.setBounds(15, 26, 409, 230);
		textArea.setEditable(false);

	}
	
	/**
	 * @param controller the controller to set
	 */
	public void setCoordinador(ControllerEj2 controller) {
		this.controller = controller;
	}
	
	public void limpiar() {
		textArea.setText("");
	}
	
	public void mostrarTodosVideos() {
		LinkedList<VideoDto> listaVideos = this.controller.obtenerVideos();
		limpiar();
		if(!listaVideos.isEmpty()) {
			Iterator<VideoDto> it = listaVideos.iterator();
			while(it.hasNext()) {
				VideoDto video = it.next();
				textArea.append(
						" --- Cliente " + video.getCli_id() + " ---\n" +
						"Id: " + video.getId() + ",\n" +
						"Titulo: " + video.getTitle() + ",\n" +
						"Director: " + video.getDirector() + "\n" +
						"--------------------------\n"
						);
			}
		}
	}
}
