package constructors;

public class VirtualPet { 
	String name;
	int hunger = 50; 
	
	//public ConstructorPet(){
	//String name;
	//public ConstuctorPet (String newName){
	//name = newName;
	//hunger = 50;
	
	//@Override 
	//public String toString(){
	//return "Pet named " + name;
	//}

	
	@Override 	//indication that we are overriding aka replacing. Calls the toString method from Object. 
public String toString(){
	return "Pet named " + name;
}
}