package product;

import java.util.*;


public class ProductOrderMain {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {	
		int count = 0;
		
		System.out.print("입력할 주문의 개수를 입력하시요: ");
		count = input.nextInt();
		ProductOrder[] product = new ProductOrder[count];
		
		for(int i = 0; i < count; i++) {
			product[i] = new ProductOrder();
		}
		for(int i = 0; i < count; i++) {
			System.out.println((i+1)+"번째 주문 정보를 입력하세요.");
			input(product, i);
		}
		for(int i = 0; i < count; i++) {
			info(product, i);
		}
		
		int total = 0;
		for(int j = 0; j < product.length; j++) {
			total += product[j].price;
		}
		System.out.println("총 결제 금액: " + total );
		
	}
	
	
	public static void input(ProductOrder[] product, int i) {
		System.out.print("상품명: ");
		product[i].name = input.next();
		System.out.print("가격: ");
		product[i].price = input.nextInt();
		System.out.print("수량: ");
		product[i].amount = input.nextInt();
		System.out.println();
	}
	
	public static void info(ProductOrder[] product, int i) {
		System.out.println("상품명: "+ product[i].name +" | 가격: "+product[i].price+ " | 수량: " + product[i].amount);
	}
	
}
