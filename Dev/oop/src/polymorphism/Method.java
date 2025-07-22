package polymorphism;

public class Method {
	Method(){
		System.out.println("Parent");
	}
	public void display(String str) {
		System.out.println("your input at the parent class is: " + str + "the parent is called");
	}
}
