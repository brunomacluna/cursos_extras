package aula10;

public class Pessoa {

	private String nome, sexo;
	private int idade;
	
	public Pessoa(String nome, String sexo, int idade) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}//construtor

	//metodos
	public void fazerAniv() {
		this.idade++;
	}
	
	@Override
	public String toString() {
		return "Nome = " + nome + ", Sexo = " + sexo + ", Idade = " + idade + ",";
	}

	//metodos especiais
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
	
}//class
