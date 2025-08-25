package inventario;

public class Produto {

	//Declarações de campo de instância
	private int idProduto;
	private String nomeProduto;
	private int unidadesEstoque;
	private double precoUnidade;
	private boolean ativo = true;
	
	//o objetivo desse construtor é iniciar os produtos com valores padrão. 0 para int, 0.0 para double e null para String
	public Produto() {
		
	}//constructor

	public Produto(int idProduto, String nomeProduto, int unidadesEstoque, double precoUnidade) {
		super();
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.unidadesEstoque = unidadesEstoque;
		this.precoUnidade = precoUnidade;
		
	}//constructor
	
	public void addToInventory(int quantidade) {
		if (ativo) {
			this.unidadesEstoque += quantidade;
		} else {
			System.out.println("Não é possível adicionar. Produto descontinuado.");
		}//if else
		
	}//addToInventory
	
	public void deductFromInventory(int quantidade) {
		if(quantidade <= getUnidadesEstoque()) {
			this.unidadesEstoque -= quantidade;					
		} else {
			System.out.println("Temos apenas "+ getUnidadesEstoque() + " no estoque.");
		}//else
	}//deductFromInventory

	public double valorInventario() {
		return precoUnidade * unidadesEstoque;
	}//method
	
	@Override
	public String toString() {
		String status = ativo ? "Ativo" : "Descontinuado";
		return "Número do Item : " + idProduto + "\nNome : " + nomeProduto + "\nQuantidade em estoque : "
				+ unidadesEstoque + "\nPreço : " + precoUnidade + "\nValor do Estoque : " + valorInventario() 
				+ "\nStatus do Produto : " + status;		
	}

	//getters e setters
	public int getIdProduto() {
		return idProduto;
	}//o objetivo do get é acessar o valor do atributo

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}//o objetivo do set é modificar o valor do atributo

	public String getNomeProduto() {
		return nomeProduto;
	}//o objetivo do get é acessar o valor do atributo

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}//o objetivo do set é modificar o valor do atibuto

	public int getUnidadesEstoque() {
		return unidadesEstoque;
	}//o objetivo do get é acessar o valor do atributo

	public void setUnidadesEstoque(int unidadesEstoque) {
		this.unidadesEstoque = unidadesEstoque;
	}//o objetivo do set é modificar o valor do atibuto

	public double getPrecoUnidade() {
		return precoUnidade;
	}//o objetivo do get é acessar o valor do atributo

	public void setPrecoUnidade(double precoUnidade) {
		this.precoUnidade = precoUnidade;
	}//o objetivo do set é modificar o valor do atibuto

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
		
}//class
