package ar.edu.unlam.orfanodario;

import java.util.HashSet;
import java.util.Set;

public class Guerra {
	
	private Integer contadorDeVictoriasDeHeroes=0;
	private Integer contadorDeVictoriasDeVillanos=0;
	private Set<Heroe>heroes;
	private Set<Villano>villanos;
	
	public Guerra(){
	this.heroes=new HashSet<>();
	this.villanos=new HashSet<>();
		
		
	}

public String crearBatalla(Personaje personaje1, Personaje personaje2) {
	// TODO Auto-generated method stub
	
	if(personaje1.getNivelDePoder()>personaje2.getNivelDePoder()){
		this.contadorDeVictoriasDeHeroes++;
		return "El Heroe es el ganador";
	}else {
		this.contadorDeVictoriasDeVillanos++;
		return "El villano es el ganador";
		
	}
}
	
public String obtenerResultado() throws WorldDestroyedException{
	
	   if(this.contadorDeVictoriasDeHeroes > this.contadorDeVictoriasDeVillanos) {
	     return "Ganaron los heroes";
	   }else {
	     throw new WorldDestroyedException();
	}
	
}
	

}
