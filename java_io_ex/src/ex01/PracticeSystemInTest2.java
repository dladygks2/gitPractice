package ex01;

import java.io.IOException;
import java.io.InputStreamReader;

public class PracticeSystemInTest2 {

	public static void main(String[] args) {
		
		System.out.println("���ĺ� ���� ���� ���� Enter�� ��������.");
		
		int i;
		
		try {
			
			InputStreamReader irs = new InputStreamReader(System.in);
			
			while((i = irs.read()) != '\n') {
				System.out.println((char)i);
			}
		} catch ( IOException e) {
			e.printStackTrace();
		}
		
	}
}
