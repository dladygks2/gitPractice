package ch11;

import java.util.Calendar;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 생성자가 private이면 new() 사용이 안된다.
		
		// Company 객체를 생성해 보세요. 5개
		// c1 ,c2 이런데에 주소값이 담긴다.
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		Company c3 = Company.getInstance();
		Company c4 = Company.getInstance();
		Company c5 = Company.getInstance();
		
		// 화면에 주소값을 출력해보세요.
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		//
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		// 싱글톤패턴 사용하는 이유
		// 
		
	}
}
