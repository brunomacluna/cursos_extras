package aula03;

public class Caneta {
	
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	public void status() {
		System.out.println("Modelo " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta " + this.ponta);
		System.out.println("Carga " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}//fim metodo
	
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar.");
		} else {
			System.out.println("Estou Rabiscando.");
		}//fim if else			
	}//fim metodo
	
	public void tampar() {
		this.tampada = true;
	}//fim metodo
		
	public void destampar() {
		this.tampada = false;
	}//fim metodo
}//fim class
  