package inventario;

public class CDs extends Produto{

	private String artista;
	private int numeroDeMusicas;
	private String selo;
		
	public CDs(int idProduto, String nomeProduto, int unidadesEstoque, double precoUnidade, String artista,
			int numeroDeMusicas, String selo) {
		super(idProduto, nomeProduto, unidadesEstoque, precoUnidade);
		this.artista = artista;
		this.numeroDeMusicas = numeroDeMusicas;
		this.selo = selo;
	}//constructor

	@Override
	public String toString() {		
		return "Número do Item : " + getIdProduto() + "\nNome : " + getNomeProduto() + "\nArtista : " + getArtista() +
				"\nMúsicas do Álbum : " + getNumeroDeMusicas() + "\nSelo de gravação : " + getSelo() + "\nQuantidade em Estoque : " +
				getUnidadesEstoque() + "\nPreço : " + getPrecoUnidade() + "\nValor do Estoque : " + valorInventario() +
				"\nStatus do Produto : " + (isAtivo() ? "Ativo" : "Descontinuado") + "\n";
	}//toString
	
	//getters e setters
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public int getNumeroDeMusicas() {
		return numeroDeMusicas;
	}
	public void setNumeroDeMusicas(int numeroDeMusicas) {
		this.numeroDeMusicas = numeroDeMusicas;
	}
	public String getSelo() {
		return selo;
	}
	public void setSelo(String selo) {
		this.selo = selo;
	}	
	//getters e setters	
	
}//class
