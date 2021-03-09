 /**
 * 
 */
package Backend.view;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Backend.controller.ControllerEj2;
import Backend.model.dto.ClienteDto;

/**
 * @author Miguel A. Sastre
 *
 */
public class VentanaBuscarCliente extends JFrame implements ActionListener{

	private JPanel contentPane;
	private ControllerEj2 controller;
	private JTextField textFieldId;
	JButton btnBuscar = new JButton("Buscar");
	JTextArea textArea = new JTextArea();
	
	public VentanaBuscarCliente() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblID = new JLabel("Introduzca el id");
		GridBagConstraints gbc_lblID = new GridBagConstraints();
		gbc_lblID.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblID.insets = new Insets(0, 0, 5, 5);
		gbc_lblID.gridx = 1;
		gbc_lblID.gridy = 0;
		contentPane.add(lblID, gbc_lblID);
		
		
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscar.gridx = 0;
		gbc_btnBuscar.gridy = 1;
		contentPane.add(btnBuscar, gbc_btnBuscar);
		
		textFieldId = new JTextField();
		GridBagConstraints gbc_textFieldId = new GridBagConstraints();
		gbc_textFieldId.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldId.anchor = GridBagConstraints.WEST;
		gbc_textFieldId.gridx = 1;
		gbc_textFieldId.gridy = 1;
		contentPane.add(textFieldId, gbc_textFieldId);
		textFieldId.setColumns(10);
		
		
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridwidth = 2;
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 1;
		gbc_textArea.gridy = 2;
		contentPane.add(textArea, gbc_textArea);
		
		
		btnBuscar.addActionListener(this);
	}
	
	public void setCoordinador(ControllerEj2 controller) {
		this.controller = controller;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == btnBuscar) {
			try {
				mostrarCliente(this.controller.buscarCliente(this.textFieldId.getText()));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Error en el Ingreso de Datos","Error",JOptionPane.ERROR_MESSAGE);
				System.out.println(e);
			}
		}
	}
	
	public void mostrarCliente(ClienteDto clienteDto) {
		textArea.setText("id: "+clienteDto.getId()+"\n"+
				"Nombre: "+clienteDto.getNombre()+"\n"+
				"Apellido: "+clienteDto.getApellido()+"\n"+
				"Direccion: "+clienteDto.getDireccion()+"\n"+
				"DNI: "+clienteDto.getDni()+"\n");
	}
}
