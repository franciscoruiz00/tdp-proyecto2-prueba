package GUI;

public class main {
	
	public static void main (String[] args) {
		
		SplashScreen miSplashScreen =new SplashScreen(3000);
		
		miSplashScreen.initialize();
		
		GUITest miGUI= new GUITest();
		
		miGUI.setVisible(true);
		
		miGUI.iniciarHiloJuego();
	}
	

}
