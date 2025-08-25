package parametrosMetodos;

public class Fish {

	private String typeOfFish;
	private int friendliness;
	
	public Fish() {
		typeOfFish = "Unknown";
		friendliness = 3;
	}//constructor

	public Fish(String t, int f) {
		super();
		this.typeOfFish = t;
		this.friendliness = f;
	}//constructor
	
	/*
	 * 4. Explique por que é possível ter mais de um construtor com o mesmo nome e argumentos diferentes.
     * 
     * Java permite a sobrecarga de construtores, ou seja, ter mais de um construtor na mesma classe, desde
     * que esse construtores aceitem parâmetros diferentes. Isso é feito para que o programador ou usuário
     * tenha mais liberdade para criar os objetos. 
	 */
	
	public int getFriendliness() {
		return this.friendliness;
	}//getter
	
	public Fish nicestFish(Fish... f) {
		try {
			Fish temp = new Fish();
			temp = f[0];
			for (Fish peixes : f) {
				if (temp.getFriendliness() < peixes.getFriendliness()) {
					temp = peixes;
				}//if
			}//for		
			return temp;
		}//try
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Você está tentando saber qual é o peixe mais simpático, mais não tem nenhum peixe aqui ué!!!");
			return null;
		}//catch
	}//method

	@Override
	public String toString() {
		return "Peixe: " + typeOfFish + ", de simpátia " + friendliness;
	}//toString
	
	/*
	 * 9. Teste seu método nicestFish com o peixe descrito no problema 6. Qual peixe é retornado?
	 * Resposta: Fish 1
	 *
	 * 10. Determine o melhor modificador de acesso para cada uma das seguintes situações:
	 * 
	 * a. Uma classe Employee grava o nome, endereço, salário e telefone.
	 * Resposta: private
	 * b. Um método de adição dentro de uma classe BasicMath que também é usado na aula de Álgebra.
	 * Resposta: public
	 */
	
	
	
	
	
}//class
