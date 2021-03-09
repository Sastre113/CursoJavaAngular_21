/**
 * 
 */
package backend.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import backend.controller.Controlador;
import backend.model.dto.Proyecto;

/**
 * @author Miguel A. Sastre
 *
 */
public class GestionProyectos extends JFrame implements ActionListener {


	Controlador controlador;
	private JPanel contentPane;
	private JTextField textFieldiD;
	private JTextField textFieldNom;
	private JButton btnInsertar;
	private JTextField textFieldHoras;
	private JLabel lblHoras;

	public GestionProyectos() {
		setBounds(100, 100, 721, 182);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(32, 11, 663, 123);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblId = new JLabel("Id");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBounds(62, 32, 114, 14);
		panel.add(lblId);
		
		JLabel lblNombre = new JLabel("Nombre Proyecto");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setBounds(204, 32, 129, 14);
		panel.add(lblNombre);
		
		textFieldiD = new JTextField();
		textFieldiD.setBounds(62, 51, 114, 20);
		panel.add(textFieldiD);
		textFieldiD.setColumns(10);
		
		textFieldNom = new JTextField();
		textFieldNom.setBounds(204, 51, 129, 20);
		textFieldNom.setColumns(10);
		panel.add(textFieldNom);
		
		btnInsertar = new JButton("Insertar");
		btnInsertar.setBounds(555, 76, 71, 23);
		panel.add(btnInsertar);
		
		textFieldHoras = new JTextField();
		textFieldHoras.setColumns(10);
		textFieldHoras.setBounds(358, 51, 129, 20);
		panel.add(textFieldHoras);
		
		lblHoras = new JLabel("Horas");
		lblHoras.setHorizontalAlignment(SwingConstants.CENTER);
		lblHoras.setBounds(358, 32, 129, 14);
		panel.add(lblHoras);
		
		
		btnInsertar.addActionListener(this);
		
	}

	/**
	 * @param controlador the controlador to set
	 */
	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == btnInsertar){
			Proyecto nuevoProyecto = new Proyecto();
			nuevoProyecto.setId(this.textFieldiD.getText());
			nuevoProyecto.setNombre(this.textFieldNom.getText());
			nuevoProyecto.setHoras(Double.parseDouble(this.textFieldHoras.getText()));

			this.controlador.añadirProyecto(nuevoProyecto);
		}

	}
}
