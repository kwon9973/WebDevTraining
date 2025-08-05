package stream;

import java.util.Arrays;
import java.util.List;

public class SortedTest {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("banana", "apple", "pineapple", "cayn");
		
		
		fruits.stream().sorted().forEach(n -> System.out.println(n));
		System.out.println();
		
		fruits.stream()
			.sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
			.forEach(n -> System.out.println("-" + n));
		
		
		
		
	}
}
