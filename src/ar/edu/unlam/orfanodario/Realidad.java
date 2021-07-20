package ar.edu.unlam.orfanodario;

public class Realidad extends Gema {

	public Realidad() {
		super("Realidad",2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer incrementarPoder(Integer poder) {
		// TODO Auto-generated method stub
		return poder*super.getMultiplicador();
	}

}
