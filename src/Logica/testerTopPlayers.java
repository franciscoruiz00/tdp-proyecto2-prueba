package Logica;

public class testerTopPlayers {

	
	public static void main(String[] args) {

		
		Jugador j1 = new Jugador("Juan"); 
		j1.aumentarPuntaje(234);
		
		Jugador j2 = new Jugador("Toto"); 
		j2.aumentarPuntaje(24);
		
		Jugador j3 = new Jugador("Alberto"); 
		j3.aumentarPuntaje(634);
		
		Jugador j4 = new Jugador("Tobi"); 
		j4.aumentarPuntaje(1634);
		
		Jugador j5 = new Jugador("Julian"); 
		j5.aumentarPuntaje(2);
		
	    TopJugadores top5 = new TopJugadores();
	    
	    
	    try {
	    	top5.guardar(j1);
	    	top5.guardar(j2);
	    	top5.guardar(j3);
	    	top5.guardar(j4);
			top5.guardar(j5);
		} catch (Exception e) {e.printStackTrace();
		}
	   

		try {
			TopJugadores nuevo = top5.leer();
				
			while(!nuevo.getJugadores().isEmpty()) {
				System.out.println(nuevo.getJugadores().remove().getNombre());
			}
		} catch (Exception e) {e.printStackTrace();}
			
	}

}
