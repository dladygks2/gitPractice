package ch10;

public class MainTest1 {

	public static void main(String[] args) {

		Zealot zealot1 = new Zealot("질럿1");
		Zealot zealot2 = new Zealot("질럿2");

		Marine marine1 = new Marine("마린1");
		Marine marine2 = new Marine("마린2");

		Zergling zergling1 = new Zergling("저글링1");
		Zergling zergling2 = new Zergling("저글링2");

//		zealot1.showInfo();
//		marine1.showInfo();
//		zergling1.showInfo();

		System.out.println("===== 동작 ====");

		zealot1.attack(marine1);

		zealot1.attack(marine1);
		zealot1.attack(marine1);
		zealot1.attack(marine1);
		zealot1.attack(marine1);
		zealot1.attack(marine1);
		zealot1.attack(marine1);

		marine1.showInfo();

		zealot1.attack(zergling1);
		zealot1.attack(zergling1);
		zealot1.attack(zergling1);

		zergling1.showInfo();

		marine1.attack(zealot1);
		marine1.attack(zealot1);
		marine1.attack(zealot1);
		marine1.attack(zealot1);
		marine1.attack(zealot1);

		zealot1.showInfo();

		// 문제 저글링, 질럿, 마린 체력이 0 또는 이하라면 사망했습니다.
		// 만들어라

		
		//
		System.out.println("-----------------------");
		System.out.println("가나다");
		System.out.println(1);
		System.out.println(0.5);
		System.out.println('A');
		
		// 메서드 오버로딩
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // end of main

} // end of class
