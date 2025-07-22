package oop;
import java.util.*;


public class Oop {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String choice = "";
		
		
		do {
			int num = 0;
			int num2 = 0;
			String operator = "";
			
			
			System.out.println(" === 간단한 계산기=== ");
			
			
			System.out.print("첫 번쨰 숫자를 입력하세요: ");
			num = input.nextInt();
			
			
			
			System.out.print(" === 연산자를 입력하세요 (+, -, *, /): ");
			operator = input.next();
			
			System.out.print("두 번쨰 숫자를 입력하세요: ");
			num2 = input.nextInt();
			
			
			
			switch(operator) {
				case "+":
					continue;
				case "-":
					continue;
				case "*":
					continue;
				case "/":
					calculate(num, num2, "/");
			}
			
			
			System.out.print("계속 하시겠습니까?: ");
			choice = input.next();
			
		}while(choice != "y");
		
	}
	
	private static void calculate(int num, int num2, String str) {
		int result = 0;
		
		try {
			result = num / num2;
			System.out.println(num +" "+ str +" "+ num2+ " = " + result );
		}catch(Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
	
	
	
	
	
}
