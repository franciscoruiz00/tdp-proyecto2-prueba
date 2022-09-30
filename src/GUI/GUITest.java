package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Celda;
import Logica.Juego;

public class GUITest extends JFrame {

	private JPanel contentPane;
	private Juego juego;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUITest frame = new GUITest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUITest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		juego = new Juego();
		contentPane.setLayout(new GridLayout(juego.getCantFilas(),juego.getCantColu()));
		
		for (int i = 0; i < juego.getCantFilas(); i++) {
			for(int j = 0; j < juego.getCantColu(); j++) {
				Celda c = juego.getCelda(i, j);
				ImageIcon image = c.getEntidadGraf().getGrafico();
				
	}

}
}}
