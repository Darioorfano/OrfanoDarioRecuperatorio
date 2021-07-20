package ar.edu.unlam.orfanodario;

import static org.junit.Assert.*;

import org.junit.Test;

public class GuerraTest {

	@Test
	public void test() {
		Personaje capitan = new Heroe("Capitán America", 2000);
		Personaje loki=new Villano("Loki",300);
		Guerra guerra=new Guerra();
		Gema alma=new Alma();
		Gema tiempo=new Tiempo();
		
		guerra.crearBatalla(capitan,loki);
		
		capitan.utilizarGema(alma);
		loki.utilizarGema(tiempo);
	}

}
