package aula05;

public class ContaMain {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.setnumConta(0001);
		c1.setDono("Bruno Machado Luna");
		c1.abrirConta("Conta Corrente");
		
		Conta c2 = new Conta();
		c2.setnumConta(0002);
		c2.setDono("Jesse Kalein Santos Machado Luna");
		c2.abrirConta("Conta Poupança");
		
		c1.depositar(100);
		c2.depositar(500);
		c2.sacar(95);
		c1.sacar(150);
		c1.fecharConta();
		
		c1.estadoAtual();
		c2.estadoAtual();
	}//main
}//class
