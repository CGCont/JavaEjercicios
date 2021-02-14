package learning.business.controlProyectos;

public class Investigador{
	private String 	idInvestigador;
	private String 	nombre;
	private Asignacion[]	proyectosAsignados;
	
	public void setID(String id){
		this.idInvestigador = id;
	}
	public String getID(){
		return this.idInvestigador;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return this.nombre;
	}
	public void setProyectosAsignados(Asignacion[] asignaciones ){
		this.proyectosAsignados = asignaciones;
	}
	public Asignacion[] getProyectosAsignados(){
		return this. proyectosAsignados;
	}
	public void setProyectoAsignado(Asignacion asignacion, int indice){
		this.proyectosAsignados[indice] = asignacion;
	}
	public Asignacion getProyectoAsignado(int indice){
		return this.proyectosAsignados[indice];
	}
}
