package shopping;

public class ShoppingCartApp {

	public static void main(String[] args) {
		Cart cart = new Cart(); //create this before sending it messages

		CartItem mangoes = new CartItem("mango", 1.25, 4);
		System.out.println(mangoes);
		System.out.println(mangoes.totalPrice());
	
		cart.addItem(mangoes);
		
		CartItem avacados = new CartItem("avacado", 1.79, 3);
		
		cart.addItem(avacados);
		
		System.out.println(cart);
		System.out.println("Total price is " + cart.totalPrice());
	}

}
