package lambda;

public class StringConcatMain {
	public static void main(String[] args) {
		String s = "good";
		String a = "do";
		
		StringConcat concat = new StringConcatImpl();
		concat.makeString(s, a);
		
		StringConcat concat2 = (str, str2) -> concat.makeString(str, str2);
		
		System.out.println(concat2);
		/*
		StringConcat concat3 = new StringConcatImpl() {
			System.out.println(s + a)
		};8
		*/

	}
}
