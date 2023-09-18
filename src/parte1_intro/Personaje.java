package parte1_intro;

import java.util.Arrays;
import java.util.Objects;

public class Personaje {

	private String nombre;
	
	private int vida;
	
	private int puntosFuerza;
	
	private int puntos;
	
	private String[] mochila = new String[9];

	private int posMochila;
	
	public Personaje() {
		super();
	}



	public Personaje(String nombre, int vida, int puntosFuerza, int puntos, String[] mochila, int posMochila) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.puntosFuerza = puntosFuerza;
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

	
	
	public int getPuntosFuerza() {
		return puntosFuerza;
	}

	public void setPuntosFuerza(int puntosFuerza) {
		this.puntosFuerza = puntosFuerza;
	}

	public void agregarPocion(String pocion) {
		
		if(mochila[9]==null) {		
			for (int i = 0; i < mochila.length; i++) {
				if(mochila[i]==null) {
					mochila[i]=pocion;
					
				}
			}
		}
			
			

	}	
		
	
	
	public void recibirGolpe(int puntoGolpe) {
		
		if (vida-puntoGolpe<=0) {
			
			System.out.println(nombre+" ha muerto");
			vida=0;
			
		}else {
			
			vida -=puntoGolpe;
			
			System.out.println("a "+nombre+" le quedan "+vida+" puntos de vida.");
			
		}
		
		
		
	}
	
	public void usarBotiquin() {
		
		if(vida<30) {
			
		
		
		boolean tiene = false;
		
		for (int i = 0; i < mochila.length; i++) {
					
		if(mochila[i]!=null) {
			
			if(mochila[i].equalsIgnoreCase("Botiquin")) {
				
				tiene=true;
				
				if(vida>=90) {
					
					vida=100;
					
				}else {
					
					vida+=10;
					
				}	
				
				mochila[i] = null;
				
			}
		}
		
	}
		if(!tiene) {
			
			System.out.println(nombre+" no tiene botiquin");
			
		}else {
			
			System.out.println(nombre+ " ha usado un botiquin y ahora tiene "+vida+ " de vida");
			
		}
	}else {
		
		System.out.println("Tiene demasiada vida");
	}

	}
	public void pocionFuerza() {
		
		if(vida<30) {

		boolean tiene = false;
		
		for (int i = 0; i < mochila.length; i++) {
			
			if(mochila[i]!=null) {
			
			if(mochila[i].equalsIgnoreCase("PocionF")) {
				
				tiene=true;
				
				puntosFuerza = puntosFuerza *2;
				
				mochila[i] = null;

			}
		}
		}
		if(!tiene) {
			
			System.out.println(nombre+" no tiene poción de Fuerza");
			
		}else {
			
			System.out.println("Los ataques de "+nombre+" son mas fuertes");
			
		}
			}else {
		
				System.out.println("Tiene demasiada vida");
			}
	}	
		
		
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(mochila);
		result = prime * result + Objects.hash(nombre, posMochila, puntos, puntosFuerza, vida);
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
				&& posMochila == other.posMochila && puntos == other.puntos && puntosFuerza == other.puntosFuerza
				&& vida == other.vida;
	}



	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", vida=" + vida + ", puntosFuerza=" + puntosFuerza + ", puntos="
				+ puntos + ", mochila=" + Arrays.toString(mochila) + ", posMochila=" + posMochila + "]";
	}
	
	
	
	
	
	
	
	
	
}
