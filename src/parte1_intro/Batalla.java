package parte1_intro;

import java.util.Objects;

public class Batalla {

	private Personaje j1;
	
	private Personaje j2;

	public Batalla(Personaje j1, Personaje j2) {
		super();
		this.j1 = j1;
		this.j2 = j2;
	}

	public Personaje getJ1() {
		return j1;
	}

	public void setJ1(Personaje j1) {
		this.j1 = j1;
	}

	public Personaje getJ2() {
		return j2;
	}

	public void setJ2(Personaje j2) {
		this.j2 = j2;
	}

	public void luchar() {
		
		int damage = 0;
		
			
			int random = (int) (Math.random() * 3 + 1);
			
			if(j1.getVida()>0) {
				
			damage = random*j1.getPuntosFuerza();
			
			System.out.println(j1.getNombre()+" ha hecho un ataque de "+damage+" a "+j2.getNombre());
			
			j2.recibirGolpe(damage);
			
			}
			
			if(j2.getVida()>0) {
				
			damage = random*j2.getPuntosFuerza();
			
			System.out.println(j2.getNombre()+" ha hecho un ataque de "+damage+" a "+j1.getNombre());
			
			j1.recibirGolpe(damage);


			}
			
		}
		
	
	
	@Override
	public int hashCode() {
		return Objects.hash(j1, j2);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Batalla other = (Batalla) obj;
		return Objects.equals(j1, other.j1) && Objects.equals(j2, other.j2);
	}

	@Override
	public String toString() {
		return "Batalla [j1=" + j1 + ", j2=" + j2 + "]";
	}
	
	
	
	
	
}
