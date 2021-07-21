package ar.edu.unlam.orfanodario;

public class Heroe extends Personaje implements Comparable<Heroe> {

	public Heroe(String nombre, Integer nivelDePoder) {
		super(nombre, nivelDePoder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Heroe o) {
		// TODO Auto-generated method stub
		return o.getNombre().compareTo(super.getNombre());
	}

	




}
