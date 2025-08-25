package testes;

import java.util.InputMismatchException;
import java.util.Scanner;

import inventario.Produto;

public class TestesMain {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
		int idProduto;
		String nomeProduto;
		int unidadesEstoque;
		double precoUnidade;	
		int maxSize = -1;
		boolean sair = false;
		
				
		try {		
			while(!sair) {		
				System.out.println("Insira o número de produtos que gostaria de adicionar. ");
				System.out.println("Insira 0 (zero) se não quiser adicionar produtos: ");				
								
				try {
					maxSize = scanner.nextInt();
					scanner.nextLine();
					if(maxSize < 0) {
						System.out.println("Valor incorreto inserido.");
					}//if
					else {
						sair = true;
						break;
					}//else
				}//try
				catch (InputMismatchException e) {
					System.out.println("Tipo incorreto de dados inserido!");
					scanner.nextLine();
				}//catch
				catch(Exception e) {					
					scanner.nextLine();
				}//catch
			}//while
		}//try
		
		catch (Exception e) {
			System.out.println(e);
			scanner.nextLine();
		}//catch
		
		if(maxSize == 0) {
			System.out.println("Não há produtos!");
		}//
		else {
			Produto[] Produtos = new Produto[maxSize];
			
			for(int i = 0; i < maxSize; i++) {
				scanner.nextLine();
				System.out.print("Digite o número do produto: ");
				idProduto = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Digite o nome do produto: ");
				nomeProduto = scanner.nextLine();
				System.out.print("Digite a quantidade do produto: ");
				unidadesEstoque = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Digite o preço do produto: ");
				precoUnidade = scanner.nextDouble();
				scanner.nextLine();
				
				Produtos[i] = new Produto(idProduto, nomeProduto, unidadesEstoque, precoUnidade);				
			}//for
			
			for (Produto produto : Produtos) {
				System.out.println(produto);
			}//for each
			
		}//else		
		
		
		
		
				
		scanner.close();
	}//main

}//class
