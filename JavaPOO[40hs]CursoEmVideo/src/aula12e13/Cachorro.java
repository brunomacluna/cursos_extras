package aula12e13;

import aula12e13.Lobo;

public class Cachorro extends Lobo{

	public void enterrarOsso() {
		System.out.println("Enterrando osso");
	}
	
	public void abanarRabo() {
		System.out.println("Abando o rabo");
	}

	@Override
	public void emitirSom() {
		System.out.println("Au! Au! Au1");
	}
	
	public void reagir(String frase) {
		if(frase.equals("Toma comida") || (frase.equals("Olá"))) {
			System.out.println("Abanar e latir");
		}//if
		else {
			System.out.println("Rosnar");
		}//
	}
	
	public void reagir(int hora, int min) {
		if(hora < 12) {
			System.out.println("Abanar");
		}
		else if (hora >= 18) {
			System.out.println("Ignorar");
		}
		else {
			System.out.println("Abanar e latir");
		}
	}
	public void reagir(boolean dono) {
		if (dono) {
			System.out.println("Abanar");
		}
		else {
			System.out.println("Rosnar e latir");
		}
	}
	public void reagir(int idade, double peso) {
		if (idade < 5) {
			if (peso < 10) {
				System.out.println("Abanar");
			}//if 
			else {
				System.out.println("Latir");
			}//else
		}//if
		else {
			if (peso > 10) {
				System.out.println("Rosnar");
			}//if
			else {
				System.out.println("Ignorar");
			}//else
		}//else
				
	}//metodo
	
	
}
