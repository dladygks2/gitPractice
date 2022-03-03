package ex01;

import java.io.IOException;

public class PracticeSystemInTest1 {

	public static void main(String[] args) {
		
		System.out.println("알파벳 하나를 쓰고, 엔터를 누르세요.");
		
		int i;
		
		try {
			i= System.in.read();
			
			System.out.println("입력받은 값 : " + i);
			
			System.out.println((char)i);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
