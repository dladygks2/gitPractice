package ch01;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {

		System.out.println("알파벳 하나를 쓰고, 엔터를 누르세요.");

		int i;

		// io 익셉션??
		try {
			// input stream
			i = System.in.read(); // 여러분의 입력을 기다리는 명령어

			// 출력
			System.out.println("입력받은 값 : " + i);
			// 문제 1
			// 화면에 i의 값을 A로 출력 해주세요.

			System.out.println((char) i);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
