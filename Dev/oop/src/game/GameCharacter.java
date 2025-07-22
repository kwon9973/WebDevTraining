package game;

public class GameCharacter {
	String name;
	int level;
	int health;
	int MaxHealth;
	boolean status;
	
	
	
	
	
	
	
	public GameCharacter() {
		this.name = "TestUser01";
		this.level = 1;
		this.health = 100;
		this.MaxHealth = 100;
		this.status = true;
		System.out.println("케릭터"+ this.name + "이(가) 생성되었습니다!");
	}
	
	
	
	
	
	
	public void damaged(int damage) {
		this.health -= damage;
		System.out.println(this.name + "이(가) "+ damage +" 데미지를 받았습니다.");
		System.out.println("현재 체력 "+ this.health + " / " + this.MaxHealth);
	}
	
	
	public void heal(int heal) {
		this.health += heal;
		System.out.println(this.name + "이(가) "+ heal +" 힐링를 받았습니다.");
		System.out.println("현재 체력 "+ this.health + " / " + this.MaxHealth);
	}
	
	
	
	public void levelUp() {
		this.level += 1;
		this.MaxHealth += 20;
		this.health = this.MaxHealth;
		System.out.println("현재 레밸: "+ this.level);
		System.out.println("최대 체력이 "+ 20 + " 올랐습니다.");
		System.out.println("체력이 완전히 회복되었습니다 "+ this.health + " / "+ this.MaxHealth);
	}
	
	
	
	
	
	
	
	public String toString() {
		String str;
		str = "===케릭터 정보===\n이름: " + this.name + "\n레벨: " + this.level + "\n체력: " + this.health + "/" + this.MaxHealth +"\n상태: " + (this.status == true ? "생존":"사망"); 
		
		return str;
	}
	
}
