package learning.business.inventos;

public class Inventor{
	private String 	nombre;
	private Invento[] 	arregloInventos;

	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return this.nombre;
	}
	public void setInventos(Invento[] creaciones ){
		this.arregloInventos = creaciones;
	}
	public Invento[] getInventos(){
		return this. arregloInventos;
	}
	public void setInvento(Invento creacion, int indice){
		this.arregloInventos[indice] = creacion;
	}
	public Invento getInvento(int indice){
		return this.arregloInventos[indice];
	}
}
