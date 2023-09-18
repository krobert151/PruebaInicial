package parte1_intro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String item = "Botiquin";

		int menu;
		int select;
		
		String[] mochilaj1 = new String[10];
		
		mochilaj1[0]="Botiquin";
		mochilaj1[1]="PocionF";

		
		Personaje j1 = new Personaje("Jugador1",100,4,50,mochilaj1,0); 
		
		String[] mochilaj2 = new String[10];
		
		mochilaj2[0]="Botiquin";

		
		Personaje j2 = new Personaje("Jugador2",80,4,40,mochilaj2,0);
		
		
		Batalla pelea = new Batalla (j1,j2);
		
		
		
		do {
			
			System.out.println("1.-Pelear");
			System.out.println("2.-Usar Botiquin");
			System.out.println("3.-Usar Pocion fuerza");
			System.out.println("4.-Agregar Item");
			System.out.println("5.-Saltar");
			System.out.println("6.-Volar");
			System.out.println("7.-Volverse invisible");
			menu = sc.nextInt();
			
			switch(menu) {
			
			case 1:
				
				pelea.luchar();
				
				break;
			case 2:
				
				System.out.println("Quien debe usar el botiquin");
				System.out.println("1.-"+j1.getNombre());
				System.out.println("2.-"+j2.getNombre());
				select= sc.nextInt();
				
				if(select==1) {
					j1.usarBotiquin();
				}else {
					j2.usarBotiquin();
				}
				
				break;
			case 3:
				
				System.out.println("Quien debe usar la pocion de fuerza");
				System.out.println("1.-"+j1.getNombre());
				System.out.println("2.-"+j2.getNombre());
				select= sc.nextInt();
				
				if(select==1) {
					j1.pocionFuerza();;
				}else {
					j2.pocionFuerza();;
				}
				
				break;
			case 4:
				System.out.println("Que item quieres agregar");
		        item = sc.next();
				System.out.println("A quien se le agrega "+item);
				System.out.println("1.-"+j1.getNombre());
				System.out.println("2.-"+j2.getNombre());
				select= sc.nextInt();
				
				if(select==1) {
					j1.agregarPocion(item);;
				}else {
					j2.agregarPocion(item);;
				}
								
				break;
			case 5:
				System.out.println("A quien se le agrega ");
				System.out.println("1.-"+j1.getNombre());
				System.out.println("2.-"+j2.getNombre());
				select= sc.nextInt();
				
				
				
				break;
				
			}
			
			
			
		}while(menu!=0);
		
		

	}

}
