package realOop;

public class OOP {

	int volume = 0;
	boolean isOn = false;
	
	OOP(){
		int volume = 0;
		boolean isOn = false;
	}
	
	void volumUp(){
		this.volume++;
	}
	void volumDown(){
		this.volume--;
	}
	void turnOn() {
		isOn = true;
	}
	void turnOff() {
		isOn = false;
	}
	
}
