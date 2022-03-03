package ch04;

public class Hero {

	// member variable
	String name;
	int hp;
	
	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
		
	}
	
	public void attack() {
		System.out.println("공격? 이게 맞나?");
	}
	
	public void HeroInfo() {
		System.out.println("영웅의 이름 : " + name + "\n영웅의 체력 : " + hp );
		
	}
	
}
