package ch05;

import java.util.Scanner;

public class DoWhileTest2 {

	public static void main(String[] args) {

//		1. 스캐너를 만들어 주세요
//		2. 1부터 사용자가 입력 한 값을 덧셈 연산해서 결과값 출력
//		단, do - while 문을 사용해서 만들어 주세요.
//		사용자가 입력 한 값이 0이면 프로그램 종료

		Scanner scanner=new Scanner(System.in);
		int i;
		int sum = 0;
		final int END = 0;
		
		do {
			System.out.println("숫자입력");
			i=scanner.nextInt();
			sum=sum+i;
		}
		while(i!=END);
		System.out.println("연산결과"+sum+"입니다");
	}
	

}
