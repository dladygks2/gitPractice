package ch05;

import java.util.Scanner;

public class WhileMainTest2 {
	//코드의 시작점
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	//1부터10까지 더해서 그 결과값을 출력		
	System.out.println("숫자입력");
	int num = 1;
	int sum = 0;
	final int LIMIT_VALUE = scanner.nextInt();
	
	while(num<=LIMIT_VALUE) {
		sum=sum+num;
		num++;
	}
	System.out.println("결과값:"+sum);
		
	}//end of main

}//end of class
