package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args)  {

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("output2.txt");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try { // java 9 ���� ����

			byte[] bs = new byte[26];
			byte data = 65; // 'A'�� �ƽ�Ű ��

			// A-Z
			for (int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}

			fos.write(bs); // �迭�ȿ� �ִ� �����͸� �ѹ��� ����ϱ�

		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
