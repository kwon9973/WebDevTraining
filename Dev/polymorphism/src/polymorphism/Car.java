package polymorphism;

public abstract class Car {
	
	protected String name;
	protected int fuel = 100; //초기 연료양
	
	
	Car(){
		this.name = "이순신";
	}
	Car(String name){
		this.name = name;
	}
	public abstract void startEngine();
	public abstract void drive();
	public abstract void stop();
	public String getName() {
		return  name;
	}
	protected void consumeFuel(int amount) {
		fuel -= amount;
		if(fuel < 0) {
			fuel = 0;
		}
		System.out.println(name + " 현재 연료양" + fuel);
	}
	protected void reFuel(int amount) {
		fuel += amount;
		if(fuel > 100) {
			fuel = 100;
		}
		System.out.println(name + " 현재 연료양" + fuel);
	}
	
}
