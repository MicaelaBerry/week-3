import java.util.ArrayList;

public class AnimalArrayList {

	public static void main(String[] args) {
		ArrayList<String> animalNames = new ArrayList<String>();
		animalNames.add("lions");
		animalNames.add("tigers");
		animalNames.add("bears");
		animalNames.add("flying monkey");
		animalNames.add("dogs");
		
		System.out.println(animalNames);
		System.out.println("Some animals in Wizard of Oz are " + animalNames);

	}

}
