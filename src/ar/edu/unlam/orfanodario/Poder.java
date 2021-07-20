package ar.edu.unlam.orfanodario;

public class Poder extends Gema {

	public Poder() {
		super("Poder",3);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer incrementarPoder(Integer poder) {
		// TODO Auto-generated method stub
		return poder*super.getMultiplicador();
	}

}
