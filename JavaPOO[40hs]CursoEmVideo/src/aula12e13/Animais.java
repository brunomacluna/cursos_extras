package aula12e13;

import aula12e13.Arara;
import aula12e13.Ave;
import aula12e13.Cachorro;
import aula12e13.Canguru;
import aula12e13.Cobra;
import aula12e13.Mamifero;
import aula12e13.Peixe;
import aula12e13.Reptil;
import aula12e13.Tartaruga;

public class Animais {

	public static void main(String[] args) {
		
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		m.locomover();
		r.locomover();
		p.locomover();
		a.locomover();
		
		Cachorro c = new Cachorro();
		Canguru c1 = new Canguru();
		Tartaruga t = new Tartaruga();
		Cobra c2 = new Cobra();
		Arara a1 = new Arara();
		
		c.locomover();
		c1.locomover();
		t.locomover();
		c2.locomover();
		a1.locomover();
		
		System.out.println();
		
		c.reagir("Olá");
		c.reagir("Vai apanhar");
		c.reagir(11, 45);
		c.reagir(21, 00);
		c.reagir(true);
	    c.reagir(false);
	    c.reagir(2, 12.5);
	    c.reagir(17, 4.5);
	}//main

}
