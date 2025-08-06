package model;

public abstract class Person {
	protected String id;
	protected String name;
	protected String phone;
	
	public Person(String id, String name, String phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getPhone() {return phone;}
	public void setPhone(String phone) {this.phone = phone;}
	
	//역할 => 회원, 서사
	public abstract String getRole();
	
	@Override
	public String toString() {
		return String.format("ID: %s | 이름: %s | 전화번호: %s | 역할: %s", id, name, phone, getRole());
	}
}
