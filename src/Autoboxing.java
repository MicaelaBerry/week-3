import java.util.ArrayList;

public class Autoboxing {

	public static void main(String[] args) {
		
		ArrayList<Integer> answers = new ArrayList<Integer>();
		int ultimateAnswer = 42;
		answers.add(ultimateAnswer);
		answers.add(86);

		System.out.println("The answers are: " + answers);

		Integer asIntegerObject = ultimateAnswer;
		System.out.println("The ultimate answer is " + asIntegerObject);
		
		int anotherIntAnswer = asIntegerObject; //unboxing
		

	}

}
