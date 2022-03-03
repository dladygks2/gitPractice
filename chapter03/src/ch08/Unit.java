package ch08;


// new 키워드를 사용해서 메모리에 올릴 수 없다. 타입으로만 사용한다.
public abstract class Unit {

	/*
	 *  세 종족의 공통적인 부분들을 묶어서 상속으로
	 */
	
	// private은 만들어진 메인 함수 내에서 사용 
	// protected 는 같은 클래스 내에서는 사용 가능
	protected int power;
	protected int hp;
	protected String name;
	
	
	
// private 변수들을 확인할 수 있도록
	public void showInfo() {
		System.out.println("======= 정보창 =======");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
		System.out.println("======= === ========");

	}
// 공격 당합니다. 공격당하는 메서드를 만들어라
	public void beAttacked(int power) {
		this.hp -= power;
			if (hp <= 0) {
			System.out.println(this.name + "이 사망하였습니다.");
			this.hp = 0;
		}
	}	
	
	// getName 메서드 생성

	public String getName() {
		return name;
	}
	// 매서드 오버로딩을 사용해서 코딩을 수정.
		public void attack(Unit marine) {
			String targetName = marine.getName();
			System.out.println(name + "이(가) " + targetName + "을 공격 합니다.");
			marine.beAttacked(this.power);
		}
	
	
	
}
