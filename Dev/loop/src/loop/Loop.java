package loop;


public class Loop {
	public static void main(String[] args) {
		/*
		System.out.println("Lab. 시간표 생성 시스템");
		System.out.println("9시부터 18시까지, 월요일부터 금요일까지 시간표 생성하기");
		System.out.println();
		
		String[] days = {"월","화","수","목","금"};
		String toDo = "회의";
		
		System.out.printf("%-7s ", "시간\\요일");
		for(int i = 0; i < days.length; i++) {
			System.out.printf("%-5s", days[i]);
		}
		System.out.println();
		
		for(int i = 9; i < 18+1; i++) {
			System.out.printf("%-8d", i);
			for(int j = 3; j < 7+1; j++) {
				if((i + j) % 3 == 0 ) {
					System.out.printf("%-5s", "회의");
				}else {
					System.out.printf("%-5s", "자유");
				}
			}
			System.out.println();
		}
		*/
		
		seatReservation();
		
		
		
		
	}
	
	private static void seatReservation() {
		System.out.println("Lab2. 좌석 예약 현황 시스템");
		System.out.println("8행 10열의 좌석 현황을 표시합니다. (o: 예약가능, x: 예약불가");
		System.out.println();
		
		int row = 8;
		int cols = 10;
		int o = 0;
		int x = 0;
		System.out.print("\s".repeat(4));
		
		for(int i = 1; i < 10+1; i++) {
			System.out.printf("%-2d", i);
		}
		
		System.out.println();
		
		for(int i = 1; i < 8+1; i++) {
			
			
			
			System.out.printf("%2d: ",i);
			
			for(int j = 1; j < 10+1; j++) {
				if((i + j)%3 == 0){
					System.out.printf("%-2s","X");
					x++;
				}else {
					System.out.printf("%-2s","O");
					o++;
				}
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("총 좌석 수: 80");
		System.out.println("예약된 좌석: " + x);
		System.out.println("예약 가능: " + o);
		
	
	}
}
