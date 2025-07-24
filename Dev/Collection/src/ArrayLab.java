
import java.util.*;

public class ArrayLab {
	private static Scanner input = new Scanner(System.in);
	static List<StudentForLab> studentList = Arrays.asList(
			new StudentForLab("이순신",20, 3.5, "컴퓨터공학과"), 
			new StudentForLab("신사임당",21, 3.7, "국문학과"), 
			new StudentForLab("차인표",19, 3.2, "정치학과"), 
			new StudentForLab("박지성",22, 3.4, "생명공학과") );
	
	
	public static void main(String[] args) {
		//initializaData();
		int choice = 0;
		
		do {
			printMenu();
			choice = input.nextInt();
			input.nextLine(); //버퍼 지우기
			
			switch(choice) {
				case 2:
					viewAllStudent();
				case 0:
					System.out.println("종료합니다\n");
					break;
				default:
					System.out.println("선택오류");
			}
		}while(choice != 0);
		
	}
	
	
	
	private static void viewAllStudent() {
		// TODO Auto-generated method stub
		System.out.println("=== 전체 학생 목록 ===");
		System.out.println("이름 \t 나이\t 전공 \t 학점");
		System.out.println("----------------------------");
		
		System.out.println(studentList.get(0));
		System.out.println(studentList.get(1));
		System.out.println(studentList.get(2));
		System.out.println(studentList.get(3));
		System.out.println("\n총 " + studentList.size() + "명의 학생이 등록되어 있습니다.");
	}



	private static void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("===학생 관리 시스템===");
		System.out.println("1 학생추가");
		System.out.println("2 전체 학생 조회");
		System.out.println("3 학생 검색");
		System.out.println("4 학생 정보 수정");
		System.out.println("5 학생 삭제");
		System.out.println("6 통계 정보");
		System.out.println("0 종료");
		System.out.println("선택: ");
	}
	/*
	private static void initializaData() {
		// TODO Auto-generated method stub
		List<StudentForLab> studentList = Arrays.asList(
				new StudentForLab("이순신", 3.5, "컴퓨터공학과"), 
				new StudentForLab("신사임당", 3.7, "국문학과"), 
				new StudentForLab("차인표", 3.2, "정치학과"), 
				new StudentForLab("박지성", 3.4, "생명공학과") );
		
		StudentForLab student = new StudentForLab("이순신", 3.5, "컴퓨터공학과");
		StudentForLab student1 = new StudentForLab("신사임당", 3.7, "국문학과");
		StudentForLab student2 = new StudentForLab("차인표", 3.2, "정치학과");
		StudentForLab student3 = new StudentForLab("박지성", 3.4, "생명공학과");
		
		
	}
	*/
}
