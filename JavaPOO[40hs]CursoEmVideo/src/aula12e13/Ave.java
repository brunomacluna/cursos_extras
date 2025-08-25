package aula12e13;

public class Ave extends Animal{

	private String CorPena;
	
	public void fazerNinho() {
		System.out.println("Construiu um ninho");
	}

	@Override
	public void locomover() {
		System.out.println("Voando");
	}



	@Override
	public void alimentar() {
		System.out.println("Comendo frutas");
	}



	@Override
	public void emitirSom() {
		System.out.println("Som de ave");
	}

	public String getCorPena() {
		return CorPena;
	}

	public void setCorPena(String corPena) {
		CorPena = corPena;
	}
	
	
}
