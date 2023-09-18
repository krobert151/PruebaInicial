package parte1_intro;

public class Main {

	public static void main(String[] args) {
		
		String[] mochilaj1 = new String[10];
		
		mochilaj1[0]="Botiquin";
		mochilaj1[1]="PocionF";

		
		Personaje j1 = new Personaje("Jugador1",100,4,50,mochilaj1,0); 
		
		String[] mochilaj2 = new String[10];
		
		mochilaj2[0]="Botiquin";

		
		Personaje j2 = new Personaje("Jugador2",80,4,40,mochilaj2,0);
		
		
		Batalla pelea = new Batalla (j1,j2);
		
		pelea.luchar();
		
		

	}

}
