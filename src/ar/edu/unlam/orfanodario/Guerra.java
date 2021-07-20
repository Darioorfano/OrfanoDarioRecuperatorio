package ar.edu.unlam.orfanodario;

import java.util.HashSet;
import java.util.Set;

public class Guerra {

	private Set<Heroe>heroes;
	private Set<Villano>villanos;
	
	public Guerra(){
	this.heroes=new HashSet<>();
	this.villanos=new HashSet<>();
		
		
	}
public Boolean agregarLuchador(Personaje personaje){
	if(personaje.getNombre().equals(this.heroes)){
		return this.heroes.add((Heroe)personaje);
	}else {
		return this.villanos.add((Villano)personaje);
	}
	
}
	

	

}
