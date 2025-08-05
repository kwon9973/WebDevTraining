package annonymusClass;

class Outer {
	int outNum = 100;			// 외부 인스턴스 변수
	static int sNum = 200;		// 외부 정적 변수	
	
	Runnable getRunnable(int i) {
		int num = 100;			// 지역 변수
		
		//class MyRunnable implements Runnable {	// 지역 내부 클래스 
		return new Runnable() {
			int localNum = 10;					// 지역 내부 클래스의 인스턴스 변수
	
			@Override
			public void run() {
				//num += 200;	// 지역 변수는 상수로 바뀌므로 값을 변경할 수 없음.
				//i = 100;		// 매개변수도 지역 변수처럼 상수로 바뀌므로 값을 변경 할수 없음.
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum" + localNum);
				System.out.println("외부 클래스의 인스턴스 변수 : " + outNum);
				System.out.println("외부 클래스의 정적 변수 : " +sNum);
			}
		};
	}
	
	
	Runnable runner = new Runnable() {
		
		public void run() {
			System.out.println("Runnalbe이 구현된 이명 클래스 변수");
		}
	};
}

public class Anonymous {

	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runnable =  out.getRunnable(10);
		runnable.run();
	}
}
