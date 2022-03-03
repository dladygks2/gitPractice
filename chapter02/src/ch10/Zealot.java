package ch10;

public class Zealot {

	// 객체는 멤버변수와 메서드를 가질 수 있다.

	// 멤버변수(공격력, 생명력, 실드)

	private int power;
	private int hp;
	private String name;

	// 생성자, 클래스 이름과 똑같이

	public Zealot(String name) {
		this.name = name;
		this.power = 10;
		this.hp = 100;

	}

	// private 변수들을 확인할 수 있도록

	public void showInfo() {
		System.out.println("======= 정보창 ========");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
		System.out.println("======= === ========");
	}

	// 공격 당합니다. 공격당하는 메서드를 만들어라
	public void beAttacked(int power) {
		this.hp -= power;

		if (this.hp <= 0) {
			System.out.println(this.name + "이 사망하였습니다.");
			this.hp = 0;
		}
	}
	// getName 메서드 생성

	public String getName() {
		return name;
	}

	

//	// 사망합니다.
//	public void dead() {
//		if(this.hp ==0) {
//			System.out.println("질럿을 죽였습니다.");
//		}
//	}

	// 동작하는 부분을 만들것임. 메서드부분
	// 공격합니다.-> 질럿이 마린을 공격하는 동작
	// 다른 객체와 상호 작용 -> 메서드로 참조 변수 전달
	// (밑의 1과 2는 같은 거다. 적은 코딩내용은 달라도 기능은 같다.)
	
//	// 1.
//	public void attackMarine(Marine marine) {
//		String targetName = marine.getName();
//		System.out.println(name + "이(가)" + targetName + "을 공격 합니다.");
//		marine.beAttacked(this.power);
//
//	}
//
//	public void attackZergling(Zergling zergling) {
//		String targetName = zergling.getName();
//		System.out.println(name + "이(가)" + targetName + "을 공격 합니다.");
//
//		zergling.beAttacked(this.power);
//	}
//
//	
	// 메서드 오버로딩을 사용해 보자. 메서드가 attack 이라도 ()안의 
	// 매개변수가 다르면 사용가능
	// OOP의 중요한 개념
	
	// 2.	
	public void attack(Marine marine) {
		String targetName = marine.getName();
		System.out.println(name + "이(가) " + targetName + "을 공격 합니다.");
		marine.beAttacked(this.power);
	}
	
	public void attack(Zergling zergling) {
		String targetName = zergling.getName();
		System.out.println(name + "이(가) " + targetName + "을 공격 합니다.");

		zergling.beAttacked(this.power);
	}
	
	
}
