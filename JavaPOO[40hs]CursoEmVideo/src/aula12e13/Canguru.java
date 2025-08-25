package aula12e13;

import aula12e13.Mamifero;

public class Canguru extends Mamifero{

	public void usarBolsa() {
		System.out.println("Usando bolsa");
	}

	@Override
	public void locomover() {
		System.out.println("Saltando");
	}
	
	
}
