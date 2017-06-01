import java.util.ArrayList;

public class AnswerArrayEmpty {

	public static void main(String[] args) {
		ArrayList<Integer> answers = new ArrayList<Integer>();
		System.out.println("Are you out of answers? " + answers.isEmpty()); //this is the better way to write
		System.out.println("Are you out of answers? " + (answers.size() == 0)); // same as .isEmpty()
	
	answers.add(42);
	System.out.println("Are you out of answers? " + answers.isEmpty()); 
	// since we added 42 this returns false bc it is no longer empty
	
	}
}
// .isEmpty is an array method 