package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PracticeFileInputStreamTest3 {

	public static void main(String[] args) {
		
		try( FileInputStream fis = new FileInputStream("assets/input1.txt")){
			
			int i;
			
			while( ( i = fis.read()) != -1) {
				System.out.println((char) i );
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
