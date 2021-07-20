package ar.edu.unlam.orfanodario;

public class Mente extends Gema {
	
	
	public Mente() {
		super("Mente",3);
		// TODO Auto-generated constructor stub
	
	}

	@Override
	public Integer incrementarPoder(Integer poder) {
		// TODO Auto-generated method stub
		return poder*super.getMultiplicador();
	}

}
