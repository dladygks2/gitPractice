package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest4 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("assets/input1.txt")){
			
			byte[] bs = new byte[30];
			int i;
			// read() �ȿ� �� ���� ��ŭ ���� ���̴�.
			while((i = fis.read(bs)) != -1) {
				
				for(int j =0 ; j < i ; j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(" : " + i + "����Ʈ ����");
				// ���� ����Ʈ�� x�� ��������.
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		
	}
}
