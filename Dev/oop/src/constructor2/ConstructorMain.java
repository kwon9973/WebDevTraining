package constructor2;

public class ConstructorMain {
	public static void main(String[] args) {
		
		Constructor p = new Constructor();
		Constructor p2 = new Constructor("이순신", 0);
		Constructor p3 = new Constructor("신사임당", 20);
		Constructor p4 = new Constructor("류승룡", 22, "컴퓨터 공학 LLM");
		
		System.out.println(p);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println();
		System.out.println("===생성자 오버로딩 완료===");
	}	
}
