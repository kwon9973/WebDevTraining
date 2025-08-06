package lambda2;

public class PrintStringMain {
	public static void main(String[] args) {
		PrintString lambdaStr = s -> System.out.println(s);
		
		lambdaStr.showString("hello");
		
		showString2(lambdaStr);
		
		PrintString prStr = showString3(); // ????????????
		prStr.showString("Hello ");
	}
	
	
	public static void showString2(PrintString str) {
		str.showString("wooo"); // 매개변수 전환 가능
	}
	public static PrintString showString3() {
		
		return str -> System.out.println(str + "whatever"); //str even relavent or in use?
	}
}
