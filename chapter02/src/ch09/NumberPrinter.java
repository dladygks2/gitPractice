package ch09;

public class NumberPrinter {

	private int id;
	// private int waitNumber =1;
	
	// static 이므로 각 객체들이 모두 공유한다.
	private static int waitNumber = 1;

	public NumberPrinter(int id) {
		this.id = id;

	}

	// 번호표를 찍어 주세요.
	public void printWaitNumber() {
		System.out.println(id + " 번 기기의 대기 순번 : " + waitNumber);
		waitNumber++;

	}
	/*
	 * static 은 어디서든 공유가 가능하다.
	 * 
	 * 코드 영역
	 * 
	 * 데이터 영역 안에 있는 변수 = static 변수 클래스 안에 변수 
	 * = 멤버변수 스택 안에 변수 = 지역변수
	 * 
	 * 메인 함수 = stack이라는 메모리 구조에 담긴다.
	 * main 안에 자신만의 공간을 할당받는다.
	 * 
	 * 메인에서 new()로 생성하게 되면 heap영역에 저장됨.
	 * 
	 * 
	 */

}
