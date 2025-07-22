package employeeInfo;

import java.util.*;

public class EmployeeMain {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int count = 3;
		Employee[] employee = new Employee[3];
		
		for(int i =0; i <employee.length;i++) {
			employee[i] = new Employee();
		}
		
		input(employee);
		output(employee);
	}
	
	
	
	

	private static void output(Employee[] employee) {
		
		int total = 0;
		float totalScore = 0;
		System.out.println("=== 직원 정보 목록 ===");
		
		for(int i =0; i <employee.length;i++) {
			System.out.printf("이름: %s 사번: %d 급여: %d 성과점수: %.1f 고용형태: %s 부서: %s\n", 
					employee[i].name, employee[i].ID, 
					employee[i].paycheck, employee[i].score, 
					(employee[i].isFullTime == true ? "정규직": "비정규직"), 
					employee[i].department);
			
			total += employee[i].paycheck;
			totalScore += employee[i].score;
		}
		
		System.out.println();
		System.out.println("총급여: "+ total);
		System.out.printf("평균 성과 점수: %.1f점", (totalScore / employee.length));
	}

	public static void input(Employee[] employee) {
		// TODO Auto-generated method stub
		for(int i =0; i <employee.length;i++) {
			employee[i].name = input.next();
			employee[i].ID = input.nextInt();
			employee[i].paycheck = input.nextInt();
			employee[i].score = input.nextFloat();
			employee[i].isFullTime = input.nextBoolean();
			employee[i].department = input.next();
		}
	}
}
