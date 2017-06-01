package restaurant;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class RestaurantMenuItems {

	public static void main(String[] args) {
		// create a map with the menus items and prices
		// use double for prices
		// then use BigDecimal

		Map<String, BigDecimal> menu = new HashMap<String, BigDecimal>();

		menu.put("spaghetti", new BigDecimal("8.97"));
		menu.put("lasagna", new BigDecimal("10.98"));
		menu.put("pizza", new BigDecimal("15.50"));
		menu.put("caesar salad", new BigDecimal("7.00"));
		menu.put("kale salad", new BigDecimal("7.00"));

		System.out.println(menu);

		BigDecimal priceSpaghetti = menu.get("spaghetti");
		System.out.println("The price is actually " + priceSpaghetti);

		System.out.println("There are " + menu.size() + " menu items");

		menu.put("Bottle of Champagne", new BigDecimal("200.00"));
		menu.put("Bottle of Vintage Wine", new BigDecimal("175.00"));

		BigDecimal priceChampagne = menu.get("Bottle of Champagne");
		System.out.println("The price is  " + priceChampagne);

		BigDecimal priceVintageWine = menu.get("Bottle of Vintage Wine");
		System.out.println("The price is  " + priceVintageWine);

		if (menu.containsKey("Bottle of Champagne")) {
			System.out.println("Yes we do have that.");

			if (menu.containsValue(13.50)) {
				System.out.println("Yes that is a price on the menu.");

			} else {
				System.out.println("No that is a price on the menu.");
			}

			menu.remove("kale salad");
			System.out.println("Kale Salad is now removed from menu.");
			System.out.println(menu);

			menu.clear();
			if (menu.isEmpty()) {
				System.out.println(menu);
				System.out.println("Menu is now empty");
			}
		}
	}
}
