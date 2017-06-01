import java.util.ArrayList;

public class MoreToolsArrays {

	public static void main(String[] args) {

		ArrayList<String> myThings = new ArrayList<String>();
		myThings.add("this");
		myThings.add("that");
		myThings.add("the other");
		System.out.println(myThings);

		myThings.clear(); // clears the whole list
		System.out.println(myThings);

		myThings = buildDemoList(); //adds the list back since we cleared it 
		
		myThings.set(1, "foo"); // sets foo to index 1.
		System.out.println(myThings);
		
		myThings.add(2, "bar"); // adds bar to index 2 and pushes what comes after it over
		System.out.println(myThings);
		
		myThings.remove(2); //removes what is in index 2
		System.out.println(myThings);
		
		myThings.remove("foo"); //removes foo
		System.out.println(myThings);
		
		myThings.remove("foo");
		myThings.remove("foo");
		System.out.println(myThings);
		while (myThings.contains("foo")) { 
			myThings.remove("foo");
		}
		// we added 2 foos above. the while loop says "while the statement contains foo, remove it"
	
	}

	public static ArrayList<String> buildDemoList(){ 
		ArrayList<String> demoList = new ArrayList<String>();
		demoList.add("this");
		demoList.add("that");
		demoList.add("the other");
		return demoList;
	//since we cleared the whole list, we must add this list so we can change the index 1 to foo. we can
	// refer back to this list whenever we need to 
	}
}
