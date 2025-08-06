package model;

public class Librarian extends Person{
	
	private String department;
	private String posiition;
	
	
	public Librarian(String id, String name, String phone, String dep, String pos) {
		super(id, name, phone);
		this.department = dep;
		this.posiition = pos;
	}
	public String getDepartment() {return department;}
	public String getPosiition() {return posiition;}
	@Override
	public String getRole() {
		return "사서";
	}
	@Override
	public String toString() {
		return super.toString() + String.format(" 부서: %s | 직책: %s ", department, posiition);
	}
}
