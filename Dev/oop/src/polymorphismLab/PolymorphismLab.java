package polymorphismLab;

import java.time.temporal.Temporal;

//직원 관리(급여) 시스템

class Employee{
	protected String name; //직원 이름
	protected int baseSalary; // 기본 급여
	
	public Employee(String name, int baseSalary) {
		this.name = name;
		this.baseSalary =baseSalary;
	}
	public int calculateSalary() {
		return baseSalary;
	}
	public void printEmployeeInfo() {
		System.out.println("직원명 : "+ name);
		System.out.println("기본급여 : "+ baseSalary + "만원");
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "===급여 계산서===\n직원명: "+ name + "\n기본급여: " + baseSalary +"\n보너스: ";
	}
}


class FullTimeEmployee extends Employee{
	private int bonus;
	
	public FullTimeEmployee(String name, int baseSalary, int bonus) {
		super(name, baseSalary);
		this.bonus = bonus;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	@Override
	public int calculateSalary() {
		return baseSalary + bonus;
	}
	@Override
	public void printEmployeeInfo() {
		super.printEmployeeInfo();
		System.out.println("보너스: " + bonus + "만원");
		System.out.println("총급여: " + calculateSalary() + "만원");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "===급여 계산서===\n직원명: "+ name + "\n기본급여: " + baseSalary +"\n보너스: "+ bonus;
	}
	
}


class PartTimeEmployee extends Employee{
	private int workHours;
	private int hourlyRate;
	
	public PartTimeEmployee(String name, int workHourse, int hourlyRate) {
		super(name, 0);
		this.workHours = workHourse;
		this.hourlyRate = hourlyRate;
	}
	@Override
	public int calculateSalary() {
		return hourlyRate * workHours;
	}
	@Override
	public void printEmployeeInfo() {
		super.printEmployeeInfo();
		System.out.println("시간당 급여: " + hourlyRate + "만원");
		System.out.println("근문 시간: "+ workHours+ "시간");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}


class FreeLancer extends Employee{
	private int project;
	private int projectRate;
	
	public FreeLancer(String name, int project, int projectRate) {
		super(name, 0);
		this.project = project;
		this.projectRate = projectRate;
	}
	@Override
	public int calculateSalary() {
		return this.project * this.projectRate;
	}
	@Override
	public void printEmployeeInfo() {
		super.printEmployeeInfo();
		System.out.println("프로젝트 개수: "+ project);
		System.out.println("건당: " + projectRate + "만원");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}


class intern extends Employee{
	private int period;
	
	intern(String name, int period){
		super(name, 0);
		this.period = period;
	}
	@Override
	public int calculateSalary() {
		return (int)(period * (0.8 * super.baseSalary));
	}
	@Override
	public void printEmployeeInfo() {
		super.printEmployeeInfo();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}


class contractEmployee extends Employee{
	private int contractMonths;
	private  int contractBonus;
	
	public contractEmployee(String name, int contractMonths, int contractBonus) {
		super(name, 0);
		this.contractMonths = contractMonths;
		this.contractBonus = contractBonus;
	}
	@Override
	public int calculateSalary() {
		return (super.calculateSalary() + (contractMonths >= 12 ? contractBonus : 0));
	}
	@Override
	public void printEmployeeInfo() {
		super.printEmployeeInfo();
		System.out.println("계약 월: "+ contractMonths + " - 12개월이상 계약직 완료시 보너스 지급");
		System.out.println("계약 보너스: "+ contractBonus + "만원");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}


public class PolymorphismLab {
	public static void main(String[] args) {
		System.out.println("다형성 연습  - 직원 관리 시스템");
		System.out.println("=======================================");
		
		Employee emp1 = new FullTimeEmployee("이순신", 400, 100);
		Employee emp2 = new PartTimeEmployee("신사임당", 10, 80);
		Employee emp3 = new FreeLancer("박프리", 200, 3);
		Employee emp4 = new FullTimeEmployee("최매니저", 600, 200);
		
		Employee[] employees = {emp1, emp2, emp3, emp4};
		
		int total = 0;
		for(int i = 0; i < employees.length; i++) {
			total += employees[i].calculateSalary();
			System.out.println(employees[i].calculateSalary());
		}
		
		System.out.println("급여 통계");
		System.out.println("=========================");
		System.out.println("총직원수: " + employees.length + "명");
		System.out.println("총 급여 지출:" + total + "만원");
	}
}






















