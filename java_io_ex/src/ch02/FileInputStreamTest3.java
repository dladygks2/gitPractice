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
// 		������ ��///
		// trycatch resource // �ڹ� jdk9 ���� ���ĺ��� ��밡��// close ���� �ʴ��� �˾Ƽ� �ݾ��ش�.
		try (FileInputStream fis = new FileInputStream("assets/input1.txt")) {
			
			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (FileNotFoundException e) {
			System.out.println("������ �����ϴ�.");
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
