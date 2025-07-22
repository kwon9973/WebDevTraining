package realOop;

public class OOPMain {
	
	public static void main(String[] args) {

		OOP musicPlayer = new OOP();
		
		System.out.println("음악 플레이어를 시작합니다.");
		musicPlayer.turnOn();
		
		musicPlayer.volumUp();
		System.out.println("볼륨 :" + musicPlayer.volume);

		musicPlayer.volumDown();
		System.out.println("볼륨 :" + musicPlayer.volume);
		
		System.out.println("음악 플레이어 상태확인");
		System.out.println("음악 플레이어 "+ (musicPlayer.isOn == false ? "꺼짐" : "켜짐") + " 볼륨: " + musicPlayer.volume);
		
		musicPlayer.turnOff();
		System.out.println("플레이어 상태: " + (musicPlayer.isOn == false ? "꺼짐" : "켜짐"));
	}
	
}
