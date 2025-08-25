package aula09;

import aula09.Pessoa;
import aula09.Publicacao;

public class Livro implements Publicacao{

	private String titulo, autor;
	private int totPaginas, pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
		
	public String detalhes() {
		return "Livro [ titulo = " + titulo + "\n, autor = " + autor + "\n, totPaginas = " + totPaginas + "\n, pagAtual = " + pagAtual
				+ "\n, aberto = " + aberto + "\n, leitor = " + leitor.getNome() + "\n, idade = " + leitor.getIdade() + "\n, sexo = " + leitor.getSexo() + " ]";
	}

	

	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}//construtor



	@Override
	public void abrir() {
		this.aberto = true;
		
	}

	@Override
	public void fechar() {
		this.aberto = false;
		
	}

	@Override
	public void folhear(int p) {
		if (p > this.totPaginas) {
			p = this.totPaginas;
		}
		
		this.pagAtual = p;
		
	}

	@Override
	public void avancarPag() {
		if (this.pagAtual < this.totPaginas) {
			this.pagAtual++;
		}
	}

	@Override
	public void voltarPag() {
		if (this.pagAtual > 0)
		this.pagAtual--;		
	}

	//metodos especiais
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	
}//class
