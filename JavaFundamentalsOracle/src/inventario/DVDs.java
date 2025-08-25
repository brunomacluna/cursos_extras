package inventario;

public class DVDs extends Produto{

	private int duracaoMinutos;
	private int classificacaoEtaria;
	private String estudioCinematografico;
	
	
	public DVDs(int idProduto, String nomeProduto, int unidadesEstoque, double precoUnidade,
			int duracaoMinutos, int classificacaoEtaria, String estudioCinematografico) {
		super(idProduto, nomeProduto, unidadesEstoque, precoUnidade);
		this.duracaoMinutos = duracaoMinutos;
		this.classificacaoEtaria = classificacaoEtaria;
		this.estudioCinematografico = estudioCinematografico;
	}//constructor

	
	
	@Override
	public double valorInventario() {		
		return super.valorInventario() + (super.valorInventario() * 0.05);
	}//valorInventario	

	@Override
	public String toString() {		
		return "Número do Item : " + getIdProduto() + "\nNome : " + getNomeProduto() + "\nDuração do Filme : " + getDuracaoMinutos() +
				"\nClassificação Etária : " + getClassificacaoEtaria() + "\nEstúdio Cinematográfico : " + getEstudioCinematografico() +
				"\nQuantidade em Estoque : " + getUnidadesEstoque() + "\nPreço : " + getPrecoUnidade() + "\nValor do Estoque : " +
				valorInventario() + "\nStatus do Produto : " + (isAtivo() ? "Ativo" : "Descontinuado") + "\n";		
	}//toString

	//getters e setters
	public int getDuracaoMinutos() {
		return duracaoMinutos;
	}
	public void setDuracaoMinutos(int duracaoMinutos) {
		this.duracaoMinutos = duracaoMinutos;
	}
	public int getClassificacaoEtaria() {
		return classificacaoEtaria;
	}
	public void setClassificacaoEtaria(int classificacaoEtaria) {
		this.classificacaoEtaria = classificacaoEtaria;
	}
	public String getEstudioCinematografico() {
		return estudioCinematografico;
	}
	public void setEstudioCinematografico(String estudioCinematografico) {
		this.estudioCinematografico = estudioCinematografico;
	}
	//getters e setters	
	
}//class
