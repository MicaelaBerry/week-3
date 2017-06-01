package shopping;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	List<CartItem> items = new ArrayList<CartItem>(); 
	
	public void addItem(CartItem item){
		items.add(item);
	}
	
	public String toString(){
		return "Cart with items: " + items;	
	}
	
	public double totalPrice(){
		double total = 0; //0 is the default setting
		for(CartItem currentItem:  items){ //we did a FOR loop bc it keeps checking for cart(current)items and adds them
			total = total + currentItem.totalPrice();
		}
	return total;
	}
}
