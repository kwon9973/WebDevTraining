package test;
import service.ShoppingMall;
import exception.*;
import model.*;

public class ShoppingMallTest {
	public static void main(String[] args) {
		
		
		ShoppingMall mall = new ShoppingMall();
		
		try {
			mall.addCustomer("123","kwon","kwon9973@gmail.com");
			mall.addProduct("P008", "백팩", 45000, 7, "가방");
			
			mall.displayAllProducts();
			
		} catch (ShopException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
