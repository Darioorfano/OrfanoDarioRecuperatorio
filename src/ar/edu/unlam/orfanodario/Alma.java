package ar.edu.unlam.orfanodario;

public class Alma extends Gema {

	public Alma() {
		super("Alma",2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer incrementarPoder(Integer poder) {
		// TODO Auto-generated method stub
		return poder*super.getMultiplicador();
	}

}
