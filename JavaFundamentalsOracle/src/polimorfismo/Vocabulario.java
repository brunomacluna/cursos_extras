package polimorfismo;

public class Vocabulario {

	/*
	 * Vocabulário:
	 * 
	 * Identifique a palavra do vocabulário para cada definição a seguir.
	 * 
	 * Um conceito em programação orientada por objetos que permite que as classes tenham
     * muitas formas e se comportem como suas superclasses.
     * Resposta: polimorfismo
     * 
     * Implementação de métodos em uma subclasse que têm o mesmo protótipo (os mesmos
     * parâmetros, nome do método e tipo de retorno) que outro método da superclasse.
     * Resposta: sobrescrita
     * 
     * Uma palavra-chave em Java usada para limitar subclasses de estender uma classe,
     * substituir métodos ou alterar dados.
     * Resposta: final
     * 
     * Uma propriedade de uma classe estática que torna a classe incapaz de ser estendida ou os
     * dados incapazes de serem alterados.
     * Resposta: imutabilidade
     * 
     * Implementação de um método com o mesmo nome que outro método na mesma classe que
     * tem parâmetros diferentes ou um tipo de retorno diferente.
     * Resposta: sobrecarga
     * 
     * O processo pelo qual o Java pode determinar qual método será chamado quando os
     * métodos tiverem sido substituídos.
     * Resposta: envio de método dinâmico / dynamic method dispatch 
     * 
     * Uma palavra-chave em Java que permite que as classes sejam executadas, mas elas não
     * podem ser instanciadas (construídas) e, quando aplicadas a métodos, indicam que os
     * métodos devem ser implementados em todas as subclasses da classe.
     * Resposta: abstract 
	 * 
	 */
	
	/*
	 * 1. Qual será o resultado do código a seguir?
     * 
     * 	    class A{
				void callthis() {
				    System.out.println(“Inside Class A's Method!”);
				}
			}
			
			class B extends A{
				void callthis() {
				    System.out.println(“Inside Class B's Method!”);
				}
			}
			
			class C extends A{
				void callthis() {
					System.out.println(“Inside Class C's Method!”);
				}
			}
			
			class DynamicDispatch {
				public static void main(String args[]) {
				A a = new A();
				B b = new B();
				C c = new C();
				
				A ref;
				ref = b;
				ref.callthis();
				ref = c;
				ref.callthis();
				ref = a;
				ref.callthis();
				}
			}
	 * 
	 * 		Resposta: 
	 * 		Inside Class B's Method!
	 * 		Inside Class C's Method!
	 * 		Inside Class A's Method!
	 */
	
	/*
	 * 2. Qual é a diferença entre uma classe abstract e uma interface? Quando é apropriado usar uma classe abstract ou uma
     * interface?
     * Resposta: Uma classe abstrata permite a herança de uma única classe pai com a possibilidade de ter métodos já implementados
     * e variáveis de estado, enquanto uma interface define um contrato para múltiplas classes, garantindo que elas implementem um 
     * conjunto de métodos sem conter variáveis de estado ou implementações de código. Use uma classe abstrata para compartilhar código
     *  e estado em uma hierarquia de classes, e uma interface para definir comportamentos que podem ser aplicados a classes de diferentes
     *  hierarquias. 
	 */
	
	/*
	 * 3. Dadas as informações seguintes, determine se elas resultarão: Sempre compilar, às vezes compilar ou não compilar.
     * 
     * public interface A
     * public class B implements A
     * public abstract class C
     * public class D extends C
     * public class E extends B
     * 
     * Cada classe foi inicializada, mas não está claro para o que elas foram inicializadas:
     * 
     * A a = new...
     * B b = new...
	 * C c = new...
     * D d = new...
     * E e = new...
     * 
     * Os seguintes métodos estão incluídos:
     * 
     * interface A specifies method void methodA()
     * class C has the abstract method void methodC()
     * 
     * Código:          |    Sempre compilar, às vezes compilar ou não compilar?
     *                  |
     * a = new B();     |    Sempre compilar
     * d = new C();     |    não compilar
     * b.methodA();     |    Sempre compilar
     * e.methodA();     |    Sempre compilar
     * c = new C();     |    não compilar
     * (D)c.methodC();  |    não compilar
     * 
     *
	 */
}//class
