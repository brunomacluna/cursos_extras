package mountvilleUniversity;

import java.util.Scanner;

public class MountvilleUniversity {

	public static void main(String[] args) {
		
		String oradorString;
		boolean orador;
		int sat;
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Vestibular Mountville University.");
		System.out.print("\nVocê foi orador da sua turma? [s] [n]: ");
		oradorString = scanner.nextLine();
		
		if (oradorString.equalsIgnoreCase("s")) {
			orador = true;
		}else {
			orador = false;
		}//if else
		
		System.out.print("\nQual é a sua pontuação no SAT? ");
		sat = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("\nQual é a sua nota do 1º bimestre? ");
		nota1 = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.print("\nQual é a sua nota do 2º bimestre? ");
		nota2 = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.print("\nQual é a sua nota do 3º bimestre? ");
		nota3 = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.print("\nQual é a sua nota do 4º bimestre? ");
		nota4 = scanner.nextDouble();
		scanner.nextLine();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if ((orador && sat >= 1400) || (media >= 4 && sat >= 1100) || (media >= 3.5 && sat >= 1300) || (media >= 3 && sat >= 1500)) {
			System.out.println("\nVocê foi APROVADO no vestibular de Mountville University.\nParabéns!!!");
			System.out.println("\nOrador da turma: "+ orador +"\nSAT: "+ sat +"\nMédia: "+media);
		}else {
			System.out.println("\nVocê foi REPROVADO no vestibular Mountville University.\nSinto Muito!");
			System.out.println("\nOrador da turma: "+ orador +"\nSAT: "+ sat +"\nMédia: "+media);
		}//if else
		
	}//main

}//class
