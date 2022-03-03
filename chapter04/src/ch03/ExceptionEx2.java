package ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionEx2 {

	public static void main(String[] args) {

		FileInputStream fis;

		// try-catch문 예시

		try {
			fis = new FileInputStream("a.txt");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (Exception e) { // Exception : 예외처리 중에서 최상위 클래스
			System.out.println("예외처리");
			return; // 심지어 리턴문(실행의 제어권을 반납한다는 뜻)이 있어도 finally는 실행된다. 
		} finally {
			// try 문이 실행되면 반드시 실행 됨
			System.out.println("반드시 실행됩니다.");
		}

		System.out.println("비정상 종료가 되지 않았습니다.");

//		fis = new FileInputStream("a.txt");

	}
}
