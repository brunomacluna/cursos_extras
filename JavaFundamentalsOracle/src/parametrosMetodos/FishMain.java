package parametrosMetodos;

public class FishMain {

	public static void main(String[] args) {
		
		Fish fish_1 = new Fish("Amber, Type – AngelFish", 5);
		Fish fish_2 = new Fish("James, Type – Guppy", 3);
		
		Fish fishMaisSimpatico = fish_1.nicestFish(fish_1, fish_2);
		
		System.out.println("O peixe mais simpático é o "+ fishMaisSimpatico);
	}//main

}//class
