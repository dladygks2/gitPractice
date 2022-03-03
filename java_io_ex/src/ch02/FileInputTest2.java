package ch02;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest2 {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("assets/input1.txt");
			int i;
			// while ������ ó���� �մϴ�.
			// fis.read() ---> ���ڰ� ���̻� ������ return ���� -1
			
			while( ( i = fis.read()) != -1) {
				System.out.println((char)i);
				
			}
			
			
			
		} catch (IOException e) {
///////////////////////////////////////////////////�߿� ) �ݾ��ִ°�			
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
