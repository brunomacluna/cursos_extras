package aula05;

public class Conta {
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public Conta() {
		this.setSaldo(0);
		this.setStatus(false);
	}//contrutor
	
	public void estadoAtual() {
		System.out.println("-----------------------------");
		System.out.println("Número da conta: "+ String.format("%04d", this.getnumConta()));
		System.out.println("Tipo da conta: "+ this.getTipo());
		System.out.println("Pertencente a: "+ this.getDono());
		System.out.println("Saldo: "+ this.getSaldo());
		System.out.println("Status: "+ (this.getStatus() ? "Ativa" : "Inativa"));
	}//estadoAtual
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t.equals("Conta Corrente")) {
			this.setSaldo(50);
		} else if (t.equals("Conta Poupança")){ 
			this.setSaldo(150);
		}//if else
		System.out.println("Conta aberta com sucesso!");
	}//abrirConta
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada com saldo positivo.");
		} else if (this.getSaldo() < 0 ){
			System.out.println("Conta não pode ser fecahda com saldo negativo.");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}//if else
	}//fecharConta
	public void depositar(double valor) {
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Deposito de: "+ valor +" efetuado com sucesso na conta de "+ this.getDono());
		} else {
			System.out.println("Impossível depositar, conta inválida.");
		}//if else
	}//depositar
	public void sacar(double valor) {
		if(this.getStatus() && valor <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Saque realizado na conta de "+ this.getDono()+ " no valor de: "+ valor);
		} else {
			if (!this.getStatus()) {
			System.out.println("Impossível sacar, conta inválida.");
			} else if (valor > this.getSaldo()){
			System.out.println("Saldo insuficiente.");
			}//if else
		}// if else	
	}//sacar
	public void pagarMensalidade() {
		int valor = 0;
		if(tipo.equals("CC")) {
			valor = 12;
		}else if(tipo.equals("CP")){
			valor = 20;
		}//if else
		
		if (this.getStatus()) {
			if(this.getSaldo() > valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Mensalidade paga com sucesso!");
			} else {
				System.out.println("Saldo insuficiente.");
			}
		} else {
			System.out.println("Impossível pagar, conta inválida.");
		}
	}//pagarMensalidade
	

	public int getnumConta() {
		return this.numConta;
	}//getnumConta
	public void setnumConta(int num) {
		this.numConta = num;
	}//setnumConta
	
	public String getTipo() {
		return this.tipo;
	}//getTipo
	public void setTipo(String t) {
		this.tipo = t;
	}//setTipo
	
	public String getDono() {
		return this.dono;
	}//getDono
	public void setDono(String d) {
		this.dono = d;
	}//setDono
	
	public double getSaldo() {
		return this.saldo;
	}//getSaldo
	public void setSaldo(double s) {
		this.saldo = s;
	}//setSaldo
	
	public boolean getStatus() {
		return this.status;
	}//getStatus
	public void setStatus(boolean sts) {
		this.status = sts;
	}//setStatus
}//class
