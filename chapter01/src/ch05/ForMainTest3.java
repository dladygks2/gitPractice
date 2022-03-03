package ch05;

public class ForMainTest3 {

	public static void main(String[] args) {
		// int num=2;

		// num 값이 반복: 2부터 9까지
		for (int num = 2; num < 10; num++) {
			for (int i = 1; i < 10; i++) {
				System.out.println(num + "*" + i + "=" + (num * i));
			}
			System.out.println();
		}
		// i 값이 반복: 1부터 9까지

	}// end of main

}// end of class
