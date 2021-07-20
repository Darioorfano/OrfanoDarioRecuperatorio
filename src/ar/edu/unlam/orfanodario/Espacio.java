package ar.edu.unlam.orfanodario;

public class Espacio extends Gema {

	public Espacio() {
		super("Espacio",2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer incrementarPoder(Integer poder) {
		// TODO Auto-generated method stub
		return poder*super.getMultiplicador();
	}

}
