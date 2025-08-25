package aula07e08;

public class Lutador {

	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, 
			int vitorias, int derrotas, int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}//construtor
	
	//metodos publicos
	
	public void apresentar() {
		System.out.println("--------------------------------------------");
		System.out.println("Chegou a Horaaaaa! Apresentamos o Lutador: " + this.getNome());
		System.out.println("Direeeeetamente de: " + this.getNacionalidade());
		System.out.println("Com " + this.getIdade() + " anos");
		System.out.println("Medindo " + this.getAltura() + " de altura");
		System.out.println("Pesando: " + this.getPeso() + " Kg");
		System.out.println("Ganhou: " + this.getVitorias() + " lutas");
		System.out.println("Perdeu: " + this.getDerrotas() + " lutas");
		System.out.println("Empatou: " + this.getEmpates() + " lutas");
	}
	public void status() {
		System.out.println(this.getNome());
		System.out.println("é um peso " + this.getCategoria());
		System.out.println(this.getVitorias() + " vitórias");
		System.out.println(this.getDerrotas() + " derrotas");
		System.out.println(this.getEmpates() + " empates");
	}
	public void ganharLuta() {
		this.setVitorias(getVitorias() + 1);
	}
	public void perderLuta() {
		this.setDerrotas(getDerrotas() + 1);
	}
	public void empatarLuta() {
		this.setEmpates(getEmpates() + 1);
	}

	
	//metodos getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Inválido";
		}//if
		else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		}//else if
		else if (this.peso <= 83.9) {
			this.categoria = "Médio";
		}//else if
		else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		}//else if
		else {
			this.categoria = "Inválido";
		}//else
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
	
	
	
}//class
