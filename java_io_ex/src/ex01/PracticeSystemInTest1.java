package ex01;

import java.io.IOException;

public class PracticeSystemInTest1 {

	public static void main(String[] args) {
		
		System.out.println("���ĺ� �ϳ��� ����, ���͸� ��������.");
		
		int i;
		
		try {
			i= System.in.read();
			
			System.out.println("�Է¹��� �� : " + i);
			
			System.out.println((char)i);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
