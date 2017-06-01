import java.util.ArrayList;

public class NoRainOrUmbrella {

	public static void main(String[] args) {
		// Better bring an umbrella = true
		// No rain today, enjoy the sun! = false

		ArrayList<Boolean> weather = new ArrayList<Boolean>();		
		
		weather.add(true);
		weather.add(false);
		weather.add(false);
		weather.add(true);
		System.out.println(weather); //prints out true and false
		
		Boolean test = true; //giving boolean a value just like when we name a string
		for (Boolean check : weather) { //check is a temporary reference name for weather   
		if (check) { //runs through each variable(weather name up top) and checks it to see if it is true or false to see which statement to print out
			test = true;
				System.out.println("Better bring an umbrella");

			} else {
				System.out.println("No rain today, enjoy the sun!");
			}
 // this also runs in the order you set it up at the top. if you switch any of the true or false weathers it will print in that order
		}
	}
}

	
