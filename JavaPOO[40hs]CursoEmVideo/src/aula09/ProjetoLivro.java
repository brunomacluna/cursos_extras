package aula09;

public class ProjetoLivro {

	public static void main(String[] args) {
		
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Pedro", "M", 22);
		p[0] = new Pessoa("Maria", "F", 25);
		
		l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
		l[1] = new Livro("POO para iniciantes", "Pero Paulo", 500, p[1]);
		l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);
		
		
		l[0].abrir();
		l[0].folhear(100);
		l[0].avancarPag();
		l[0].avancarPag();
		l[0].avancarPag();
		l[0].voltarPag();
		l[0].fechar();
		System.out.println(l[0].detalhes());
		

		l[2].abrir();
		l[2].folhear(365);
		l[2].avancarPag();
		System.out.println(l[2].detalhes());
	}//main

}//class
