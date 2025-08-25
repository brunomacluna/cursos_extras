package inventario;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		
		int maxSize, menuChoice; 
		
		maxSize  = getNumProducts(scanner);		
		
		if(maxSize == 0) {
			System.out.println("Não há produtos!");
		}//
		else {
			Produto[] Produtos = new Produto[maxSize];
			for (int i = 0; i < maxSize; i++) {
                System.out.println("\nAdicionando Produto " + (i + 1) + " de " + maxSize + ":");
                addNewProduct(scanner, Produtos, i);
            }				
			do {
				menuChoice = getMenuOption(scanner);
				executeMenuChoice(menuChoice, scanner, Produtos);
			} while (menuChoice != 0);
		}//fim if	
		
		scanner.close();
	}//main
	
	public static Produto[] displayInventory(Produto[] array) {
		for (Produto produto : array) {
			System.out.println(produto);
		}//for each
		return array;
	}//displayInventory	
	
	public static void addCDToInventory(Scanner scanner, Produto[] array, int i) {		
		String nomeProduto;
		int unidadesEstoque;
		double precoUnidade;
		String artista;
		int numeroDeMusicas;
		String selo;		
		
			scanner.nextLine();
			System.out.print("Insira o nome do CD: ");
			nomeProduto = scanner.nextLine();
			System.out.print("Insira o nome do artista: ");
			artista = scanner.nextLine();
			System.out.print("Insira o nome do selo de gravação: ");
			selo = scanner.nextLine();
			System.out.print("Insira o número de músicas: ");
			numeroDeMusicas = scanner.nextInt(); 
			scanner.nextLine();
			System.out.print("Insira a quantidade em estoque para este produto: ");
			unidadesEstoque = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Insira o preço para este produto: ");
			precoUnidade = scanner.nextDouble();
			scanner.nextLine();			
			
			array[i] = new CDs(i, nomeProduto, unidadesEstoque, precoUnidade, artista, numeroDeMusicas, selo);
		
	}//addCDToInventory
	
	public static void addDVDToInventory(Scanner scanner, Produto[] array, int i) {		
		String nomeProduto;
		int unidadesEstoque;
		double precoUnidade;
		int duracaoMinutos;
		int classificacaoEtaria;
		String estudioCinematografico;		
		
			scanner.nextLine();
			System.out.print("Insira o nome do DVD: ");
			nomeProduto = scanner.nextLine();
			System.out.print("Insira o nome do estúdio cinematográfico: ");
			estudioCinematografico = scanner.nextLine();
			System.out.print("Insira a classificação etária: ");
			classificacaoEtaria = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Insira a duração em minutos: ");
			duracaoMinutos = scanner.nextInt(); 
			scanner.nextLine();
			System.out.print("Insira a quantidade em estoque para este produto: ");
			unidadesEstoque = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Insira o preço para este produto: ");
			precoUnidade = scanner.nextDouble();
			scanner.nextLine();					
			
			array[i] = new DVDs(i, nomeProduto, unidadesEstoque, precoUnidade, duracaoMinutos, classificacaoEtaria, estudioCinematografico);
		
	}//addDVDToInventory
	
	public static int getNumProducts(Scanner scanner) {
		int maxSize = -1;
		boolean sair = false;
		try {		
			while(!sair) {		
				System.out.println("Insira o número de produtos que gostaria de adicionar. ");
				System.out.print("Insira 0 (zero) se não quiser adicionar produtos: ");	
				
								
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
		return maxSize;
	}//getNumProducts
	
	public static int getMenuOption(Scanner scanner) {
		int opcao = -1;
		boolean sair = false;				
			while (!sair) {				
				System.out.println("\nEscolha uma opção: \n1. Exibir Inventário \n2. Adicionar Estoque \n3. Deduzir Estoque"+
				"\n4. Descontinuar Produto \n0. Sair ");
				System.out.print("Insira uma opção de menu: ");				
				
				try {
					opcao = scanner.nextInt();
					scanner.nextLine();
					if (opcao < 0 || opcao > 4) {
						System.out.println("Valor incorreto inserido.");
					} else {
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
		
		return opcao;
	}//getMenuOption
	
	public static int getProductNumber(Scanner scanner, Produto[] array) {
		 int productChoice = -1;		 
		 
		 for (int i = 0; i < array.length; i++) {			
			 System.out.println("Índice: "+ i + " - Produto: " + array[i].getNomeProduto());			 
			 
		 }//for
		 
		 while (true) {
			 int tamanhoArray = array.length - 1;
			 System.out.print("Escolha o número do Produto entre zero[0] e "+ tamanhoArray + ": ");			 
			 
				 try {
					 productChoice = scanner.nextInt();
					 scanner.nextLine();
					 if (productChoice < 0 || productChoice > tamanhoArray) {
						System.out.println("Valor incorreto inserido.");
					 } else {						
						break;
						}//else
				 } catch (InputMismatchException e) {
						System.out.println("Tipo incorreto de dados inserido!");
						scanner.nextLine();
					}//catch
					catch(Exception e) {					
						scanner.nextLine();
					}//catch			 
			 
		 }//while
		 return productChoice;
	}//getProductNumber
	
	public static void addNewProduct(Scanner scanner, Produto[] array, int i) {
		int stockChoice = -1;		
		
		while (true) {
			System.out.print("1: CD \n2: DVD \nInsira o tipo de produto: ");					
			
			 try {
				 stockChoice = scanner.nextInt();
				 scanner.nextLine();
				 if (stockChoice < 1 || stockChoice > 2) {
					System.out.println("Somente os números 1 ou 2 são permitidos!");
				 } else {						
					break;
					}//else
			 } catch (InputMismatchException e) {
					System.out.println("Tipo incorreto de dados inserido!");
					scanner.nextLine();
				}//catch
				catch(Exception e) {					
					scanner.nextLine();
				}//catch	
		}//while
		 if (stockChoice == 1) {
			 addCDToInventory(scanner, array, i);
		 } else {
			 addDVDToInventory(scanner, array, i);
		 }	
		
	}//addNewProduct
	
	public static void deductInventory(Scanner scanner, Produto[] array) {
		int productChoice;
		int updateValue = -1;
		
		productChoice = getProductNumber(scanner, array);
		
		System.out.print("\nQuantos produtos deseja excluir? ");		
		
		try {
			 updateValue = scanner.nextInt();
			 scanner.nextLine();
			 if (updateValue > 0 && updateValue <= array[productChoice].getUnidadesEstoque()) {
				 array[productChoice].deductFromInventory(updateValue);
			 } else {						
				 System.out.println("Valor incorreto inserido.");
				}//else
		 } catch (InputMismatchException e) {
				System.out.println("Tipo incorreto de dados inserido!");
				scanner.nextLine();
			}//catch
			catch(Exception e) {					
				scanner.nextLine();
			}//catch	
	}//deductInventory
	
	public static void discontinueInventory(Scanner scanner, Produto[] array) {
		int productChoice;
		
		productChoice = getProductNumber(scanner, array);
		
		array[productChoice].setAtivo(false);
	}//discontinueInventory
	
	
		
	
	public static void executeMenuChoice(int menuChoice, Scanner scanner, Produto[] array) {
				
		switch (menuChoice) {
			case 1: {
				System.out.println("\nExibir Lista de Produtos");
				displayInventory(array);
				break;
			}
			case 2: {
				System.out.println("\nAdicionar Estoque");
				addExistingProductQuantity(scanner, array);
				break;
			}
			case 3: {
				System.out.println("\nDeduzir Estoque");
				deductInventory(scanner, array);
				break;
			}
			case 4: {
				System.out.println("\nDescontinuar Estoque");
				discontinueInventory(scanner, array);
				break;
			}
			case 0: {
				System.out.println("\nSair");
				break;
			}
			default: {
				System.out.println("\nOpção Inválida, tente novamente.");
			}
		}//switch
	}//executeMenuChoice
	
	public static void addExistingProductQuantity(Scanner scanner, Produto[] array) {
        int productChoice;
        int quantityToAdd = -1;
        
        productChoice = getProductNumber(scanner, array);
        
        if (productChoice >= 0 && productChoice < array.length && array[productChoice] != null) {
            System.out.print("\nQuantos produtos deseja adicionar ao estoque de '" + array[productChoice].getNomeProduto() + "? " );            

            try {
                quantityToAdd = scanner.nextInt();
                scanner.nextLine();
                
                if (quantityToAdd <= 0) {
                    System.out.println("Valor incorreto inserido. A quantidade deve ser maior que zero.");
                } else {                    
                    array[productChoice].addToInventory(quantityToAdd);
                    if (array[productChoice].isAtivo()) {
                    	System.out.println("\nEstoque atualizado com sucesso!");
                    }//if                    
                }//is else inner
            } catch (InputMismatchException e) {
                System.out.println("Tipo incorreto de dados inserido! Por favor, insira um número inteiro.");
                scanner.nextLine(); 
            } catch (Exception e) {
                
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
                scanner.nextLine(); 
            }//catch
        } else {
            System.out.println("Número de produto inválido ou produto não encontrado.");
        }//if else outside
        
    }//addExistingProductQuantity
	
}//class



















































