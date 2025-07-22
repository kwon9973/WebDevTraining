package variable;

import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("이름을 대시오: ");
		String name = input.next();
		
		
		int schoolNumber = 2025001;
		int math = 85;
		int english = 92;
		int science = 78;
		int korean = 88;
		int history = 90;
		int max = 0;
		int min = 100;
		int total = math+english+science+korean+history;
		int average = total/5;
		
		
		System.out.println("=== 성적 계산기 ===");
		System.out.println("학생명:" + name);
		System.out.println("학번: "+ schoolNumber);
		System.out.println();
		
		
		System.out.println("--- 과목별 점수 ---");
		System.out.println("수학" + math);
		System.out.println("영어" + english);
		System.out.println("과학"+ science);
		System.out.println("국어"+ korean);
		System.out.println("역사" + history);
		System.out.println("");
		
		
		System.out.println("총점: "+ total);
		System.out.println("평균: "+ average);
		
		int[] gradeArr = {math, english, science, korean, history};
		
		for(int i = 0; i < gradeArr.length; i++) {
			if(max < gradeArr[i]) {
				max = gradeArr[i];
			}
			if(min > gradeArr[i]) {
				min = gradeArr[i];
			}
		}
		
		System.out.println("최고점: " + max+"점");
		System.out.println("최저점: " + min+"점");
		System.out.println("최고 최저 점수 차이: " + (max-min));
		System.out.println();
		
		
		System.out.println("--- 등급 판정 ---");
		char gpa = ' ';
		String condition = "";
		
		if(average >= 90) {
			gpa = 'A';
			condition = "(우수)";
		}else if(average >= 80 && average < 90) {
			gpa = 'B';
			condition = "(좋음)";
		}else if(average >= 70 && average < 80) {
			gpa = 'C';
			condition = "(양호)";
		}else if(average >= 60 && average < 70) {
			gpa = 'D';
			condition = "(노력요함)";
		}else if(average < 60) {
			gpa = 'F';
			condition = "(조건미달)";
		}
		
		System.out.println("등급: " + gpa + " "+ condition);

	}
}
