package ch05;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {

		// 예약어 continue
		// 무시하고 진행하는 continue;
		Scanner scanner = new Scanner(System.in);
		System.out.println("배수를 입력하세요");
		int num;
		int count = 0;
		final int MULTIPLE = scanner.nextInt();

		System.out.println("나누려는 숫자 입력하세요");
		final int MAX = scanner.nextInt();

		for (num = 1; num <= MAX; num++) {// 3의 배수이면 출력 하지 마시오

			if (num % MULTIPLE == 0) {
				count++;

				continue;

			}

		} // end of for
		System.out.println("배수는" + count + "개 입니다");

	}// end of main

}// end of class
