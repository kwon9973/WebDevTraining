package data;


public class EmployeeMain {
	public static void main(String[] args) {
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		System.out.println(Employee.serialNum);
		
		
		Employee employeeLee2 = new Employee();
		employeeLee.setEmployeeName("아리랑");
		employeeLee2.serialNum++;
		System.out.println(employeeLee2.serialNum);
		
		
		  
		System.out.println(employeeLee.serialNum);
		System.out.println(employeeLee2.serialNum);
	}
}
