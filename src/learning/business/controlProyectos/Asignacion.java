package learning.business.controlProyectos;

public class Asignacion{
	private String 	horario;
	private double 	salario;
	private Proyecto 	proyecto;
	
	public void setHorario(String horario){
		this.horario = horario;
	}
	public String getHorario(){
		return this.horario;
	}
	public void setSalario(double salario){
		this.salario = salario;
	}
	public double getSalario(){
		return this.salario;
	}
	public void setProyecto(Proyecto proyecto){
		this.proyecto = proyecto;
	}
	public  Proyecto getProyecto(){
		return this.proyecto;
	}
}
