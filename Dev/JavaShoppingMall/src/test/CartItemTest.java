package test;

import model.CartItem;
import model.Product;

public class CartItemTest {
 public static void main(String[] args) {
	 Product product1 = new Product("001", "lee", 5000, 10, "humanoid");
	 Product product2 = new Product("002", "lee", 5000, 10, "humanoid");
	 Product product3 = new Product("003", "lee", 5000, 10, "humanoid");
	 
	 
	CartItem cart = new CartItem(product1, 2);
	CartItem cart2 = new CartItem(product2, 2);
	CartItem cart3 = new CartItem(product3, 2);
	
	
	System.out.println(cart.getTotalPrice());
	System.out.println(cart.getProduct());
}
}
