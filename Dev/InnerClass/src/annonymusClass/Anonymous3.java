package annonymusClass;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;


public class Anonymous3 {
	
	static class Employee{
		private String name;
		private int age;
		private String department;
		private double salary;
		private Date hiredDate;
		
		
		public Employee(String name, int age, String department, double salary, Date hiredDate) {
			super();
			this.name = name;
			this.age = age;
			this.department = department;
			this.salary = salary;
			this.hiredDate = hiredDate;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public Date getHiredDate() {
			return hiredDate;
		}
		public void setHiredDate(Date hiredDate) {
			this.hiredDate = hiredDate;
		}
		public String toString() {
			return name + "-" +age +"-" + department +"-" + salary +"-" + hiredDate +"\n";
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("컬렉션 정렬 - 직원 데이터 관리 시스템\n");
		
		//DB 조회 가정
		List<Employee> employees = createEmployees();
		printEmployee(employees);
		sortByAge(employees);
	}
	
	
	private static void sortByAge(List<Employee> employees) {
		System.out.println("나이순 정렬");
		List<Employee> sorted = new ArrayList<>(employees);
		
		//기본
		sorted.sort(new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				return Integer.compare(o1.getAge(), o2.getAge());
			}
		});
		
		//람다식
		sorted.sort((o1,o2) -> Integer.compare(o1.getAge(), o2.getAge()));
		printEmployee(sorted);
	}
	private static void printEmployee(List<Employee> employees) {
		for(int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i));
		}	
	}
	private static List<Employee> createEmployees() {
		// TODO Auto-generated method stub
		
		return Arrays.asList(
				new Employee("이권형", 28, "개발팀", 45000000, Date.from(LocalDate.of(2022, 3, 13).atStartOfDay(ZoneId.systemDefault()).toInstant())),
				new Employee("이승기", 35, "기획팀", 55000000, Date.from(LocalDate.of(2020, 2, 16).atStartOfDay(ZoneId.systemDefault()).toInstant())),
				new Employee("삼룡이", 32, "마켓팅팀", 45000000, Date.from(LocalDate.of(2019, 4, 21).atStartOfDay(ZoneId.systemDefault()).toInstant())),
				new Employee("김개발", 39, "개발팀", 75000000, Date.from(LocalDate.of(2010, 2, 6).atStartOfDay(ZoneId.systemDefault()).toInstant())),
				new Employee("점박이", 36, "디자인팀", 65000000, Date.from(LocalDate.of(2018, 9, 12).atStartOfDay(ZoneId.systemDefault()).toInstant()))
				);
	}
}
