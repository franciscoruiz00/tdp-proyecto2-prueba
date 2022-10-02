package GUI;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SplashScreen implements Runnable {

	private JFrame frame;
	private Thread tiempo=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SplashScreen window = new SplashScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SplashScreen() {
		initialize();
		tiempo= new Thread(this);
		tiempo.start();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 600, 400);
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 600, 400);
		frame.getContentPane().add(lblNewLabel);
		ImageIcon icon= new ImageIcon(this.getClass().getResource("/images/SS2.jpg"));
		lblNewLabel.setIcon(icon);
	}
	
	
	public void run() {

		try {
			while(tiempo!=null) {
				Thread.sleep(4000);
				new GUITest().setVisible(true);
				Thread.sleep(5000);
         }
			tiempo=null;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

