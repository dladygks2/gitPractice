package ch03;
import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {

		//삼항 연산자
		//조건식 ? 결과1:결과2
	int num1 = (5<3) ? 10 : 20;
	System.out.println(num1);
	System.out.println("--------------------------------");
	// JDK가 만들어준 도구를 이용해보자
	int max;
	System.out.println("입력 받은 두 숫자 중 큰 숫자를 출력");
	Scanner scanner=new Scanner(System.in);
	System.out.println("입력1: ");
	int x =  scanner.nextInt();
	
	System.out.println("입력2: ");
	int y = scanner.nextInt();
	
	max = (x>y)?x:y;
	System.out.println("큰 숫자는: "+max+" 입니다");
	
	}

}
