package varType;

public class BirthdayCalculator {
	public static void main(String[] args) {
		int currentYear = 2025;
		int currentMonth = 7;
		int currentDay= 2;
		
		int birthMonth = 2;
		int birthDay = 9;
		
		System.out.println("=== 생일 정보 ===");
		System.out.println("현재 날짜 : "+currentYear+"년 "+currentMonth+"월 "+currentDay+"일");
		System.out.println("생일: "+ birthMonth+"월 "+birthDay+"일");
		 
		if(currentMonth == birthMonth) {
			System.out.println("혹시 이번달 생일이야?");
			if(currentDay == birthDay) {
				System.out.println("와우 생일이시네요~!");
			}
		}
	}
}
