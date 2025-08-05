package innerClass;


class OuterClass{
	private int num = 0;
	private static int sNum = 20;
	private InClass inClass;
	public OuterClass() {
		inClass = new InClass();
	}
	class InClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println();
		}
	}
}

public class InnerClass {
	public static void main(String[] args) {
		 
	}
}
