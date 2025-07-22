package constructor2;

public class Constructor {
	String name;
	int age;
	String major;
	
	Constructor(){
		this.name = "";
		this.age = 0;
		this.major = "";
	}
	Constructor(String name){
		this.name = name;
		this.age = 0;
		this.major = "";
	}
	Constructor(String name, int age){
		this.name = name;
		this.age = age;
		this.major = "";
	}
	Constructor(String name, int age, String major){
		this.name = name;
		this.age = age;
		this.major = major;
	}
	public String toString() {
		return "이름: " + this.name+ ", 나이: "+ this.age + ", 전공: " + this.major;
	}
	
}
