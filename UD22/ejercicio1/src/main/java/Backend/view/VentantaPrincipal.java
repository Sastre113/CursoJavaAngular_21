/**
 * 
 */
package Backend.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Backend.controller.Controller;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import java.awt.Font;

/**
 * @author Miguel A. Sastre
 *
 */
public class VentantaPrincipal extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Controller clienteController;
	private JPanel contentPane;
	private JLabel lblTitular;
	private JButton btnInsertar, btnBuscar, btnMostrarTodo;

	public VentantaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 159);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		lblTitular = new JLabel("App control cliente");
		lblTitular.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblTitular = new GridBagConstraints();
		gbc_lblTitular.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitular.gridx = 4;
		gbc_lblTitular.gridy = 1;
		contentPane.add(lblTitular, gbc_lblTitular);

		btnInsertar = new JButton("Insertar Cliente");
		GridBagConstraints gbc_btnInsertar = new GridBagConstraints();
		gbc_btnInsertar.insets = new Insets(0, 0, 5, 5);
		gbc_btnInsertar.gridx = 2;
		gbc_btnInsertar.gridy = 3;
		contentPane.add(btnInsertar, gbc_btnInsertar);

		btnBuscar = new JButton("Buscar Cliente");
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscar.gridx = 4;
		gbc_btnBuscar.gridy = 3;
		contentPane.add(btnBuscar, gbc_btnBuscar);

		btnMostrarTodo = new JButton("Mostrar Todos");
		GridBagConstraints gbc_btnMostrarTodo = new GridBagConstraints();
		gbc_btnMostrarTodo.insets = new Insets(0, 0, 5, 0);
		gbc_btnMostrarTodo.gridx = 6;
		gbc_btnMostrarTodo.gridy = 3;
		contentPane.add(btnMostrarTodo, gbc_btnMostrarTodo);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnInsertar)
			this.clienteController.mostrarVentanaInsertar();
		if(e.getSource() == btnBuscar)
			this.clienteController.mostrarVentanaBuscar();
		if(e.getSource() == btnMostrarTodo)
			this.clienteController.mostrarVentanaMostrarTodo();
	}
}
