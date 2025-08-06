package test;
import exception.*;
import model.*;
import service.ShoppingMall;

public class ExceotionTest {
	public static void main(String[] args) {
		
		Product product = new Product("P001", "갤럭시 스마트폰", 800000, 10, "전자제품");
		//Customer customer = new Customer("C001", "김철수", "kim@email.com");
		ShoppingMall shop = new ShoppingMall();
		
		try {
			product.reduceStock(3);
			shop.addCustomer("C001", "김철수", "kim@email.com");
			shop.addToCart("C001", "P001", 2);
		}catch(ShopException e) {
			System.out.println(e.getClass() + " 고객을 찾을 수 없습니다.");
		}catch(InsufficientStockException e2) {
			System.out.println(e2.getClass() + " 재고가 부족합니다.");
		}
		
		
		try {
			shop.addToCart("C001", "P001", 2);
		}catch(CustomerNotFoundException e3) {
			System.out.println(e3.getClass() + " 고객을 찾을 수 없습니다.");
		}catch(ProductNotFoundException e1) {
			System.out.println(e1.getClass() + " 상품을 찾을 수 없습니다.");
		}
		
		
	}
}
