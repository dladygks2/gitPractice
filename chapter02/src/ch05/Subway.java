package ch05;

public class Subway {

	int subwayHoseon;
	int passengerNumber;
	int money;

	public Subway(int subwayHoseon) {
		this.subwayHoseon = subwayHoseon;
	}

	public  void take(int money) {
		this.money += money;
		passengerNumber++;
	}

	public void showInfo() {
		System.out.println(
				"지하철 " + subwayHoseon + "호선이고,\n " 
		+ "현재 " + passengerNumber + " 명이고\n " 
		+ "현재 수익금은 " + money + "입니다.");
	}

}
// Ctrl + Shift + 'F' = 라인정렬