package ch02;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {

		// 파일을 읽어들이는 스트림
		FileInputStream fis = null;

		// 예외처리
		try {
			fis = new FileInputStream("assets/input.txt");	// 경로
//			int first = fis.read();
//			System.out.println("first : " + first);
			
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			
			
		} catch (IOException e) {

			e.printStackTrace();
			System.out.println("파일이 없습니다.");

		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}

		System.out.println("프로그램이 종료되지 않았습니다.");
		
	}
}
