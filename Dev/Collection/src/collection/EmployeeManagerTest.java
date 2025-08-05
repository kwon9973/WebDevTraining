package collection;

public class EmployeeManagerTest {
	public static void main(String[] args) {
		
		EmployeeManager manager = new EmployeeManager();
		
		addEmployees(manager);
		
		
		
	}
	
	private static void showAllEmploees(EmployeeManager manager) {
		System.out.println("\n2. 전체 직원 조회");
		System.out.println("-".repeat(20));
		
		manager.showAllEmployees();
	}
	
	
	
	private static void addEmployees(EmployeeManager manager) {
		System.err.println("1. 직원 추가");
		System.out.println("-".repeat(30));
		
		LambdaEmployee emp = new LambdaEmployee("emp001", "이방원", "개발팀", "주임", 45000000, "lee@gmail.com");
		LambdaEmployee emp2 = new LambdaEmployee("emp002", "이권형", "마켓팅팀", "대리", 55000000, "kwon@gmail.com");
		LambdaEmployee emp3 = new LambdaEmployee("emp003", "야차룰", "개발팀", "주임", 35000000, "ya@gmail.com");
		LambdaEmployee emp4 = new LambdaEmployee("emp004", "요시기", "인사팀", "과장", 65000000, "yo@gmail.com");
		LambdaEmployee emp5 = new LambdaEmployee("emp005", "김파수", "개발팀", "주임", 45000000, "kim@gmail.com");
		
		manager.addEmployee(emp);
		manager.addEmployee(emp2);
		manager.addEmployee(emp3);
		manager.addEmployee(emp4);
		manager.addEmployee(emp5);
		
		LambdaEmployee duplicatedEmp = new LambdaEmployee("emp001", "이방원", "개발팀", "주임", 45000000, "lee@gmail.com");
		manager.addEmployee(duplicatedEmp);
	}
}
