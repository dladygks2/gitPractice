package ch04_14siBan;

public class IfMainTest {
	// main function
	public static void main(String[] args) {

		// 제어문 if
		// 주어진 조건에 따라서 실행이 이루어지도록 구현한다.
		// 만약...이라면

		boolean flag = false; // 변수의 선언과 초기화를 동시에

		// if 문 단독 사용방법

		if (flag) {
			System.out.println("조건식 결과가 true이면 실행된다. false는 실행안되고 넘어감");
		} // end of if

		// if else 문 : true인지 flase인지 둘 중에 하나는 수행한다.
		if (flag) {
			System.out.println("true이면 실행");

		} else {
			System.out.println("flase이면 실행");

		}

		// if else if else 문 : 마지막에 else가 필요하면 써준다.
		int point = 40;

		if (point >= 90) {
			System.out.println("A 학점입니다.");
		} else if (point >= 80) {
			System.out.println("B 학점입니다.");
		} else if (point >= 70) {
			System.out.println("C 학점입니다.");
		} else if (point >= 60) {
			System.out.println("D 학점입니다.");
		} else {
			System.out.println("F 학점입니다.");
		}

	} // end of main

} // end of class
