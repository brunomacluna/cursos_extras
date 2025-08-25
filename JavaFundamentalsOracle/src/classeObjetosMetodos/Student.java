package classeObjetosMetodos;

public class Student {

	private String nome;
	private double creditos, pontosDeQualidade;
	private double mediaGeral;
	
	public Student(String nome, double creditos, double pontosDeQualidade) {
		super();
		this.nome = nome;
		this.creditos = creditos;
		this.pontosDeQualidade = pontosDeQualidade;
		
	}//constructor
	
	public double mediaAtual() {
		return pontosDeQualidade / creditos;
	}//method
	
	public double atualizarMedia(double creditos, double pontosDeQualidade) {
		this.creditos += creditos;
		this.pontosDeQualidade += pontosDeQualidade;
		return mediaGeral = this.pontosDeQualidade / this.creditos;
	}//method
	
	
	
}//class
