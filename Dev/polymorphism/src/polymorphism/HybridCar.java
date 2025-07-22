package polymorphism;

public class HybridCar extends Car{
	
	public HybridCar(String name) {
		super(name);
	}
	
	@Override
	public void startEngine() {
		System.out.println(name + "하이브리드 시동 모드로 부드럽게 시동겁니다");
		
	}
	@Override
	public void drive() {
		System.out.println(name + "저속에서는 전기로, 고속에서는 가솔린으로");
		
	}
	@Override
	public void stop() {
		System.out.println(name + "정지합니다");
	}
}
