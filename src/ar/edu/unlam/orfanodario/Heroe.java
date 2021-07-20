package ar.edu.unlam.orfanodario;

public class Heroe {

private String nombre;
private Integer nivelDePoder;

public Heroe(String nombre, Integer nivelDePoder){
	
	this.nombre=nombre;
	this.nivelDePoder=nivelDePoder;
	
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public Integer getNivelDePoder() {
	return nivelDePoder;
}

public void setNivelDePoder(Integer nivelDePoder) {
	this.nivelDePoder = nivelDePoder;
}


}
