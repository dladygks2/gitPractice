package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {

//		try {
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
// 		위에랑 비교///
		// trycatch resource // 자바 jdk9 버전 이후부터 사용가능// close 하지 않더라도 알아서 닫아준다.
		try (FileInputStream fis = new FileInputStream("assets/input1.txt")) {
			
			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
