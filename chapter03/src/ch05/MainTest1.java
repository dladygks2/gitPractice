package ch05;

public class MainTest1 {

	public static void main(String[] args) {

		Banana banana = new Banana();
		Peach peach = new Peach();

		banana.showInfo();
		System.out.println("------------------------------");
		peach.showInfo();

		// 자바에서 다형성이란

		/*
		 * 하나의 코드가 여러 자료형으로 구현되어 실행되는 것 같은 코드에서 여러 다른 실행 결과가 나옴 정보은닉, 상속과 더불어 객체지향
		 * 프로그래밍의 가장 큰 특징 중 하나임 다형성을 잘 활용하면 유연하고 확장성있고, 유지보수가 편리한 프로그램을 만들 수 있음.
		 */
		// 부모 타입 인스턴스 변수에 자식 객체를 생성할 수 있다.
		Fruits fruit = new Banana(); // 업 캐스팅

		// 부모 자식 관계에서 사용 가능하다.

		// 그 역은 성립하지 않는다.
		// 즉 자식 인스턴스 변수(참조변수)에 부모 인스턴스를
		// 생성 시킬 수 없다.

//		 Banana banana2 = new Fruit();

	}

}
