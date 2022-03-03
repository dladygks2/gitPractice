package ch08;

import ex01.Unit;

public class Marine extends Unit{

	// 객체는 멤버변수와 메서드를 가질 수 있다.

	// 멤버변수(공격력, 생명력, 실드)

	private int power;
	private int hp;
	private String name;

	// 생성자, 클래스 이름과 똑같이

	public Marine(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 60;

	}

//	// private 변수들을 확인할 수 있도록
//
//	public void showInfo() {
//		System.out.println("======= 정보창 =======");
//		System.out.println("이름 : " + this.name);
//		System.out.println("공격력 : " + this.power);
//		System.out.println("체력 : " + this.hp);
//		System.out.println("======= === ========");
//
//	}

	// private 변수를 건들지 않고 값들을 쓸때만 바꾸도록

//	// 공격 당합니다. 공격당하는 메서드를 만들어라
//	public void beAttacked(int power) {
//		this.hp -= power;
//
//		if (hp <= 0) {
//			System.out.println(this.name + "이 사망하였습니다.");
//			this.hp = 0;
//		}
//	}
//
//	// 1. 마린이 질럿을 공격합니다.
//	public void attackZealot(Zealot zealot) {
//		String targetName = zealot.getName();
//		System.out.println(name + "이(가)" + targetName + "을 공격 합니다.");
//		zealot.beAttacked(this.power);
//	}
//
//	// 2. 마린이 저글링을 공격합니다.
//	public void attackZergling(Zergling zergling) {
//		String targetName = zergling.getName();
//		System.out.println(name + "이(가)" + targetName + "을 공격 합니다.");
//		zergling.beAttacked(this.power);
//	}

//	// getName 메서드 생성
//
//	public String getName() {
//		return name;
//	}

//	// 메서드 오버로딩
//	
//	public void attack(Zealot zealot) {
//		String targetName = zealot.getName();
//		System.out.println(name + "이(가) " + targetName + "을 공격 합니다.");
//		zealot.beAttacked(this.power);
//	}
	
//	public void attack(Zergling zergling) {
//		String targetName = zergling.getName();
//		System.out.println(name + "이(가) " + targetName + "을 공격 합니다.");
//
//		zergling.beAttacked(this.power);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
