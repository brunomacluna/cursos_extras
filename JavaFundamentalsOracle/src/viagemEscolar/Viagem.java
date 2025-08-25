package viagemEscolar;

import java.util.Random;

public class Viagem {

	private int pessoasInscritas;
	private final int ONIBUS = 45;	
	private int numOnibus;
	private int totalPessoasVan;
	
	Random gerar = new Random();

	public Viagem() {
		super();
		this.pessoasInscritas = gerar.nextInt(501);
	}//constructor

	public void mostrarPessoasInscritas() {
		System.out.println("O total de pessoas inscritas foram: " + pessoasInscritas);
	}
	
	public void onibusOuVan() {
		if (pessoasInscritas >= ONIBUS) {
			numOnibus = pessoasInscritas / ONIBUS;
			totalPessoasVan = pessoasInscritas % ONIBUS;
			System.out.println((pessoasInscritas - totalPessoasVan) + " pessoas embarcaram em " + numOnibus + " ônibus e " + totalPessoasVan +  " pessoas foram de van.");
		}//if
		
		else {
			totalPessoasVan = pessoasInscritas;
			System.out.println(totalPessoasVan +  " pessoas foram de van.");
		}
	}//onibusOuVan
	
	//getters e setters
	public int getPessoasInscritas() {
		return pessoasInscritas;
	}
	
	public int getNumOnibus() {
		return numOnibus;
	}
	
	public int getTotalPessoasVan() {
		return totalPessoasVan;
	}//getters e setters	
	
}//class
