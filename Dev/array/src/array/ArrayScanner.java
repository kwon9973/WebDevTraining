package array;

import java.util.*;



public class ArrayScanner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[5];
		
		System.out.println("5개의 정수를 입력하십시오: ");
		
		for(int i = 0; i < 5; i++) {
			numbers[i] = input.nextInt();
		}
		
		System.out.println("출력: ");
		for(int i = 0; i < 5; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
