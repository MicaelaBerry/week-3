package constructors;

public class VirtualPetApp {

	public static void main(String[] args) {
	VirtualPet myPet = new VirtualPet();
	myPet.name = "Hope";
	
	System.out.println("My pet is " + myPet); 
	//if we write .name it will show up. if we don't why we have to override it in a different class

	}

}
