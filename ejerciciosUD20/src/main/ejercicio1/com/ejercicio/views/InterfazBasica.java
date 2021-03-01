/**
 * 
 */
package com.ejercicio.views;

import java.awt.Font;

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
public class InterfazBasica extends JFrame {

	private JPanel contentPane;
	JLabel lblTamaño = new JLabel("Esta etiqueta cambia con los botones");


	/**
	 * Create the frame.
	 */
	public InterfazBasica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblTamaño.setHorizontalAlignment(SwingConstants.CENTER);
		lblTamaño.setBounds(108, 78, 214, 14);
		contentPane.add(lblTamaño);
		
		JButton btnGrande = new JButton("Agrandar");
		btnGrande.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblTamaño.setFont(new Font(lblTamaño.getFont().getName(),lblTamaño.getFont().getStyle(), lblTamaño.getFont().getSize()+1));
				lblTamaño.setSize(lblTamaño.getWidth()+1,lblTamaño.getHeight()+1 );
			}
		});
		btnGrande.setBounds(38, 190, 89, 23);
		contentPane.add(btnGrande);
		
		JButton btnPequeño = new JButton("Empequeñecer");
		btnPequeño.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblTamaño.setFont(new Font(lblTamaño.getFont().getName(),lblTamaño.getFont().getStyle(), lblTamaño.getFont().getSize()-1));
				lblTamaño.setSize(lblTamaño.getWidth()-1,lblTamaño.getHeight()-1);
			}
		});
		btnPequeño.setBounds(307, 190, 89, 23);
		contentPane.add(btnPequeño);
	}
}
