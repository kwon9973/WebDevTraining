package oop;

import java.util.*;
import java.math.*;

public class Method {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice = 0;
		int choiceNumber = 0;
		do {
			System.out.println("=== 문제 목록 ===");
			System.out.println("3. 문자열 뒤집기");
			System.out.println("2. 소수 판별 찾기");
			System.out.println("1. 최댓값 찾지 (배열 없이)");
			System.out.println("0. 프로그램 종료");
			System.out.print("풀어볼 문제 번호 선택하세요 (0: 종료)");
			choiceNumber = input.nextInt();
			input.nextLine();
			
			if(choiceNumber == 1) {
				findMaxMain();
			}else if(choiceNumber == 2) {
				findPrime();
			}else if(choiceNumber == 3) {
				reverse();
			}
			System.out.println("---------------------------------------------");
			System.out.println();
		}while(choiceNumber == 1 || choiceNumber == 2 || choiceNumber == 3);
	}
	
	
	
	private static void reverse() {
		String str = "";
		String reversed = "";
		
		System.out.println("=== 문제 5: 문자열 뒤집기 ===");
		System.out.println("문자열을 입력하면 거꾸로 뒤집어드립니다.");
		System.out.print("문자열을 입력하세요: ");
		str = input.nextLine();
		
		for (int i = str.length()-1; i >= 0 ; i--) {
			reversed += str.charAt(i);
		}
		
		System.out.println("원본: "+ str);
		System.out.println("뒤집은 결과: " + reversed);
		
	}



	private static void findPrime() {
		double num = 0;
		double squared = 0;
		boolean valid = true;
		
		System.out.println();
		System.out.println("=== 문제 2: 소수 판별하기");
		System.out.println("숫자를 입력하면 소수인지 판별해드립니다.");
		System.out.print("숫자를 입력하세요: ");
		
		num = input.nextInt();
		squared = Math.floor(Math.sqrt(num));
		
		for(int i = 2; i <= squared; i++) {
			if(num % i == 0) {
				valid = false;
				break;
			}
		}
		
		if(valid == true || num == 3) {
			System.out.println("소수가 맞습니다");
		}else {
			System.out.println("소수가 아닙니다");
		}
	}


	private static void findMaxMain() {
		// TODO Auto-generated method stub
		int choiceNumber = 0;
		
		System.out.println("=== 문제 1: 최갯값 찾기 ===");
		System.out.println("여러 개의 숫자를 입력하여 최댓값을 찾아보세요.");
		System.out.print("숫자 개수를 입력하세요: ");
		choiceNumber = input.nextInt();
		
		findMax(choiceNumber, input);
	}
	
	
	public static void findMax(int choiceNumber, Scanner scanner) {
		int max = 0;
		int num = 0;
		
		for(int i = 0; i < choiceNumber; i++) {
			System.out.print((i+1) + "번째 숫자: ");
			num = scanner.nextInt();
			if(num > max) {
				max = num;
			}
		}
		System.out.println("최댓값: "+ max );
	}
}
