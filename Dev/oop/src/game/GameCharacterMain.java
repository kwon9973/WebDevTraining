package game;

public class GameCharacterMain {
	public static void main(String[] args) {
		System.out.println("===게임 케릭터 테스트===");
		
		GameCharacter ch = new GameCharacter();
		
		ch.damaged(30);
		ch.heal(20);
		ch.levelUp();
		
		System.out.println(ch);
	}
}
