import java.util.ArrayList;

public class OrderArrayListAndLoopy {

	public static void main(String[] args) {
		
//		ArrayList<String> giantWords = new ArrayList<String>();
//		giantWords.add("fee");
//		giantWords.add("fie");
//		giantWords.add("foe");
//		System.out.println(giantWords); //keeps the order it is written in
		
		ArrayList<String> giantWords = new ArrayList<String>();
		giantWords.add("fee");
		giantWords.add("fie");
		giantWords.add("foe");

		for(String word: giantWords) {
		  System.out.print(word + "! ");
		}
		System.out.println();
	}

}
