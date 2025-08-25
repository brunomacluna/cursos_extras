package aula10;

import aula10.Funcionario;
import aula10.Pessoa;
import aula10.Professor;

public class Faculdade {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro", "M", 22);
		Aluno p2 = new Aluno("Maria", "F", 18, 1563, "ADS");
		Professor p3 = new Professor("Cláudio", "M", 49, "Java", 9780.25);
		Funcionario p4 = new Funcionario("Fabiana", "F", 39, "Limpeza", true);
		
		p2.fazerAniv();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
				

	}//main

}//class
