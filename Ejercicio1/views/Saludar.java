/**
 * 
 */
package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * @author Miguel A. Sastre
 *
 */
public class Saludar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	/**
	 * Create the frame.
	 */
	public Saludar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Escribe tu nombre y pulsa el boton para saludarte");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(31, 49, 268, 55);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(75, 125, 171, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Saludar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setText("¡Hola " + textField.getText() + "!");
			}
		});
		btnNewButton.setBounds(114, 172, 89, 23);
		contentPane.add(btnNewButton);
	}
}
