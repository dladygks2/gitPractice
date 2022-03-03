package ch09;

// 인터페이스를 구현하는 방법 
public class Refrigerator extends HomeAppliances 
								implements RemoteController, SoundEffect {
// 상속은 단일 상속만 가능 하나의 클래스만 상속받음
	
	
//	int width;			// 공통 부분 상속가능
//	int height;
//	String color;
	
	@Override
	public void turnOn() {
		System.out.println("냉장고를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("냉장고를 끕니다.");

	}

	@Override
	public void notification() {
		System.out.println("띠링띠링~");
	}

}
