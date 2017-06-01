import java.util.ArrayList;

public class ContainsMethodArray {

	public static void main(String[] args) {
		ArrayList<String> myTools = new ArrayList<String>();
		myTools.add("hammer");
		myTools.add("shovel");
		myTools.add("wrench");

		if (myTools.contains("hammer")) {
			System.out.println("I have a hammer!");
		}

		if (myTools.indexOf("shovel") >= 0) {
			System.out.println("I have a shovel!"); //another way of writing the above code (index of method)
		}
	}
}
