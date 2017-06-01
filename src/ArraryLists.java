import java.util.ArrayList;

public class ArraryLists {

	public static void main(String[] args) {
		
		ArrayList<String> giantWords = new ArrayList<String>();
		giantWords.add("fee");
		giantWords.add("fie");
		giantWords.add("foe");
		System.out.println(giantWords);
		System.out.println("my list has " + giantWords.size() + " elements");

		giantWords.add("fum");
		System.out.println(giantWords);
		System.out.println("my list has " + giantWords.size() + " elements");

	}

}
//.size() and .add() are methods... size writes out how many are in the array
//add creates a new word to add to the list