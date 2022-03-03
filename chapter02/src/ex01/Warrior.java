package ex01;

import java.util.Random;

public class Warrior {
 
	// 멤버 변수
	// hp, power, name
	String  WarriorName;
	String  WarriorJob;
	String  WarriorGuild;
	String  WarriorTitle;
	
	int hp = 20;
	int mp = 5 ;
	
	int pwr = 20;
	int dex = 10;
	int mag = 5;
	int def = 10;
	
	// WarriorSkill
	public void attack() {
		System.out.println("기본 공격");
		System.out.println(pwr*2 + "의 데미지를 주었습니다.");
		System.out.println("---------------------------");
		
	}
	public void skill1() {
		System.out.println("강하게 내려치기");
		System.out.println(pwr*10 + "의 데미지를 주었습니다.");
		mp -= 3;
		System.out.println("---------------------------");
		
	}
	public void skill2() {
		System.out.println("연속 휘두르기");
		System.out.println(pwr*13 + "의 데미지를 주었습니다.");
		mp -= 4;
		System.out.println("---------------------------");
		
	}
	
	public void smallPortionRed() {
		System.out.println("체력이 15 올랐습니다.");
		hp += 15;
		System.out.println("---------------------------");
		
	}
	public void smallPortionBlue() {
		System.out.println("마나가 15 올랐습니다.");
		mp += 15;
		System.out.println("---------------------------");
		
	}
	
	
	
	public Warrior(String name, String job, String guild, String title) {
		WarriorName = name;
		WarriorJob = job;
		WarriorGuild = guild;
		WarriorTitle = title;
			
	}
	
	public void warriorInfo() {
		System.out.println("====정보창====");
		System.out.println("이름 : " + WarriorName);
		System.out.println("직업 : " + WarriorJob);
		System.out.println("길드 : " + WarriorGuild);
		System.out.println("칭호 : " + WarriorTitle);
		System.out.println("====능력치====");
		System.out.println("체력 : " + pwr);
		System.out.println("민첩 : " + dex);
		System.out.println("마력 : " + mag);
		System.out.println("방어력 : " + def);
		
	
	}
	public static void main(String[] args) {
		returnRandom();
		
	}
	
	public static void returnRandom() {
		
		Random random = new Random();
		int number = random.nextInt(21);
		System.out.println(number);
	}
	
	// 생성자도 만들어 주세요 new() 를 사용해서 캐릭터 생성해라는 의미구나....
	
	// 메서드
	
	// 마법사를 공격한다.
	// 상태창을 꾸며서 볼 수 있는 기능을 만들어 주세요.
	
}
