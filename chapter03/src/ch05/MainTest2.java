package ch05;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {

		final int BANANA = 1;
		final int PEACH = 2;

		// 스캐너
		// 사용자가 입력한 1,2 받으면 해당하는 객체의 정보를
		// 화면에 출력

		System.out.println("바나나 : 1, 복숭아 : 2");

		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();

		Fruits fruits;

		// 만약 1번이라면 바나나 객체를 생성하고
		// showInfo() 메서드를 호출해라.
		// 아니라면 복숭아 객체를 생성해서
		// showInfo() 호출

		if (userInput == BANANA) {
			fruits = new Banana(); // 업캐스팅에 대해서 보자
		} else {
			fruits = new Peach();
		}
		
		fruits.showInfo();
		// 사용자가 입력한 값에 따라서 인스턴스를 쉽게 바꿔줄 수 있다.
		
	}
}
