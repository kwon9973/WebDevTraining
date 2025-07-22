package oop;

public class MegaCoffeeMain {
	public static void main(String[] args) {
		
		MegaCoffeeItem[] megaCoffee = new MegaCoffeeItem[3];
		
		megaCoffee[0] = new MegaCoffeeItem();
		megaCoffee[1] = new MegaCoffeeItem();
		megaCoffee[2] = new MegaCoffeeItem();
		
		megaCoffee[0].menu = "아메리카노";
		megaCoffee[1].menu = "카페라뗴";
		megaCoffee[2].menu = "딸기 에이드";
		
		megaCoffee[0].price = 4500;
		megaCoffee[1].price = 5500;
		megaCoffee[2].price = 6000;
		
		megaCoffee[0].type = "커피";
		megaCoffee[1].type = "커피";
		megaCoffee[2].type = "음료";
		
		megaCoffee[0].isHot = true;
		megaCoffee[1].isHot = true;
		megaCoffee[2].isHot = false;
		
		String[] str = new String[3];
		for(int i =0; i <megaCoffee.length;i++) {
		str[i] = megaCoffee[i].isHot == true ? "hot": "cold";
		}
		
		System.out.println("=== 메가 커피 인기메뉴 ===");
		for(int i = 0; i < megaCoffee.length;i++) {
			System.out.println("메뉴: " + megaCoffee[i].menu +" | 가격: " +megaCoffee[i].price+"원 | 분류: " + megaCoffee[i].type +" | 온도: " + str[i]);
		}
		
	}
}
