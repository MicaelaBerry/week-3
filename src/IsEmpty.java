
public class IsEmpty {

	public static void main(String[] args) {
		// do it procedurally with a char []
		char[] characters = { 'f', 'o', 'o' };
		char[] emptyArray = {};

		System.out.println("is my char[] empty?" + isEmpty(characters));
		System.out.println("is {} empty?" + isEmpty(emptyArray));
	
		//let String do the work (abstraction)
		String strCharacters = "foo";
		String emptyString = "";
	
		System.out.println("is my string empty?" + strCharacters.isEmpty());
		System.out.println("Is an empty string empty?" + emptyString.isEmpty());
	}

	static boolean isEmpty(char[] input) {
		boolean empty = input.length == 0;
		return empty;

	}
}
