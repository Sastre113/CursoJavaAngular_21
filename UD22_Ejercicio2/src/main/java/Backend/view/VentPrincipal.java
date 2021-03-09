/**
 * 
 */
package Backend.view;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import Backend.controller.ControllerEj2;

import javax.swing.border.BevelBorder;


/**
 * @author Miguel A. Sastre
 *
 */
public class VentPrincipal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private ControllerEj2 controller;
	private JPanel contentPane;
	private JLabel lblTitular;
	private JButton btnInsertar, btnBuscar, btnBuscarVideo,btnInsertarVideo,btnMostrarTodos;

	public VentPrincipal() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 223);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(67, 50, 414, 37);
		contentPane.add(panel_1);

		btnInsertar = new JButton("Insertar Cliente");
		panel_1.add(btnInsertar);

		

		btnBuscar = new JButton("Buscar Cliente");
		panel_1.add(btnBuscar);

		lblTitular = new JLabel("Control de clientes");
		lblTitular.setBounds(207, 22, 140, 19);
		contentPane.add(lblTitular);
		lblTitular.setFont(new Font("Tahoma", Font.BOLD, 15));

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1_1.setBounds(67, 123, 414, 37);
		contentPane.add(panel_1_1);

		btnInsertarVideo = new JButton("Insertar Alquiler Video");
		panel_1_1.add(btnInsertarVideo);
	    
	    btnMostrarTodos = new JButton("Mostrar Todos");
	    panel_1_1.add(btnMostrarTodos);

	    btnBuscarVideo = new JButton("Buscar");
		panel_1_1.add(btnBuscarVideo);

		JLabel lblTitular2 = new JLabel("Alquiler de videos");
		lblTitular2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTitular2.setBounds(207, 93, 140, 19);
		contentPane.add(lblTitular2);
		
		// Eventos
		btnInsertar.addActionListener(this);
		btnBuscar.addActionListener(this);
		btnBuscarVideo.addActionListener(this);
		btnInsertarVideo.addActionListener(this);
		btnMostrarTodos.addActionListener(this);
		
	}

	public void setCoordinador(ControllerEj2 controller) {
		this.controller = controller;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnInsertar)
			this.controller.showVentanaInsertarCliente();
		if (e.getSource() == btnBuscar)
			this.controller.showVentanaBuscarCliente();
		if (e.getSource() == btnBuscarVideo)
			this.controller.showVentanaBuscarVideo();
		if (e.getSource() == btnInsertarVideo)
			this.controller.showVentanaInsertarVideo();
		if(e.getSource() == btnMostrarTodos)
			this.controller.showMostrarTodo();
	}
}
