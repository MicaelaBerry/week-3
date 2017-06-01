import java.util.ArrayList;

public class ArrayOfNumbersExample {

	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		ArrayList<Integer> elementList = buildElementList(); // declare this outside of the public static to call upon it
		

		numberList.add(23);
		numberList.add(9);
		numberList.add(77);
		numberList.add(922);
		numberList.add(6);
		numberList.add(32);
		numberList.add(63);
		numberList.add(14);
		numberList.add(5);

		System.out.println("The numbers that are in the list are: ");
		System.out.println(numberList);
		System.out.println();
		
		System.out.println("Numbers that are elements to check to see if they are in the list are " + elementList);
		while (numberList.containsAll(elementList)); {	// we build a method below to check numbers to write less code
		System.out.println(numberList);} //use a while bc (while the number list contains the element list, print the list out
		
		System.out.println(); //blank line to separate everything

		// for loop and an array to check for numbers to remove from list
		System.out.println("Remove numbers 23, 992, 32, 6 from orginial list");
		Integer[] asInteger = { 23, 922, 32, 6 };
		for (Integer number : asInteger) { //number is the new name for asInteger
			numberList.remove(number); }
		System.out.println(numberList);
		
		System.out.println();

		System.out.println("Check and see if the elements are in the new list");
		while (numberList.containsAll(elementList)); {
			System.out.println(numberList);
		}
	}

	public static ArrayList<Integer> buildElementList() {
		ArrayList<Integer> elementList = new ArrayList<Integer>();
		elementList.add(23);
		elementList.add(77);
		elementList.add(15);
		return elementList; // method to refer back to so we don't have to write it out again
							 
	}

}
