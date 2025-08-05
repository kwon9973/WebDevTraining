package collection;
import java.util.*;

public class LambdaEmployee {
	private String employeeId;
	private String position;
	private int salary;
	private String department;
	private String email;
	private String name;
	
	
	public LambdaEmployee(String employeeId, String name, String department) {
		//super();
		this.employeeId = employeeId;
		this.department = department;
		this.name = name;
	}
	public LambdaEmployee(String employeeId, String name, String department, String position, int salary,  String email) {
		//super();
		this.employeeId = employeeId;
		this.position = position;
		this.salary = salary;
		this.department = department;
		this.email = email;
		this.name = name;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return String.format("사번: %s | 이름: %s | 부서: %s | 직급: %s | 급여: %s | 입사일 %s" , employeeId, name, department, position != null ? position : "미지정", salary);
	}
	@Override
	public boolean equals(Object obj) {
		//같은 주소를 가리키면 같은 객체
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		LambdaEmployee lam = (LambdaEmployee) obj;
		return Objects.equals(employeeId, lam.employeeId);
	}
	public int hashcode(){
		return Objects.hash(employeeId);
	}
}
