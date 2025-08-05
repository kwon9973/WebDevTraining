package test;
import service.ShoppingMall;
import exception.*;
import model.*;

public class ShoppingMallTest {
	public static void main(String[] args) {
		
		
		ShoppingMall mall = new ShoppingMall();
		
		try {
			mall.addCustomer("123","kwon","kwon9973@gmail.com");
			
		} catch (ShopException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("sys end");
		
	}
	
}
