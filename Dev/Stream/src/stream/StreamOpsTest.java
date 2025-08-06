package stream;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.*;

public class StreamOpsTest {
	public static void main(String[] args) {
		
		List <Employee> employees = Arrays.asList(
				new Employee("이개발", 28, "개발팀", 3500),
				new Employee("신사임당", 29, "마켓팅팀", 2500),
				new Employee("이순신", 30, "디자인팀", 1500),
				new Employee("유스케", 31, "기획팀", 7500),
				new Employee("사스케", 40, "개발팀", 6500),
				new Employee("메스컴", 12, "개발팀", 4500)
		);
		
		
		System.out.println("filter(): 조건 필터링");
		//개발팀만 출력하세요
		//employees.stream().filter(emp -> emp.getDepartment().equals("개발팀")).forEach(System.out.println());
		
		System.out.println();
		System.out.println("map(): 모든 직원 출력");
		//모든직원
		employees.stream().map(emp -> emp.getName()).forEach(System.out::println);
		
		System.out.println();
		System.out.println("map() and filter(): 개발팀 직원만 출력");
		//개발팀 이름만
		employees.stream().filter(emp -> emp.getDepartment().equals("개발팀")).forEach(n -> System.out.println(n.getName()));
		//or
		System.out.println();
		employees.stream().filter(emp -> emp.getDepartment().equals("개발팀")).map(Employee::getName).forEach(n -> System.out.println(n));
		
		System.out.println("=== map()으로 모든 직원의 연봉을 월급으로 변환해서 출력 ===");
		//
		employees.stream().map(emp -> emp.getSalary() / 12).forEach(n -> System.out.println(n));
		
		
		
	}
}
