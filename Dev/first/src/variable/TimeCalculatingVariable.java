package variable;



public class TimeCalculatingVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hour = 8;
		int day = 22;
		int pay = 15000;
		
		System.out.println("--- 근무시간 계산 ---");
		System.out.println("일일 근무 시간: " + hour + "시간");
		System.out.println("월 근무일수: "+ day + "일");
		System.out.println("시금: "+ pay+ "원");
		System.out.println();
		
		int hoursInMonth = 8 * 22;
		int payPerDay = pay * 8;
		int payPerMonth = payPerDay * 22;
		
		
		System.out.println("월 총 근무시간: "+ hoursInMonth + "시간");
		System.out.println("일급: "+ payPerDay + "원");
		System.out.println("월급: "+ payPerMonth + "원");
		System.out.println();
		
		System.out.println("--- 추가 정보 --- ");
		System.out.println("연간 총 근무시간: "+ (hoursInMonth * 12) + "시간");
		System.out.println("연봉: "+ (payPerMonth * 12)  + "원");
		System.out.println("하루는 총 "+ (24*60*60) + "초입니다");
		System.out.println("일주일은 총 "+ ((24*7)*60) + "분입니다");
		
		
		
	}

}
