package ar.edu.unlam.orfanodario;

public class Villano extends Personaje implements Comparable<Villano> {

	public Villano(String nombre, Integer nivelDePoder) {
		super(nombre, nivelDePoder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Villano o) {
		// TODO Auto-generated method stub
		return super.getNombre().compareTo(o.getNombre());
	}
	


	
	
	
}
