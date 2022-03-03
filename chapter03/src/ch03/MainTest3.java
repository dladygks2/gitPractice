package ch03;

public class MainTest3 {

	public static void main(String[] args) {
		
		// 자동차를 생성해서 showInfo() 메서드를 호출해 주세요.
		
		Car car1 = new Car("쏘나타", 35_000_000);
		
		car1.showInfo();
		
		// car1 엔진의 정보를 출력해주세요.
		// 차와 엔진은 서로 상속의 구조가 아니다...
		
		car1.engine.showInfo();
		
	}
	
}
