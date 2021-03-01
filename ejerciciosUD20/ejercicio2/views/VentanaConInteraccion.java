/**
 * 
 */
package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

/**
 * @author Miguel A. Sastre
 *
 */
public class VentanaConInteraccion extends JFrame {

	private JPanel contentPane;
	JLabel etiquetaCambiante = new JLabel("Esta etiqueta cambia");
	JButton btn1 = new JButton("Boton1");
	JButton btn2 = new JButton("Boton2");
	
	/**
	 * Create the frame.
	 */
	public VentanaConInteraccion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		etiquetaCambiante.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaCambiante.setBounds(120, 91, 178, 14);
		contentPane.add(etiquetaCambiante);
		
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				etiquetaCambiante.setText("Has pulsado: " + btn1.getText());
			}
		});
		btn1.setBounds(55, 143, 89, 23);
		contentPane.add(btn1);
		
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				etiquetaCambiante.setText("Has pulsado: " + btn2.getText());
			}
		});
		btn2.setBounds(259, 143, 89, 23);
		contentPane.add(btn2);
	}

}
