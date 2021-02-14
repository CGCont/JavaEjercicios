package learning.business.inventos;

public class Invento{
	private String 	nombre;
	private Inventor	creador;

	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return this.nombre;
	}
	public void setInventor(Inventor autor){
		creador = autor;
	}
	public Inventor getInventor(){
		return this.creador;
	}
}
