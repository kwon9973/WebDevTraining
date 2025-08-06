package test;

import exception.InsufficientStockException;
import model.*;

public class ProductTest {
	public static void main(String[] args) {
		Product mall = new Product("P001", "갤럭시 스마트폰", 800000, 4, "전자제품");
		System.out.println(mall.isLowStock()); 
		Product mall2 = new Product("P001", "갤럭시 스마트폰", 800000, 10, "전자제품");
		System.out.println(mall2.isLowStock());
		
		try {
			mall.reduceStock(2);
		
		} catch (InsufficientStockException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				mall2.reduceStock(3);
			} catch (InsufficientStockException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		mall.addReview(8);
		mall2.addReview(2);
	}
}
