package intArrayTest;

import java.util.Arrays;

public class IntArrayTset {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		Arrays.stream(arr).forEach(N -> System.out.println(N + " "));
		
		int sum = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count();
		System.out.println(sum);
		System.out.println(count);  
	}
}
