package aula11;

import aula11.Aluno;
import aula11.Bolsista;
import aula11.Visitante;

public class Universidade {

	public static void main(String[] args) {
		
		//Pessoa p1 = new Pessoa("Bruno", "M", 44);
		Visitante v1 = new Visitante();
		v1.setNome("Breno");
		v1.setSexo("M");
		v1.setIdade(24);	
		
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Marcos");
		a1.setSexo("M");
		a1.setIdade(56);
		a1.setCurso("Excel");
		a1.setMatricula(1565);
		
		System.out.println(a1.toString());
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Jeremias");
		b1.setSexo("M");
		b1.setIdade(47);
		b1.setCurso("Word");
		b1.setMatricula(4857);
		
		System.out.println(b1.toString());
		b1.pagarMensalidade();
	}//main

}//class
