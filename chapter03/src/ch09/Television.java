package ch09;

public class Television extends HomeAppliances 
                          	implements RemoteController {

//	int width;
//	int height;
//	String color;
//	
	
	@Override
	public void turnOn() {

		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

}
