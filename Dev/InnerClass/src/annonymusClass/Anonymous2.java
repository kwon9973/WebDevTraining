package annonymusClass;

class Outer2 {
	
	Runnable getRunnable(final int i) {
		final int num = 100;
		
		return new Runnable() {
			
			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
			}
		};
	}
	
	
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("runnable이 구현된 익명 클래스 변수");
		}
	};
}



public class Anonymous2 { // MAIN 함수
	/*
	Runnable runner = new Runnable() {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("runnable이 구현된 익명 클래스 변수");
		}
	};
	*/
	
	/*
	Thread thread = new Thread(new Runnable() {
		@Override
		public void run(){
			System.out.println("running runnable from an thread instance");
		}
	});
	
	thread.start();
	
	try {
		Thread.sleep(1000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	*/
}
