package Herança;

public class Vocabulario {

	/*
	 * Vocabulário:
	 * 
	 * Identifique a palavra do vocabulário para cada definição a seguir.
	 * 
	 * Quando não há modificador de acesso. Mesmo acesso que o público, porém não é visível a outros
     * pacotes.
	 * Resposta: modificador default.
	 * 
	 * As palavras-chave usadas para declarar uma classe, método ou variável como pública, privada ou
     * protegida. Padrão quando não há modificador de acesso.
     * Resposta: modificadores de acesso.
     * 
     * Classes que são subconjuntos mais específicos de outras classes e que herdam métodos e campos de
     * classes mais gerais.
     * Resposta: Subclasses.
     * 
     * Uma palavra-chave em Java que permite que você declare explicitamente a superclasse da classe atual.
     * Resposta: extends.
     * 
     * Uma filosofia de programação que promove a proteção de dados e omissão de implementação a fim de
     * preservar a integridade dos dados e métodos.
     * Resposta: Encapsulamento.
     * 
     * Visível somente à classe onde ele é declarado.
     * Resposta: private.
     * 
     * Uma estrutura que categoriza e organiza as relações entre ideias, conceitos das coisas com o
     * componente mais geral ou abrangente na parte superior e o componente mais específico, ou com o
     * escopo mais restrito, na parte inferior.
     * Resposta: Estrutura em árvore ou hierarquia.
     * 
     * Visível a todas as classes.
     * Resposta: public.
     * 
     * Classes que passam seus métodos para classes mais especializadas.
     * Resposta: Super classes.
     * 
     * O conceito em programação orientada por objetos que permite que as classes obtenham métodos e
     * dados estendendo campos e métodos de outras classes.
     * Resposta: Herança.
     * 
     * Visível ao pacote onde ele está declarado e a subclasses em outros pacotes.
     * Resposta: protected.
     * 
     * Uma linguagem padronizada para modelar sistemas e estruturas em programação.
     * Resposta: UML.
     * 
     * Uma palavra-chave que permite que subclasses acessem métodos, dados e construtores da classe pai.
     * Resposta: super.
     * 
     * Um termo útil usado para conceituar as relações entre nós ou ramificações em uma hierarquia de
     * herança.
	 * Resposta: nós.
	 */
	
	/*
	 * 4. Verdadeiro/Falso – Uma subclasse pode acessar este código na superclasse: Por quê?
		a. public String aString;
		Resposta: Sim, porque o acesso é publico e qualquer classe pode acessar.
		
		b. protected boolean aBoolean;
		Resposta: Sim, o acesso protected da acesso a classes do mesmo pacote e também a subclasses.
		
		c. int anInt;
		Resposta: Sim. Se a subclasse estiver no mesmo pacote, se não não pode. Essa é a característica do modificador padrão (sem nada).
		 
		d. private double aDouble;
		Resposta: Não, com o modificador private o acesso se restringe apenas dentro da própria classe.
		 
		e. public String aMethod()
		Resposta: Sim, métodos públicos podem ser acessados por subclasses.
		 
		f. private class aNestedClass
		Resposta: Não, subclasses não acessam classes aninhadas privadas. Uma subclasse aninhada privada só é acessada por sua classe externa.
		 
		g. public aClassConstructor()
		Resposta: Sim, as subclasses podem e devem acessar e usar os construtores da classe pai usando a palavra reserva super().
		 
	 */
	
	/*
	 *          Vehicle
	 *          int numWheels;               
				int wheels;
				
				Car
				int numDoors;                              Bicycle                            
				boolean isElectric;                 String bikeType;
				getNumDoors()                       String getBikeType()
				boolean getIsElectic()
				
				Convertible
				String roofType;
				String getRoofType()
				
				
				public class Vehicle {
				private int numWheels;
				public Vehicle(int numWheels)
				{
				this.numWheels = numWheels;
				}
				public int getWheels() {
				return wheels;
				}
				}
				
				public class Car extends Vehicle {
				private int numDoors;
				private boolean isElectric;
				public Car (int numWheels, int numDoors, boolean isElectric) {
				super(numWheels);
				this.numDoors = numDoors;
				this.isElectric = isElectric;
				}
				public int getNumDoors() {
				return numDoors;
				}
				public boolean getIsElectric() {
				return isElectric;
				}
				}
				
				public class Bicycle extends Vehicle {
				//Mountain bike, road bike, recumbent bike.. etc
				private String bikeType;
				public Bicycle(int numWheels, String bikeType) {				
				super(numWheels);
				this.bikeType = bikeType;
				}
				public String getBikeType() {
				return bikeType;
				}
				}
				
				public class Convertible extends Car {
				//Soft top or rag top, or hard top
				private String roofType;
				public Convertible(int numWheels, int numDoors, boolean isElectric, String
				roofType) {
				super(numWheels, numDoors, isElectric);
				this.roofType = roofType;
				}
				public String getRoofType() {
				return roofType;
				}
				}
	 * 
	 */
	
}//class
