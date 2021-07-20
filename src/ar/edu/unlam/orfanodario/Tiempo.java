package ar.edu.unlam.orfanodario;

public class Tiempo extends Gema {

		public Tiempo() {
		super("Tiempo",3);
		// TODO Auto-generated constructor stub

}

	@Override
	public Integer incrementarPoder(Integer poder) {
		// TODO Auto-generated method stub
		
		return poder*super.getMultiplicador();
	}

}
