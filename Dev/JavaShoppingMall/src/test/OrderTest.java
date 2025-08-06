package test;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

import model.*;

public class OrderTest {
	public static void main(String[] args) {
		
		LocalDateTime currentTime = LocalDateTime.now();
		
		Customer customer1 = new Customer("001", "kwon", "kwon9973@gmail.com");
		Customer customer2 = new Customer("002", "kwon", "kwon9973@gmail.com");
		Customer customer3 = new Customer("003", "kwon", "kwon9973@gmail.com");
		
		Product product1 = new Product("001", "lee", 5000, 10, "humanoid");
		Product product2 = new Product("002", "lee", 5000, 10, "humanoid");
		Product product3 = new Product("003", "lee", 5000, 10, "humanoid");
		 
		 
		CartItem cart = new CartItem(product1, 2);
		CartItem cart2 = new CartItem(product2, 2);
		CartItem cart3 = new CartItem(product3, 2);
		
		ArrayList <CartItem> cart1 = new ArrayList<CartItem>();
		cart1.add(cart);
		cart1.add(cart2);
		cart1.add(cart3);
		
		
		Order order = new Order("001", customer1, cart1, currentTime);
		
		
		
		System.out.println(order.getTotalAmount());
		System.out.println(order.getItems());
	}
}
