package aula04;

public class Caneta {
	public String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	public Caneta(String m, String c, float p) {
		this.setModelo (m);
		this.setCor (c);
		this.setPonta (p);
		this.tampar();
		
	}//construtor
	
	public String getModelo () {
		return this.modelo;
	}//getModelo
	public void setModelo(String m) {
		this.modelo = m;
	}//setModelo
	
	public String getCor() {
		return this.cor;
	}//getCor
	public void setCor(String c) {
		this.cor = c;
	}//setCor
	
	public float getPonta() {
		return this.ponta;
	}//getPonta
	public void setPonta(float p) {
		this.ponta = p;
	}//setPonta
	
	public void tampar() {
		this.tampada = true;
	}//tampar
	public void destampar() {
		this.tampada = false;
	}//destampar
	
	public void status() {
		System.out.println("Sobre a caneta: ");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada: " + this.tampada);
		System.out.println(" " );
		
	}//status
}//class
