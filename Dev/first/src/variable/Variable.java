package variable;

public class Variable {
	public static void main(String[] args) {
		
		int num, num2 = 0;
		
		num = 10;
		num2= 3;
		
		// TODO Auto-generated method stub
		System.out.println("=== 간단한 계산기 ===");
		System.out.println("숫자1: " + num);
		System.out.println("숫자2: " + num2);
		System.out.println();
		
		System.out.println("덧셈: " + num + "+" + num2 + "=" + (num+num2));
		System.out.println("뺄셈: " + num + "-" + num2 + "=" + (num-num2));
		System.out.println("곱셈: " + num + "*" + num2 + "=" + (num*num2));
		System.out.println("나눗셈: " + num + "/" + num2 + "=" + (num/num2));
		System.out.println("나머지: " + num + "%" + num2 + "=" + (num%num2));
	}
}