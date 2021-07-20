package ar.edu.unlam.orfanodario;

public class Personaje {
	private String nombre;
	private Integer nivelDePoder;

public Personaje(String nombre,Integer nivelDePoder){
	
	this.nombre=nombre;
	this.nivelDePoder=nivelDePoder;
	
}
	
	

public void utilizarGema(Gema alma) {
		
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
	return result;
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Personaje other = (Personaje) obj;
	if (nombre == null) {
		if (other.nombre != null)
			return false;
	} else if (!nombre.equals(other.nombre))
		return false;
	return true;
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
