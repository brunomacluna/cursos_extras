package calculoTinta;

import java.util.Scanner;

public class CalculoTinta {

	public static void main(String[] args) {

		final double CINCO_LITROS_AREA = 140;
		final double UM_LITRO_AREA = 28;
		final double CINCO_LITROS_PRECO = 15;
		final double UM_LITRO_PRECO = 4;
		double custoCincoLitro;
		double custoUmLitro;
		double totalLatasCinco;
		double totalLatasUm;
		double altura;
		double comprimento;
		double largura;
		double area;
		double areaTotal;
		
		Scanner scanner = new Scanner(System.in);
		
		double[] lista = new double[5];
		
		System.out.println("Calcule quantas latas de tinta vai precisar:");		
		for (int i = 0; i <= 3; i++) {
			System.out.print("\nQual a altura da parede "+ (i+1) +": ");
			altura = scanner.nextDouble();
			scanner.nextLine();
			System.out.print("Qual a largura da parede "+ (i+1) +": ");
			largura = scanner.nextDouble();
			scanner.nextLine();
			area = altura * largura;
			lista[i] = area;			
		}//for
		
		System.out.print("\nQual o comprimento do teto: ");
		comprimento = scanner.nextDouble();
		scanner.nextLine();		
		System.out.print("Qual a largura do teto: ");
		largura = scanner.nextDouble();
		scanner.nextLine();		
		area = comprimento * largura;
		
		lista[4] = area; 
		
		areaTotal = lista[0] + lista[1] + lista[2] + lista[3] + lista[4];
		
		totalLatasCinco = areaTotal / CINCO_LITROS_AREA;
		totalLatasUm = areaTotal / UM_LITRO_AREA;
		custoCincoLitro = totalLatasCinco * CINCO_LITROS_PRECO;
		custoUmLitro = totalLatasUm * UM_LITRO_PRECO;
		
		System.out.printf("\nSua area total é %.2f metros.", areaTotal);
		System.out.printf("\nVocê precisa de %.2f latas de 5 litros. Ao custo de %.2f$.", totalLatasCinco, custoCincoLitro);
		System.out.printf("\nOu %.2f latas de 1 litro. Ao custo de %.2f$.", totalLatasUm, custoUmLitro);
		scanner.close();
	}//main

}//class
