package learning.business.controlProyectos;

public class Proyecto{
	private String 	idProyecto;
	private String 	nombre;
		
	public void setID(String id){
		this.idProyecto = id;
	}
	public String getID(){
		return this.idProyecto;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return this.nombre;
	}
}
