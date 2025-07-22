package employeeAgain;
import java.util.*;
  
public class EmployeeMain {
	
	static Scanner input = new Scanner(System.in);
	static int employeeCount = 0;
	static int totalSalary = 0;
	static double totalScore = 0;
	static float numberOfFullTime = 0;
	
	public static void main(String[] args) {
		
		int num;
		int index = 0;
		
		System.out.print("등록할 인원수:");
		num = input.nextInt();
		
		Employee[] employee = new Employee[num];
		for(int i = 0; i < employee.length; i++) {
			employee[i] = new Employee();
		}
		
		do {
			input(employee);
			index++;
		}while(index < num);
		output(employee);
		aftermath(employee);
	}

	private static void aftermath(Employee[] employee) {
		System.out.println("전체급여: " + totalSalary + "원");
		System.out.println("평균급여: " + Math.round(totalSalary / employee.length));
		System.out.printf("평균성과점수: %.1f점\n", (totalScore / employee.length));
		System.out.printf("정규직 비율: %.1f %%\n", (numberOfFullTime / employee.length)*100);
	}

	public static void output(Employee[] employee) {
		for(int i = 0; i < employee.length; i++) {
			System.out.printf("%d. %s (사번: %d)\n", (i+1) , employee[i].name, employee[i].ID);
			System.out.printf("급여: %d원\n", employee[i].salary);
			System.out.printf("성과점수: %.1f점\n", employee[i].score);
			System.out.printf("고용형태: %s\n", (employee[i].isFullTime == true? "정규직":"비정규직"));
			System.out.printf("부서: %s\n", dep(employee[i].department));
		}
	}

	private static String dep(String emp) {
		switch(emp) {
			case"A":
				return "개발";
			case"B":
				return "마케팅";
			case"C":
				return "영업";
		}
		return null;
	}

	public static void input(Employee[] employee) {
		System.out.print("이름: ");
		employee[employeeCount].name = input.next();
		System.out.print("사번: ");
		employee[employeeCount].ID = input.nextInt();
		System.out.print("급여: ");
		employee[employeeCount].salary = input.nextInt();
		System.out.print("성과 점수(0.0~10.0): ");
		employee[employeeCount].score = input.nextDouble();
		System.out.print("정규직 여부 (true/false): ");
		employee[employeeCount].isFullTime = input.nextBoolean();
		System.out.print("부서 코드: ");
		employee[employeeCount].department = input.next();
		System.out.println();
		
		totalSalary += employee[employeeCount].salary;
		totalScore += employee[employeeCount].score;
		if(employee[employeeCount].isFullTime == true) {
			numberOfFullTime++;
		}
		
		employeeCount++;
	}
}
