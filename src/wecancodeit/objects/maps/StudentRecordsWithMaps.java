package wecancodeit.objects.maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import wecancodeit.objects.students.Student; //control space for options for what should be imported

public class StudentRecordsWithMaps {

	public static void main(String[] args) {

		Student harvey = new Student("23A52", "Harvey Dent");
		Student jessica = new Student("68Z29", "Jessica Jones");
		Student jj = new Student("57w85", "J Jonah Jameson");

		// With a MAP, assign key then assign value. Both are type parameters
		// p557
		Map<String, String> students = new HashMap<String, String>();

		students.put("68Z29", "Jessica Jones");
		System.out.println(students);

		students.put("23A52", "Harvey Dent");
		System.out.println(students);
		
		String studentName = students.get("23A52");
		System.out.println("I found student " + studentName);
		
		System.out.println(" ");
		
		// common map methods listed below. 
		// collection views
		System.out.println("Students names (map values are) " + students.values());
		System.out.println("Students ids (map key are) " + students.keySet());
		// use entry set when you need both key and value
		System.out.println("Students entries (key/value pairs) are " + students.entrySet());
		System.out.println(" ");
		System.out.println("Iterating over student names:");
		for (String currentName : students.values()) { // enhanced FOR loop is a FOR EACH loop; returns a collection			
			System.out.println(currentName);
		}
		System.out.println(" ");
		System.out.println("Iterating over entries");

		for (Entry<String, String> entry : students.entrySet()) {
			System.out.println("key is " + entry.getKey() + ", value is " + entry.getValue());
		}
		System.out.println(" ");
		//sorting a list (sidebar)
		System.out.println("Sorting a list: ");
		List<String> listOfClasses = new ArrayList<String>();
		listOfClasses.add("Philosophy");
		listOfClasses.add("Creative Writing");		
		System.out.println(listOfClasses);
		Collections.sort(listOfClasses);
		System.out.println(listOfClasses);
		
		System.out.println(" ");
		// is this a valid student ID?
		if(students.containsKey("23A52")) {
			System.out.println("Yes, 23A52 is a valid student ID");			
		}
		
		System.out.println(" ");
		
	if(students.containsKey("1234")) {
		System.out.println("No it isn't");			
	}	
	System.out.println(" ");
	// is this a valid student name?
	
	if(students.containsValue("Harvey Dent")) {
		System.out.println("Found Harvey Dent!");
	}
	
	System.out.println(" ");
	//do we have any students?
	if(!students.isEmpty()) { //! means if we don't have students and the list is empty
		System.out.println("We have students.");
	}
	
	System.out.println(" ");
	//remove a student
	students.remove("23A52"); //his ID is the key
	System.out.println(students);
	
	System.out.println(" ");
	//how many students are there?
	System.out.println("There are " + students.size() + " students.");
	
	
	}
}
