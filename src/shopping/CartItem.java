package shopping;

public class CartItem {
	String name; // these are the instance variables (String, pricePerItem, quantity)
	double pricePerItem; // double bc we will have a decimal point in it;BigDecimal rounds things(best with money)
	int quantity;

	public CartItem(String itemName, double itemPrice, int itemQuantity) { //this is the constructor we created
		name = itemName; // no connection to the above variables until we assign them here
		pricePerItem = itemPrice;
		quantity = itemQuantity;
	}

	public double totalPrice() { // use double bc there is a decimal point and using math									 
		return pricePerItem * quantity;
	}

	// toString () gives us a String representation. this prints out above when we call for mangoes
	public String toString() { //if we don't do this it will call the object of the class not our info
		return quantity + " " + name + " @ $" + pricePerItem;

	}
}
