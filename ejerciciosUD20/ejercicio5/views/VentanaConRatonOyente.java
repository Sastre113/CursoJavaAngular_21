/**
 * 
 */
package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;

/**
 * @author Miguel A. Sastre
 *
 */
public class VentanaConRatonOyente extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	private JButton btnNewButton;



	/**
	 * Create the frame.
	 */
	public VentanaConRatonOyente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
//		textArea.addMouseMotionListener(new MouseMotionAdapter() {
//			@Override
//			public void mouseMoved(MouseEvent e) {
//				textArea.append("El ratón se mueve por encima del área de texto\n");
//			}
//		});
		textArea.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				textArea.append("Cambio en el tamaño de la ventana\n");
			}
		});
		textArea.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				textArea.append("Ventana abierta\n");
			}
		});
		textArea.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent arg0) {
				textArea.append("Rueda del ratón movida\n");
			}
		});
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				textArea.append("Ratón entra al área de texto\n");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea.append("Click del ratón sobre el área\n");
			}
			@Override
			public void mousePressed(MouseEvent e) {
				textArea.append("Click del ratón sobre el área\n");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				textArea.append("Ratón sale del área\n");
			}
		});
		
		contentPane.add(textArea, BorderLayout.CENTER);
		
		btnNewButton = new JButton("Limpiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("");
			}
		});
		contentPane.add(btnNewButton, BorderLayout.NORTH);
	}

}
