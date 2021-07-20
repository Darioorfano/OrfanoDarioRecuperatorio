package ar.edu.unlam.orfanodario;

public abstract class Gema implements Hechizable {
private String nombre;
private Integer multiplicador;

public Gema(String nombre,Integer multiplicador){
	this.nombre=nombre;
	this.multiplicador=multiplicador;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public abstract Integer incrementarPoder(Integer poder);


public Integer getMultiplicador() {
	return multiplicador;
}

public void setMultiplicador(Integer multiplicador) {
	this.multiplicador = multiplicador;
}
}
