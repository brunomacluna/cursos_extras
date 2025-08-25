package strings;

public class PalindromoTeste {

	public boolean palindromoTeste(String palavra) {
						
		palavra = palavra.toLowerCase();
		
		int primeiraPosicao = 0;
		int ultimaPosicao = palavra.length() -1;
		boolean palindromo = true;
				
		while (primeiraPosicao < ultimaPosicao) {
			if (palavra.charAt(primeiraPosicao) != palavra.charAt(ultimaPosicao)) {
				palindromo = false;				
			}//if
			primeiraPosicao++;
			ultimaPosicao--;
		}//while
		
		if(palindromo) {
			System.out.println("A palavra é um Palíndromo.");
		}//if
		else {
			System.out.println("A palavra NÃO é um Palíndromo.");
		}//else
		
		return palindromo;
	}//metodo
	
}//class
