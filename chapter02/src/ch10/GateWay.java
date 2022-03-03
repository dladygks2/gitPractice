package ch10;

public class GateWay {

	// 인스턴스끼리 공유하는 변수를 생성하고자 한다면 static 변수를 생성
	public static int zealotCount = 0;

	// 멤버변수 설계
	private int gateWayId;
	private String name;

	// 생성자 설계
	public GateWay(int id) {
		this.gateWayId = id;
		name = "게이트 웨이";
	}

	// 질럿 생산하기
	public Zealot createZealot() {
		System.out.println("질럿을 생산합니다.");
		zealotCount++;
		return new Zealot("질럿");

	}

}
