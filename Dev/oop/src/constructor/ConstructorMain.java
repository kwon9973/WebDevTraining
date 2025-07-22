package constructor;

public class ConstructorMain {
	
	
	public static void main(String[] args) {
		
		Constructor bookPrime = new Constructor();
		Constructor book = new Constructor("10분만에따라하는 Claude MCP 업무 자동화 혁신 가이드", "이호준", 0);
		Constructor book2 = new Constructor("생성형 ai를 위한 책", "김강찬", 354);
		
		System.out.println(bookPrime);
		System.out.println(book);
		System.out.println(book2);
	}
	
}
