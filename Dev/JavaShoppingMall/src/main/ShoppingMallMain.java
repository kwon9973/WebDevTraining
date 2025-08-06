package main;

import java.util.Scanner;
import service.ShoppingMall;
import exception.*;
import model.*;

public class ShoppingMallMain {
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		int choice;
		ShoppingMall mall = new ShoppingMall();
		
		do {
			System.out.println("====메인 메뉴===");
			System.out.println("1. 상품관리");
			System.out.println("2. 고객관리");
			System.out.println("3. 장바구니 관리");
			System.out.println("4. 주문 관리");
			System.out.println("5. 통계 정보");
			System.out.println("0. 종료");
			choice = input.nextInt();
			
			switch(choice) {
				case 1 :
					
					productMenu();
					int choice2 = input.nextInt();
					if(choice2 == 1) {
						  try{
							mall.addProduct("P001", "갤럭시 스마트폰", 800000, 10, "전자제품");
							mall.addProduct("P002", "애플 노트북", 1500000, 5, "전자제품");
						    mall.addProduct("P003", "무선 이어폰", 150000, 20, "전자제품");
						    mall.addProduct("P004", "게이밍 키보드", 120000, 8, "컴퓨터");
						    mall.addProduct("P005", "모니터", 300000, 3, "컴퓨터");
						    mall.addProduct("P006", "운동화", 89000, 15, "의류");
						    mall.addProduct("P007", "청바지", 65000, 12, "의류");
						    mall.addProduct("P008", "백팩", 45000, 7, "가방");
						  } catch (ShopException e) {
							e.printStackTrace();
						  }
					}else if(choice2 == 2) {
						mall.displayAllProducts();
					}else if(choice2 == 3) {
						mall.displayAvailableProducts();
					}else if(choice2 == 4) {
						System.out.println("enter the name of the product: ");
						String name = input.next().trim();
						System.out.println(mall.searchProductsByName(name)); 
					}else if(choice2 == 5) {
						System.out.println("what category you want to shop in");
						String category = input.next().trim();
						System.out.println(mall.getProductsByCategory(category)); 
					}else if(choice2 == 6) {
						mall.displayAvailableProducts();
					}else {
						break;
					}
					break;
				case 2 :
					
					System.out.println("1. 고객 등록");
					System.out.println("2. 관리자 등록");
					System.out.println("3. 고객 주문 내역 조회");
					System.out.println("0. 메인 메뉴로 돌아가기");
					int choice3 = input.nextInt();
					if(choice3 == 1) {
						  try{
							  mall.addCustomer("C001", "김철수", "kim@email.com");
						      mall.addCustomer("C002", "이영희", "lee@email.com");
						      mall.addCustomer("C003", "박민수", "park@email.com");
						  } catch (ShopException e) {
							e.printStackTrace();
						  }	
					}else if(choice3 == 2) {
						 try {
							mall.addManager("M001", "정관리", "admin@mall.com", "운영팀", 1001);
						 } catch (ShopException e) {
							e.printStackTrace();
						 }
					}else if(choice3 == 3) {
						mall.displayMallStatistics();
					}else {
						break;
					}
					break;
				case 3:
					System.out.println("1. 장바구니에 상품 추가");
					System.out.println("2. 장바구니 보기");
					System.out.println("0. 메인 메뉴로 돌아가기");
					int choice4 = input.nextInt();
					if(choice4 == 1) {
						  try{
							  mall.addToCart("K001", "P001", 2);
							  mall.addToCart("K002", "P002", 2);
							  mall.addToCart("K003", "P003", 2);
							  mall.addToCart("K004", "P004", 2);
						  } catch (ShopException e) {
							e.printStackTrace();
						  }	
					}else if(choice4 == 2) {
						try {
							mall.displayCart("C001");
							mall.displayCart("C002");
							mall.displayCart("C003");
						}catch(ShopException e) {
							e.printStackTrace();
						}
					}else {
						break;
					}
					break;
				case 4:
					
					String id = "";
					System.out.println("1. 주문하기");
					System.out.println("2. 고객 주문 내역 보기");
					System.out.println("0. 메인 메뉴로 돌아가기");
					int choice5 = input.nextInt();
					if(choice5 == 1) {
						System.out.println("customer ID to place an order: ");
						id = input.next();
						try {
							mall.placeOrder(id);
						} catch (ShopException e) {
							e.printStackTrace();
						}
					}else if(choice5 == 2) {
						try {
							System.out.println("enter customer id: ");
							id = input.next();
							mall.displayCustomerOrders(id);
						} catch (CustomerNotFoundException e) {
							e.printStackTrace();
						}
					}else if(choice5 == 0) {
						break;
					}
					break;
				case 5:
					
					mall.displayMallStatistics();
					break;
				case 0:
					
					break;
			}
		}while(choice != 0);
	}

	private static void productMenu() {
		System.out.println("1. 상품 추가");
		System.out.println("2. 전체 상품 보기");
		System.out.println("3. 구매 가능한 상품 보기");
		System.out.println("4. 상품 검색 (이름)");
		System.out.println("5. 카테고리별 상품 보기");
		System.out.println("6. 재고 부족 상품 보기 (5개 이하)");
		System.out.println("0. 메인 메뉴로 돌아가기");
	}
	
	
	
}
