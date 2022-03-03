package ch07;

// 추상 클래스. 하나라도 abstract가 선언되면 걔는 추상 클래스이고, new() 안된다.
public abstract class Computer {

	// 추상 메서드: abstract를 적어줘야 함. {}가 없으면 추상메서드, 몸체가 없는 메서드
	public abstract void display(); // <- 메서드의 선언부. signature

	public abstract void typing();

	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

}
