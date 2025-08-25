package calcularMatrizes;

import java.util.Scanner;

public class MetodosMatrizes {
		
	public double[][] criarMatrizes(Scanner scanner, String nomeMatriz){
		
		int linhas;
		int colunas;
		double valor;
		
		System.out.print("Quantas linhas a "+ nomeMatriz +" terá: ");
		linhas = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Quantas colunas a "+ nomeMatriz +" terá: ");
		colunas = scanner.nextInt();
		scanner.nextLine();
		System.out.println();
		
		double[][] novaMatriz = new double[linhas][colunas];
		
		for (int i = 0; i < novaMatriz.length; i++) {
			for (int j = 0; j < novaMatriz[i].length; j++) {
				
				System.out.print("Digite o valor da linha "+ (i+1) +" coluna " + (j+1) +": " );
				valor = scanner.nextDouble();
				scanner.nextLine();
				
				novaMatriz[i][j] = valor;
			}//for j
		}//for i
		
		return novaMatriz;
	}//criarMatrizes
	
	public void exibirMatriz(double[][] matriz, String nomeMatriz) {
		
		System.out.println(nomeMatriz);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");				
			}//for j
			System.out.println();
		}//for i		
		System.out.println();
	}//exibirMatriz
	
	public double[][] somarMatrizes(double[][] matriz1, double [][] matriz2){
		
		if (matriz1 == null || matriz2 == null) {
			System.out.println("Erro: Uma ou ambas as matrizes não foram criadas (são nulas).\n");
	        return null;
		}//if		
		else if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
			System.out.println("Erro: As duas matrizes devem ter as mesmas dimensões para serem somadas.\n");
	        return null;			
		}//else if
		else {
			double[][] resultado = new double[matriz1.length][matriz2[0].length];
			
			for (int i = 0; i < matriz1.length; i++) {
				for (int j = 0; j < matriz1[i].length; j++) {
					resultado[i][j] = matriz1[i][j] + matriz2[i][j];
				}//for j
			}//for i
			
			return resultado;
		}//else		
		
	}//somarMatrizez
	
	public double[][] subtrairMatrizes(double[][] matriz1, double[][] matriz2) {
		
		if (matriz1 == null || matriz2 == null) {
			System.out.println("Erro: Uma ou ambas as matrizes não foram criadas (são nulas).\n");
	        return null;
		}//if
		else if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
			System.out.println("Erro: As duas matrizes devem ter as mesmas dimensões para serem subtraidas.\n");
	        return null;
		}//else if
		else {
			double[][] resultado = new double[matriz1.length][matriz1[0].length];
			
			for (int i = 0; i < matriz1.length; i++) {
				for (int j = 0; j < matriz2[0].length; j++) {
					resultado[i][j] = matriz1[i][j] - matriz2[i][j];
				}//for j
			}//for i
			return resultado;
		}//else		
		
	}//subtrairMatrizes
	
	public double[][] multiplicarMatrizes(double[][] matriz1, double[][] matriz2){
		
		if (matriz1 == null || matriz2 == null) {
			System.out.println("Erro: Uma ou ambas as matrizes não foram criadas (são nulas).\n");
	        return null;
		}//if
		else if(matriz1[0].length != matriz2.length) {
			System.out.println("Erro: O número de coluna da Matriz 'A' deve ser igual ao número de linha da Matriz 'B'.\n");
	        return null;
		}//else if
		else {
			double[][] resultado = new double[matriz1.length][matriz2[0].length];
			
			for (int i = 0; i < matriz1.length; i++) {
				for (int j = 0; j < matriz2[0].length; j++) {
					for (int k = 0; k < matriz1[0].length; k++) {
						resultado[i][j] += matriz1[i][k] * matriz2[k][j]; 
					}//for k
				}//for j
			}//for i
			
			return resultado;
		}//else
		
	}//multiplicarMatrizes
	
}//class


