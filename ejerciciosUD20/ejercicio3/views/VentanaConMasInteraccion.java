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
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author Miguel A. Sastre
 *
 */
public class VentanaConMasInteraccion extends JFrame {

	private JPanel contentPane;
	JLabel lblBtn1 = new JLabel("Boton 1: 0 veces");
	JLabel lblBtn2 = new JLabel("Boton 2: 0 veces");
	int countBtn1 = 0, countBtn2 = 0;


	/**
	 * Create the frame.
	 */
	public VentanaConMasInteraccion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("Boton 1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblBtn1.setText("Boton 1: " + ++countBtn1 + " veces");
			}
		});
		btn1.setBounds(67, 141, 89, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Boton 2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblBtn2.setText("Boton 2: " + ++countBtn2 + " veces");
			}
		});
		btn2.setBounds(262, 141, 89, 23);
		contentPane.add(btn2);
		
		
		lblBtn1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBtn1.setBounds(55, 73, 111, 14);
		contentPane.add(lblBtn1);
		
		
		lblBtn2.setHorizontalAlignment(SwingConstants.CENTER);
		lblBtn2.setBounds(249, 73, 111, 14);
		contentPane.add(lblBtn2);
	}

}
