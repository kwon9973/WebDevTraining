package stream;

import java.util.Arrays;

public class UserInfoMain {
	public static void main(String[] args) {
		String[] arr = {"banana","apple","pineapple"};
		
		//Arrays.asList(arr).stream().forEach(s -> System.out.println(s));
		
		Arrays.asList(arr).forEach(System.out::println);
		Arrays.asList(arr);
		
		
		
		
		
	}
}
