package learning.business.roles;

public class Estado{
	private int 	numero;
	private String 	nombre;

	public void setNumero(int numero){
		if (numero <= 0){
			numero = 1;
		}
		if (numero > 32){
			numero = 32;
		}
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
}
