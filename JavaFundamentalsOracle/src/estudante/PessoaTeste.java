package estudante;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Arial", 37);
		Pessoa p2 = new Pessoa("Joseph", 15);
		
		if (p1.getIdade() == p2.getIdade()) {
			System.out.println(p1.getNome() + " é da mesma idade de " + p2.getNome());
		}//if
		else {
			System.out.println(p1.getNome() + " NÃO tem a mesma idade de " + p2.getNome());
		}//else
		

	}//main

}//class
