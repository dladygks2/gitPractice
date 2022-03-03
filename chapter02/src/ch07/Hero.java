package ch07;

public class Hero {

	private String name;
	private int hp;
	private double defense;
	private int level;
	
	// get 메서드
	public String getName() {
		return this.name;	// 그냥 name도 가능
	}
	
	// set 메서드
	public void setName(String name) {
		// 방어적 코드 작성
		if(name == null || name =="" || name.length() < 2) {
			System.out.println("잘못된 입력입니다. \n이름을 다시 작성해주세요.");
		}else {	
			this.name = name;
		}	
	}
	// hp, defense, level
	// get, set 메서드를 만들어 주세요
	// 메서드를 설계하는 코드 작성
	///////////////////////////////////////// get () 메서드는 읽는 역할만	
	public int getHp() {
		return this.hp;
	}
	//////
	public void setHp(int hp) {
		this.hp = hp;
	}
	///////////////////////////////////////////////
	public double getDefense() {
		return this.defense;
	}
	///////
	public void setDefense(double defense) {
		this.defense = defense;
	}
	////////////////////////////////////////////////
	public int getLevel() {
		return this.level;
	}
	///////
	public void setLevel(int level) {
		this.level = level;
	}
	////////////////////////////////////////////////
	// OOP (Object-oriented programming): 객체 지향 프로그래밍
	
	
	
	
	
	// main 함수 
	public static void main(String[] args) {
		
		// Hero 객체 생성 후 getter, setter 메서드를 사용해 보세요.
		Hero hero1 = new Hero();
		
		hero1.setName("Iron Man");
		hero1.getName();
		
		
		
		
		
		
	}
	
}
