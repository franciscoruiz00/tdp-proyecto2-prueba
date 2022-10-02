package GUI;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Celda;
import Logica.Juego;
import javax.swing.JLabel;


public class GUITest extends JFrame {

	private JPanel contentPane;
	private Juego miJuego;
	private JLabel lblCasilla;

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
		setResizable(false);


		miJuego = new Juego();

		contentPane.setLayout(new GridLayout(20,20));
		lblCasilla = new JLabel();
		lblCasilla.setBounds(100, 100, 4, 4);
	
		Celda c = miJuego.getGrilla().getCelda(0, 0);
		ImageIcon image = new ImageIcon("#.png");
		lblCasilla.setIcon(new ImageIcon("C:\\Users\\FRAVEGA\\Downloads\\Documents\\TDP\\p2-prueba\\src\\images\\#.png"));
		Icon icon = new ImageIcon(
				image.getImage().getScaledInstance(lblCasilla.getWidth(), lblCasilla.getHeight(), Image.SCALE_DEFAULT)
				);
		contentPane.add(lblCasilla);


		for (int i = 0; i < miJuego.getCantFilas(); i++) {
			for(int j = 0; j < miJuego.getCantColu(); j++) {
				Celda c1 = miJuego.getGrilla().getCelda(i, j);
				ImageIcon imagen = c.getEntidadGrafica().getGrafico();
				lblCasilla.setIcon(image);
		
			}
		}

	}}