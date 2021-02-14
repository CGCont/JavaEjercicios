package learning.business.roles;

public class Acta{
	private int 	numero;
	private int	libro;
	private int	folio;

	public void setNumero(int num){
		numero = num;
	}
	public int getNumero(){
		return numero;
	}
	public void setLibro(int lib){
		libro = lib;
	}
	public int getLibro(){
		return this.libro;
	}
	public void setFolio(int fol){
		this.folio = fol;
	}
	public int getFolio(){
		return folio;
	}
}
