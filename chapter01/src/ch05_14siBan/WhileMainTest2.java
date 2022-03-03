package ch05_14siBan;

import java.util.Scanner;

public class WhileMainTest2 {

	public static void main(String[] args) {
		
		// 상수에 담는 값을 스캐너를 사용해서 코드를 수정해 주세요.
		System.out.println("값 입력 : ");
		Scanner scanner = new Scanner(System.in);
		final int LIMIT_VALUE = scanner.nextInt();
		// final int은 상수라는 지정(다른 값으로 넣을수없다), 이름은 대문자
		
		int num = 1;
		int sum = 0;
		
		while(num <= LIMIT_VALUE) {
			
			sum += num;
			num++;
		}
		
		System.out.println("결과값 : " + sum);
	}

}
