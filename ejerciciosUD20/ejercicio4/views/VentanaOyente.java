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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.awt.event.WindowFocusListener;

/**
 * @author Miguel A. Sastre
 *
 */
public class VentanaOyente extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;



	/**
	 * Create the frame.
	 */
	public VentanaOyente() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				textArea.append("Se abre la ventana\n");
			}
			@Override
			public void windowDeactivated(WindowEvent e) {
				textArea.append("Se cierra la ventana\n");
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblEventos = new JLabel("Eventos");
		contentPane.add(lblEventos, BorderLayout.WEST);
		
		textArea = new JTextArea();
		textArea.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				textArea.append("Cambio en el tamaño de la ventana\n");
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
				textArea.append("Ratón encima del área de texto\n");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea.append("Click del ratón sobre el área\n");
			}
		});
		
		contentPane.add(textArea, BorderLayout.CENTER);
	}

}
