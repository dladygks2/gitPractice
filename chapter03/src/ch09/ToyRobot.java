package ch09;

public class ToyRobot implements RemoteController, SoundEffect {
// implements 는 개수 제한 없음. 상속은 1대1이지만, 인터페이스는 그런거 없다
	String name;
	
	public ToyRobot() {
		this.name = "건담로봇";
	}
	
	@Override
	public void turnOn() {
		System.out.println("장난감 로봇을 켭니다.");


	}

	@Override
	public void turnOff() {
		System.out.println("장난감 로봇을 끕니다.");

	}

	@Override
	public void notification() {
		System.out.println("두두두 쾅");
		
	}

	
	
}
