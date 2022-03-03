package ch05;

import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) throws InterruptedException {

		//예약어 Break
		//중간에 멈추는 Break		
		System.out.println("나눌숫자입력");

		Scanner scanner=new Scanner(System.in);
		int count=0;
		final int MULTIPLY;
		MULTIPLY=scanner.nextInt();
		System.out.println("나누어질숫자입력");
		int k;
		k=scanner.nextInt();
		for(int i=1;i<k;i++) {
//			Thread.sleep(1000);
			if ((i%MULTIPLY)==0) { //나머지 연산자 사용 해 보세요. 나머지 값이 0이면 종료
				System.out.println("i값:"+i);
				count=count+1;
			}
		
		}
		System.out.println(MULTIPLY+"의 배수는"+count+"개 입니다");
	}
	
}
