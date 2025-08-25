package excecoes;

public class ExcecoesMain {

	public static void main(String[] args) {
		
		/*1. Descreva a diferença entre um erro de sintaxe, um erro lógico e uma exceção.
		 * 
		 * Um erro de sintaxe se trata de erros de ortografia das palavras-chave, falta ou pocisionamento correto de pontos e virgulas, utilização
		 * inadequada de operadores lógicos e quaisquer outros usos errados da estrutura do Java.
		 * Erro lógico é um erro onde o programa compila e roda normalmente, mas seu resultado é insatisfatório, pois ele foi mal pensado e 
		 * não faz o que deveria fazer.
		 * Erro de exceção são erros causados por falhas no programa que podem encerrar seu funcionamento, como tentar chamar um indice de array
		 * que não exista, tentar uma divisão por zero ou tentar apontar para uma variável ainda não criada.
		 * 
		 * 2. O que há de errado com o seguinte código? Ele deve imprimir " Hello World!" quatro vezes para a tela.
		 * 
		 * String str = “Hello World”;
		 * for(int i = 0; i < 4; i++);
		 * {
		 * 		System.out.println(str);
				str+= ”!”;
			}		
		 * 
		 * O ponto e vírgula após as condições do for, antes da abertura de chaves irá encerrar o loop após executar quatro intruções vazias,
		 *  imprimindo Hello World! somente uma vez.
		 * 
		 * 3. Descreva uma exceção que você já tenha visto em seu programa antes. Explique como ela pode ser tratada com um bloco
			de código try/catch.
		 * 
		 * Divisão por zero já ocorreu nos meus programas.
		 * Poderia ser tratada dentro de uma try com uma condicional if para verificar se a essa divisão foi detectada. No cacth eu poderia informar 
		 * o usúario que essa divisão não pode ser feita e pedir que tente novamente.	  
		 * 
		 * 5. Qual é a diferença entre uma exceção verificada e uma não verificada?
		 * 
		 * Uma exceção verificada dever ser tratada pelo programador, já uma exceção não verificada seu tratamento é opcional.
		 * 
		 * 4. Escreva um segmento do código que tenha:
		 * 
		 * a. Um erro de sintaxe
		 */
		/*int teste01 = 10;
		int teste02 = 10;
		if(teste01 = teste02) {
			System.out.println("Não houve erro de sintaxe");
		}//if
		
		//b. Um erro lógico.
		int teste03 = 120;
		int teste04 = 2;
		int resultado;
		resultado = teste03 - teste04;
		System.out.println("A soma de teste03 + teste04 é: "+ resultado);
		
		//c. Uma exceção.

		int[] array = new int[]{1, 2, 3};
		System.out.println(array[5]);
		*/
	}//main

}//main
