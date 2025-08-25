package aula10;

import aula10.Pessoa;

public class Aluno extends Pessoa{

	private int matricula;
	private String curso;
	
	
	public Aluno(String nome, String sexo, int idade) {
		super(nome, sexo, idade);
	}//construtor
	
	public Aluno(String nome, String sexo, int idade, int matricula, String curso) {
		super(nome, sexo, idade);
		this.matricula = matricula;
		this.curso = curso;
	}//construtor
	
	//metodos
	public void cancelarMatricula() {
		System.out.println("Matrícula cancelada.");
	}//metodo	
	
	@Override
	public String toString() {
		return super.toString() + " Matricula = " + matricula + ", Curso = " + curso;
	}
	//metodos especiais	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}//class
