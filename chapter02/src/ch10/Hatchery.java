package ch10;

public class Hatchery {

	// 1. static 변수 사용 : 생산한 저글링의 수를 셀 수 있도록
	// static 변수는 인스턴스들이 공유할 수 있는 변수이다.
	// --> 객체를 생성하지 않고도 클래스 이름으로 접근이 가능하다.
	// ex) 태양(객체가 생성되기 전에 메모리에 올라가 있다.)
	public static int zerglingCount = 0;

	// 2. 멤버변수 설계
	private String hatcheryId;
	private String name;

	// 3. 생성자 설계
	public Hatchery(String id) {
		this.hatcheryId = id;
		name = "해처리";
	}

	// 4. 저글링을 생산하는 메서드를 만들어 주세요.
	public Zergling createZergling() {
		System.out.println("저글링을 생산합니다.");
		zerglingCount++;
		return new Zergling("저글링" + zerglingCount);
	}

}
