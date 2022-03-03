package ch09;

import java.util.Iterator;

public class MainTest {

	public static void main(String[] args) {

		Television television = new Television();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot toyRobot = new ToyRobot();

//		television.turnOn();
//		television.turnOff();
//		System.out.println("-----------------");
//		
//		refrigerator.turnOn();
//		refrigerator.turnOff();
//		System.out.println("------------------");

		// 다형성 = 배(신체, 선박, 과일 등 다양한 형태로 생각할 수 있다.)

		RemoteController[] remote = new RemoteController[3];
		remote[0] = television;
		remote[1] = refrigerator;
		remote[2] = toyRobot;

//		// 확장 for문 turnOn() 호출
//		for (RemoteController remoteController : remote) {
//			remoteController.turnOn();
//		}
//		// 
//		System.out.println("---------------------------");
//		
//		for (RemoteController remoteController : remote) {
//			remoteController.turnOff();
//		}

		System.out.println("-------------");
		// instanceOf 연산자 사용해보기
		// for + Ctrl + 'use index'
		for (int i = 0; i < remote.length; i++) {

			if (remote[i] instanceof ToyRobot) {
				System.out.println("장난감 객체입니다.");

				double a = 1.0;
				int b = (int) a;
				String name = ((ToyRobot) remote[i]).name;

				System.out.println(name);
				// 도전 과제
				// remote[i] < ---- 로 접근해서 name 출력하라.
				// 화면에 name 멤버 변수를 출력해주세요.

			}
			// if Tv
			if (remote[i] instanceof Television) {
				System.out.println("텔레비전 객체입니다.");
			}

			// if Refrigerator
			if (remote[i] instanceof Refrigerator) {
				System.out.println("냉장고 객체입니다.");
			}

		}
		
		/*
		 * 인터페이스의 장점
		 * 
		 * 표준화가 가능하다.
		 * 서로 관계없는 클래스들에게 관계를 맺어줄 수 있다.
		 * 클래스 간에 결합도를 낮춰서 유연한 코드를 설계할 수 있다.
		 */
		/*
		 * 정리))))
		 * 객체지향 패러다임 핵심
		 * 
		 * 1) 객체와 객체 간에 상호 협력해서 코드를 설계해 나간다(버스, 질럿, )
		 * 2) 객체와 객체 간에 관계를 정의하여 코드를 설계해 나간다.
		 * (상속, 포함관계, 추상클래스, 인터페이스) 
		 * 다형성(클래스를 다양한 형태로 바라볼 수 있다.)
		 */
	}		// end of main
}
