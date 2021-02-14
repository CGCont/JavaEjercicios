package learning.business.roles;

public class Persona{
	private int 	numero;
	private String 	nombre;
	private double 	edad;
	private Acta 	acta;
	private Estado	edoNac;
	private Rol[] 	arregloRoles;

	public void setNumero(int numero){
		this.numero = numero;
	}
	public int getNumero(){
		return this.numero;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return this.nombre;
	}
	public void setEdad(double edad){
		if(edad < 0){
			edad = 0;
		}else if(edad > 125){
			edad = 125;
		}
		this.edad = edad;
	}
	public double getEdad(){
		return this.edad;
	}
	public void setActa(Acta acta){
		this.acta = acta;
	}
	public Acta getActa(){
		return this.acta;
	}
	public void setEstado(Estado estado){
		this.edoNac = estado;
	}
	public Estado getEstado(){
		return this.edoNac;
	}
	public void setRoles(Rol[] roles){
		this.arregloRoles = roles;
	}
	public Rol[] getRoles(){
		return this.arregloRoles;
	}
	public void setRol(Rol rol, int indice){
		this.arregloRoles[indice] = rol;
	}
	public Rol getRol(int indice){
		return this.arregloRoles[indice];
	}
}
