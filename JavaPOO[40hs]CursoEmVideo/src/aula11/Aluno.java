package aula11;

import aula11.Pessoa;

public class Aluno extends Pessoa{

	private int matricula;
	private String curso;
		
	//metodos
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " Pagou a mensalidade do curso de " + this.getCurso() + ".");
	}//metodo	

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
