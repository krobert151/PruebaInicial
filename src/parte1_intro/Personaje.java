package parte1_intro;

import java.util.Arrays;
import java.util.Objects;

public class Personaje {

	private String nombre;
	
	private int vida;
	
	private int puntos;
	
	private String[] mochila = new String[9];

	private int posMochila;
	
	public Personaje() {
		super();
	}

	public Personaje(String nombre, int vida, int puntos, String[] mochila, int posMochila) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.puntos = puntos;
		this.mochila = mochila;
		this.posMochila = posMochila;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public String[] getMochila() {
		return mochila;
	}

	public void setMochila(String[] mochila) {
		this.mochila = mochila;
	}

	public int getPosMochila() {
		return posMochila;
	}

	public void setPosMochila(int posMochila) {
		this.posMochila = posMochila;
	}

	public void agregarPocion() {
		
		if(mochila[9].isEmpty()) {
			
			int elementos = 0;
			
			for (int i = 0; i < mochila.length; i++) {
				if(mochila[i].isEmpty()) {
					mochila[i]="Pocion"; 					
				}
				elementos = i;
			}	
			
			System.out.println("Hay "+elementos+1+"elementos en la mochila");
			
		}else {
			
			System.out.println("YA NO PUEDES CONSEGUIR MÁS ELEMENTOS PUES TU MOCHILA ESTÁ COMPLETA");

		}
		
	}
	
	public void recibirGolpe(int puntoGolpe) {
		
		if (vida-puntoGolpe<=0) {
			
			System.out.println("Estás muerto");
			
		}else {
			
			vida -=puntoGolpe;
			
			System.out.println("Te quedan "+vida+" de vida.");
			
		}
		
		
		
	}
	
	public void usarBotiquin() {
		
		boolean tiene = false;
		
		for (int i = 0; i < mochila.length; i++) {
			
			if(mochila[i].equalsIgnoreCase("Botiquin")) {
				
				tiene=true;
				
				if(vida<=90) {
					
					vida=100;
					
				}else {
					
					vida+=10;
					
				}		
			}
		}
		if(!tiene) {
			
			System.out.println("Lo siento pero no tienes botiquin");
			
		}else {
			
			System.out.println("Tus puntos de vida son "+vida);
			
		}
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(mochila);
		result = prime * result + Objects.hash(nombre, posMochila, puntos, vida);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return Arrays.equals(mochila, other.mochila) && Objects.equals(nombre, other.nombre)
				&& posMochila == other.posMochila && puntos == other.puntos && vida == other.vida;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", vida=" + vida + ", puntos=" + puntos + ", mochila="
				+ Arrays.toString(mochila) + ", posMochila=" + posMochila + "]";
	}

	
	
	
	
	
	
	
}
