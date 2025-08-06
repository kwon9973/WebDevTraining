package collection;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeManager {
	private HashMap<String, LambdaEmployee> employees;
	
	public EmployeeManager() {
		employees = new HashMap<>();
	}
	
	public boolean addEmployee(LambdaEmployee employee) {
		//containKey() 로 중복 사번 체크
		if(employees.containsKey(employee.getEmployeeId())) {
			System.out.println("이미 존재하는 사번: " + employee.getEmployeeId());
			return false;
		}
		
		employees.put(employee.getEmployeeId(), employee);
		System.out.println("직원이 추가 되었습니다." + employee.getEmployeeId());
		return true;
	}
	
	//직원 삭제 메서드 remove()
	public LambdaEmployee removeEmployee(String employeeId) {
		LambdaEmployee removedEmployee = employees.remove(employeeId);
		
		if(removedEmployee != null) {
			System.out.println("직원 삭제: "+ removedEmployee.getEmployeeId());
		}else {
			System.out.println("해당 사번의 직원 찾기 불가");
		}
		
		return removedEmployee;
	}
	
	//이름으로 직원 검색
	public List<LambdaEmployee> findEmployeeByName(String name){
		List<LambdaEmployee> result = new ArrayList<>();
		
		for(LambdaEmployee employee: employees.values()) {
			if(employee.getName().contains(name)) {
				result.add(employee);
			}
		}
		return result;
	}
	
	//직원 정보 수정 - 새로운 직급, 새로운 급여...
	public boolean updateEmployee(String employeeId, String position, int salary) {
		LambdaEmployee employee = employees.get(employeeId);
		
		if(employee != null) {
			employee.setPosition(position);
			employee.setSalary(salary);
			System.out.println("직원정보가 수정되었습니다."+ employee.getName());
			return true;
		}else {
			System.out.println("수정하려는 직원이 존재하지않습니다."+ employeeId);
			return false;
		}
	}
	
	//모든 직원 정보 출력
	public void showAllEmployees() {
		if(employees.isEmpty()) {
			System.out.println("등록된 직원은 존재하지 않습니다");
			return;
		}
		System.out.println("=== 직원 목록 ===");
		//enterysSet()을 사용하여 키-값 쌍으로 순회하여 사번순 정렬
		employees.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry -> System.out.println(entry.getValue()));
		
		System.out.println("총 직원수" + employees.size() + "명");
	}
	//부서별 직원 조회
	public List<LambdaEmployee> getEmployeeByDepartment(String department) {
		return employees.values().stream() //stream 객체 생성
				.filter(emp -> emp.getDepartment().equals(department)) //부서별 filter
				.collect(Collectors.toList()); //리스트로 수집
	}
	// 전체 직원 수 조회
	public int getTotalEmployeeCount() {
		return employees.size();
	}
	public boolean isEmpty() {
		return employees.isEmpty();
	}
	public void clearAllEmployees() {
		employees.clear();
		System.out.println("모든 직원의 데이터가 삭제되었습니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
}
