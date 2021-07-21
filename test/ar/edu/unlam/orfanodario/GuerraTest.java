package ar.edu.unlam.orfanodario;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Test;

import ar.edu.unlam.orfanodario.excepciones.WorldDestroyedException;

public class GuerraTest {

	@Test
	public void  testQueVerificaQueLosGanadoresFueronLosHeroes() throws WorldDestroyedException {
		Personaje capitan = new Heroe("Capitan America", 2000);
		Personaje loki=new Villano("Loki",300);
		Personaje thor = new Heroe("Thor", 200);
		Personaje hela=new Villano("Hela",500);
		Personaje hulk = new Heroe("Hulk", 700);
		Personaje redSkull=new Villano("RedSkull",100);
		Guerra guerra=new Guerra();
		Gema alma=new Alma();
		Gema tiempo=new Tiempo();
		Gema espacio=new Espacio();
		Gema mente=new Mente();
		Gema realidad=new Realidad();
		Gema poder=new Poder();
		
		capitan.utilizarGema(alma);
		loki.utilizarGema(tiempo);
		thor.utilizarGema(espacio);
		hela.utilizarGema(mente);
		hulk.utilizarGema(realidad);
		redSkull.utilizarGema(poder);
		
		guerra.crearBatalla(capitan,loki);
		guerra.crearBatalla(thor,hela);
		guerra.crearBatalla(hulk,redSkull);
		
		assertEquals("Ganaron los heroes",guerra.obtenerResultado());
			
	}
	
	@Test(expected=WorldDestroyedException.class)
	
	public void testQueVerificaQueLosGanadoresFueronLosVillanos()throws WorldDestroyedException {
		Personaje capitan = new Heroe("Capitan America", 100);
		Personaje loki=new Villano("Loki",2000);
		Personaje thor = new Heroe("Thor", 200);
		Personaje hela=new Villano("Hela",500);
		Personaje hulk = new Heroe("Hulk", 700);
		Personaje redSkull=new Villano("RedSkull",1020);
		Guerra guerra=new Guerra();
		Gema alma=new Alma();
		Gema tiempo=new Tiempo();
		Gema espacio=new Espacio();
		Gema mente=new Mente();
		Gema realidad=new Realidad();
		Gema poder=new Poder();
		
		capitan.utilizarGema(alma);
		loki.utilizarGema(tiempo);
		thor.utilizarGema(espacio);
		hela.utilizarGema(mente);
		hulk.utilizarGema(realidad);
		redSkull.utilizarGema(poder);
		
		guerra.crearBatalla(capitan,loki);
		guerra.crearBatalla(thor,hela);
		guerra.crearBatalla(hulk,redSkull);
		
		guerra.obtenerResultado();
		
		
	}
	
	
	@Test 
	public void testQueVerificaQueLosHeroesSeEncuentranOrdenadosPorNombreDeManeraAscendente() {
		Personaje capitan = new Heroe("Capitan America", 100);
		Personaje loki=new Villano("Loki",2000);
		Personaje thor = new Heroe("Thor", 200);
		Personaje hela=new Villano("Hela",500);
		Personaje hulk = new Heroe("Hulk", 700);
		Personaje redSkull=new Villano("RedSkull",1020);
		Guerra guerra=new Guerra();
		
		
		guerra.crearBatalla(thor, loki);
		guerra.crearBatalla(hulk,hela);
		TreeSet<Heroe>listaDeHeroesOrdenadaPorNombreDeManeraAscendente=new TreeSet<>();
		

		assertEquals(listaDeHeroesOrdenadaPorNombreDeManeraAscendente,guerra.getListaDeHeroesGanadores());
		
		
	}
	


}
