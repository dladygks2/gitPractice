package ch09;

public interface RemoteController {
	
	/* 
	 * 인터페이스 : 구현된 것이 아무것도 없는 밑그림만 있는 기본 설계도
	 * 인터페이스는 멤버변수, 일반 메서드를 가질 수 없고, 오직 추상 메서드와 상수만을
	 * 멤버로 가질 수 있다.
	 * 
	 * 추상 클래스보다 추상화가 더 높다.
	 * 인터페이스는 표준, 약속, 규칙 입니다.
	 */
	
	// 사용방법 
	// class 대신 interface라는 키워드를 사용한다.
	// class와 같이 접근제어지시자(public or default 같은 애들을 말함)를 사용가능

	/* 
	 * 제약사항
	 * 
	 * 모든 멤버 변수는 public static final 이어야한다.
	 */
	public static final int SERIAL_NUMBER  = 1000; // 상수
	
	// 모든 메서드는 추상 클래스 이어야하고, 
	// public abstract 키워드를 생략할 수도 있다.
	
	public abstract void turnOn();
	void turnOff();
	
	
	
}
