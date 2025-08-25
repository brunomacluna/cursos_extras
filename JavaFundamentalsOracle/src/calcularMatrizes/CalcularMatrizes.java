package calcularMatrizes;

import java.util.Scanner;

public class CalcularMatrizes {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean sair = false;
		String opcao;
		
		double [][] matrizA = null;
		double [][] matrizB = null;
		
		MetodosMatrizes metodos = new MetodosMatrizes();
		
		while (!sair) {
			
			System.out.println("Digite a opção desejada: ");
			System.out.print("[A] Criar a Matriz 'A' \n[B] Criar a Matriz 'B' \n[C] Somar as Matrizes 'A' + 'B'" 
			+ "\n[D] Subtrair as Matrizes 'A' - 'B' \n[E] Multiplicar as Matrizes 'A' * 'B' \n[F] Sair.\nOpção: ");
			opcao = scanner.nextLine().toUpperCase();
			System.out.println();
			
			switch (opcao) {
				case "A":{
					matrizA = metodos.criarMatrizes(scanner, "Matriz 'A'");
					System.out.println("\nMatriz 'A' criada com sucesso!\n");
					metodos.exibirMatriz(matrizA, "Matriz 'A'");
					break;
				}
				case "B":{
					matrizB = metodos.criarMatrizes(scanner, "Matriz 'B'");
					System.out.println("\nMatriz 'B' criada com sucesso!\n");
					metodos.exibirMatriz(matrizB, "Matriz 'B'");
					break;
				}
				case "C":{
					if (matrizA == null || matrizB == null) {
						System.out.println("Erro: Por favor, digite as Matrizes 'A' e 'B' primeiro para realizar a soma.\n");
					}//if
					else {
						double[][] resultadoSoma = metodos.somarMatrizes(matrizA, matrizB);
						if (resultadoSoma != null) {
							metodos.exibirMatriz(resultadoSoma, "Soma das Matrizes 'A' + 'B'");
						}//if
					}//else
					break;
				}
				case "D":{
					if (matrizA == null || matrizB == null) {
						System.out.println("Erro: Por favor, digite as Matrizes 'A' e 'B' primeiro para realizar a subtração.\n");
					}//if
					else {
						double[][] resultadoSubtracao = metodos.subtrairMatrizes(matrizA, matrizB);
						if (resultadoSubtracao != null) {
							metodos.exibirMatriz(resultadoSubtracao, "Subtração das Matrizes 'A' - 'B'");
						}//if
					}//else
					break;
				}
				case "E":{
					if (matrizA == null || matrizB == null) {
						System.out.println("Erro: Por favor, digite as Matrizes 'A' e 'B' primeiro para realizar a multiplicação.\n");
					}//if
					else {
						double[][] resultadoMultiplicacao = metodos.multiplicarMatrizes(matrizA, matrizB);
						if (resultadoMultiplicacao != null) {
							metodos.exibirMatriz(resultadoMultiplicacao, "Multiplicação das Matrizes 'A' * 'B'");
						}//if
					}//else
					break;
				}
				case "F":{
					System.out.println("\nSaindo do programa...\nObrigado!");
					sair = true;
					break;
				}
				default: {
					System.out.println("Opção Inválida, tente novamente.\n");
					break;
				}
			}//switch
			
		}//while		
		
		scanner.close();
	}//main

}//class
