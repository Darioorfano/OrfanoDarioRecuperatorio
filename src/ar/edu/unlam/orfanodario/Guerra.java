package ar.edu.unlam.orfanodario;


import java.util.Set;
import java.util.TreeSet;

import ar.edu.unlam.orfanodario.excepciones.WorldDestroyedException;


public class Guerra {
	
	private Integer contadorDeVictoriasDeHeroes=0;
	private Integer contadorDeVictoriasDeVillanos=0;
	private Set<Heroe>listaDeHeroesGanadores;
	private Set<Villano>listaDeVillanosGanadores;
	
	public Guerra(){
	this.listaDeHeroesGanadores=new TreeSet<>();
	this.listaDeVillanosGanadores=new TreeSet<>();
		
		
	}

public String crearBatalla(Personaje heroe, Personaje villano) {
	// TODO Auto-generated method stub
	
	if(heroe.getNivelDePoder()>villano.getNivelDePoder()){
		this.contadorDeVictoriasDeHeroes++;
		this.listaDeHeroesGanadores.add((Heroe)heroe);
		return "El Heroe es el ganador";
	}else {
		this.contadorDeVictoriasDeVillanos++;
		this.listaDeVillanosGanadores.add((Villano)villano);
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

public Set<Heroe> getListaDeHeroesGanadores() {
	return listaDeHeroesGanadores;
}

public void setListaDeHeroesGanadores(Set<Heroe> listaDeHeroesGanadores) {
	this.listaDeHeroesGanadores = listaDeHeroesGanadores;
}

public Set<Villano> getListaDeVillanosGanadores() {
	return listaDeVillanosGanadores;
}

public void setListaDeVillanosGanadores(Set<Villano> listaDeVillanosGanadores) {
	this.listaDeVillanosGanadores = listaDeVillanosGanadores;
}


}
