package aula11;

public class Bolsista extends Aluno{

	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolda de " + this.getNome());
	}

	@Override
	public void pagarMensalidade() {
		// TODO Auto-generated method stub
		super.pagarMensalidade();
		System.out.println(this.getNome() + ", por ser bolsista, obteve um desconto de 50% no curso de " + this.getCurso()+".");
	}
		
	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

	
}//class
