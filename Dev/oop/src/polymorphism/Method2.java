package polymorphism;

public class Method2 extends Method{
	Method2(){
		super();
		System.out.println("child");
	}
	public void display(String str) {
		System.out.println("your new input: " + str + " and child is called");
	}
}
