import java.util.ArrayList;

public class IndexOfArray {

	public static void main(String[] args) {
		ArrayList<String> myTools = new ArrayList<String>();
		myTools.add("hammer");
		myTools.add("shovel");
		myTools.add("wrench");

		System.out.println("Shovel is element " + myTools.indexOf("shovel"));

	}

}
