package model;
import java.time.LocalDateTime;

public class Manager extends Person{
	
	 private String department; // 부서
	 private int employeeId;   // 사번
	 
	 public Manager(String id, String name, String email, String department, int employeeId) {
	        super(id, name, email);
	        this.department = department;
	        this.employeeId = employeeId;
	    }

	 @Override
	 public String getUserType() {
		// TODO Auto-generated method stub
		return "관리자";
	 }
	 
	 public String getDepartment() { return department; }
	 public int getEmployeeId() { return employeeId; }
	 
	 @Override
	 public String toString() {
		 return super.toString() + String.format(", 부서: %s, 사번: %d\n", department, employeeId);
	 }
}
