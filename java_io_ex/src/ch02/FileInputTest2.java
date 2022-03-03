package ch02;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest2 {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("assets/input1.txt");
			int i;
			// while 문으로 처리를 합니다.
			// fis.read() ---> 글자가 더이상 없으면 return 값은 -1
			
			while( ( i = fis.read()) != -1) {
				System.out.println((char)i);
				
			}
			
			
			
		} catch (IOException e) {
///////////////////////////////////////////////////중요 ) 닫아주는거			
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
