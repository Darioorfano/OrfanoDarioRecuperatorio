package ar.edu.unlam.orfanodario;

public abstract class Gema implements Hechizable {
private String nombre;



public Gema(String nombre){
	this.nombre=nombre;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public abstract Integer incrementarPoder(Integer poder);


}
