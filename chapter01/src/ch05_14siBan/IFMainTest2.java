package ch05_14siBan;
import java.util.Scanner;
public class IFMainTest2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int point = sc.nextInt();
		char result='Z';
		 //if else if else
		//1. 100점보다 작으면서 90점보다 크거나 같으면 A
		//2. 90점보다 작으면서 80점보다 크거나 같으면 B
		//3. 80점보다 작으면서 70점보다 크거나 같으면 B
		//4. 위 조건 해당사항 없으면 F 
		//5. "당신의 학점은 ? 입니다." 출력

		if(point<=100 && point>90) {
			result='A';
		}else if(point<=90 && point>80) {
			result='B';
		}else if(point<=80 && point>70) {
			result='C';
		}else if(point<70 && point>=0) {
			result='F';
		}else {
			System.out.println("잘못된 입력입니다");
		}
		if(result!='Z') {
		System.out.println("당신의 학점은 "+result+" 입니다");
		}
	}

}
