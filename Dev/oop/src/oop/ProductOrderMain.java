package oop;

public class ProductOrderMain {
	public static void main(String[] args) {
		ProductOrder[] product = new ProductOrder[3];
		for(int i = 0; i < product.length; i++) {
			product[i] = new ProductOrder(); 
		}
		
		product[0].name = "두부";
		product[0].price = 2000; 
		product[0].amount = 2;
		
		product[1].name = "김치";
		product[1].price = 5000;
		product[1].amount = 1;
		
		product[2].name = "콜라";
		product[2].price = 1500;
		product[2].amount = 2;
		
		for(int i = 0; i < product.length; i++) {
			System.out.println(product[i].name +" "+ product[i].price +" "+ product[i].amount); ;
		}
		int total = 0;
		for(int i = 0; i < product.length;i++) {
			total += (product[i].price * product[i].amount);
		}		
		
		System.out.println("총금액: " + total);
		
	}
}
