package ch10;

public class GateWayMainTest {

	public static void main(String[] args) {

		// 인스턴스끼리 공유하는 변수를 생성하고자 한다면 static 변수를 생성

		GateWay gateway1 = new GateWay(1);
		GateWay gateway2 = new GateWay(2);
		GateWay gateway3 = new GateWay(3);

		Zealot zealot1 = gateway1.createZealot();
		Zealot zealot2 = gateway1.createZealot();
		Zealot zealot3 = gateway1.createZealot();
		Zealot zealot4 = gateway1.createZealot();
		Zealot zealot5 = gateway1.createZealot();
		Zealot zealot6 = gateway1.createZealot();
		Zealot zealot7 = gateway1.createZealot();
		Zealot zealot8 = gateway1.createZealot();
		Zealot zealot9 = gateway1.createZealot();

		gateway2.createZealot();
		gateway2.createZealot();
		gateway2.createZealot();
		gateway2.createZealot();
		gateway2.createZealot();

		gateway3.createZealot();
		gateway3.createZealot();
		gateway3.createZealot();
		gateway3.createZealot();
		gateway3.createZealot();
		gateway3.createZealot();

		zealot1.showInfo();

		// static 변수는 인스턴스들이 공유할 수 있는 변수이다.
		// --> 객체를 생성하지 않고도 클래스 이름으로 접근이 가능하다.
		// ex) 태양(객체가 생성되기 전에 메모리에 올라가 있다.)

		System.out.println("생산한 질럿의 수 : " + GateWay.zealotCount);
	}

}
