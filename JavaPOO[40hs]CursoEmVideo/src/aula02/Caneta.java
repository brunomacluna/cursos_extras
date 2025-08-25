package aula02;

public class Caneta {
	
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Modelo " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta " + this.ponta);
		System.out.println("Carga " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}//fim metodo
	
	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar.");
		} else {
			System.out.println("Estou Rabiscando.");
		}//fim if else			
	}//fim metodo
	
	void tampar() {
		this.tampada = true;
	}//fim metodo
		
	void destampar() {
		this.tampada = false;
	}//fim metodo
}//fim class
  