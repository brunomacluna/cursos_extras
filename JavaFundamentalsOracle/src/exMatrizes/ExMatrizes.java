package exMatrizes;

public class ExMatrizes {

	public static void main(String[] args) {
		
		//1. Declare uma pontuação do nome de array de uma dimensão do tipo int que possa conter 9 valores.
		int[] pontuacao = new int[9];
		
		//2. Declare um array bidimensional chamado price do tipo flutuante que tenha 10 linhas e 3 colunas.
		float[][] price = new float[10][3];
		
		//3. Declare e inicialize um array bidimensional denominado matrix do tipo long que tenha 4 linhas e 3 colunas para ter todos os valores definidos como 5.
		long[][] matrix = {
				{5, 5, 5},
				{5, 5, 5},
				{5, 5, 5},
				{5, 5, 5}
		};
		
		//4. Declare e inicialize um array de byte unidimensional denominado values de tamanho 10 para que todas as entradas contenham 1.
		byte[] values = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		
		/*5. Sem digitar o código, determine a saída do seguinte programa
		 * 
		 * int num[] = {7,7,6,6,5,5,4,4};
		 * for(int i = 0; i < 8; i = i + 2)
		 * System.out.print(num[i]);
		 * Resposta: 7654
		 */
		
		/*6. Sem digitar o código, determine a saída do seguinte programa.
		 * 
		 * int[][] num = {{3,3,3},{2,2,2}};
		 * int[] array = {4,3,2};
		 * for(int i = 0; i < 3; i++){
		 * 		num[1][i] = num[0][i]+array[i];
		 * }
		 * for(int i = 0; i < 2; i++){
		 * 		for(int j = 0; j < 3; j++){
		 * 			System.out.print(num[i][j]);
		 * 		}
		 * 		System.out.println();
		 * }
		 * Resposta: 333 \n765
		 */
		
		
		
	}//main

}//class
