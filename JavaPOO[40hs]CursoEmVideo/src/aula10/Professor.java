package aula10;

public class Professor extends Pessoa{

	private String especialidade;
	private double salario;
	
	public Professor(String nome, String sexo, int idade) {
		super(nome, sexo, idade);
	}//construtor

	public Professor(String nome, String sexo, int idade, String especialidade, double salario) {
		super(nome, sexo, idade);
		this.especialidade = especialidade;
		this.salario = salario;
	}//construtor
	
	//metodos
	public double receberAumento(double valor) {
		this.salario += valor;
		return this.salario;
	}//metodo

	@Override
	public String toString() {
		return super.toString() + " Especialidade = " + especialidade + ", Salário = " + salario;
	}

	//metodos especiais
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}	
	
}//class
