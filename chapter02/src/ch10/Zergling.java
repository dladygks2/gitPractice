package ch10;

public class Zergling {

	// 객체는 멤버변수와 메서드를 가질 수 있다.

	// 멤버변수(공격력, 생명력, 실드)
	private int power;
	private int hp;
	private String name;

	// 생성자, 클래스 이름과 똑같이

	public Zergling(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 40;
	}

	// private 변수들을 확인할 수 있도록

	public void showInfo() {
		System.out.println("======= 정보창 ========");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
		System.out.println("======= === ========");
	}

//private 변수를 건들지 않고 값들을 쓸때만 바꾸도록

	// 공격 당합니다. 공격당하는 메서드를 만들어라
	public void beAttacked(int power) {
		this.hp -= power;

		if (hp <= 0) {
			System.out.println(this.name + "이 사망하였습니다.");
			this.hp = 0;
		}
	}
//
//	// 1. 저글링이 질럿을 공격합니다.
//	public void attackZealot(Zealot zealot) {
//		String targetName = zealot.getName();
//		System.out.println(name + "이(가)" + targetName + "을 공격 합니다.");
//		zealot.beAttacked(this.power);
//
////		if (zealot.dead()){
////			
////		}
//	}
//
//	// 2. 저글링이 마린을 공격합니다.
//	public void attackMarine(Marine marine) {
//		String targetName = marine.getName();
//		System.out.println(name + "이(가)" + targetName + "을 공격 합니다.");
//		marine.beAttacked(this.power);
//	}
//	// getName 메서드 생성

	public String getName() {
		return name;
	}

	// 매서드 오버로딩을 사용해서 코딩을 수정.
	public void attack(Marine marine) {
		String targetName = marine.getName();
		System.out.println(name + "이(가) " + targetName + "을 공격 합니다.");
		marine.beAttacked(this.power);
	}
	
	public void attack(Zealot zealot) {
		String targetName = zealot.getName();
		System.out.println(name + "이(가) " + targetName + "을 공격 합니다.");

		zealot.beAttacked(this.power);
	}
	
}