package classeObjetosMetodos;

public class Animal {

	/*
	 * 2. Identifique as partes principais da Classe Java abaixo. Coloque asteriscos ao lado de todas as variáveis da instância.
     * Coloque uma caixa ao redor de cada construtor. Circule a assinatura dos métodos diferentes do método do construtor.
     * Coloque triângulos ao redor dos parâmetros. Sublinhe os tipos de métodos de retorno.
     * 
     * PS: Vou identificar o que se pede via comentários no código.
	 */
	
		int weight, height; // * variáveis da instância
		double speed;       // * variáveis da instância
		
		Animal() {                       // <-- 1º construtor, assinatura sem parâmetros
			weight = 50;
			height = 4;
			speed = 2; //miles per hour
		}
		Animal(int w, int h, int s ) {  // <-- 2° construtor, assinatura com parâmetros, Os parâmetros estão aqui na assinatura.
			weight = w;
			h = height;
			speed = s;
		}
		
		public double getTime(double miles) { //gets the number of hours to go these miles
			
			return miles/speed;                //método de retorno
		}
		
		public int getWeight() {               //método de retorno
			return weight;
		}
		
		public int getHeight() {                //método de retorno
			return height;
		}
		
		public double getSpeed() {               //método de retorno
			return speed;
		}
}//class
