package ch05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {

		long millisecond = 0;

		// ��� ��Ʈ���� ���� ���� FileInputStream ���
		try (FileInputStream fis = new FileInputStream("a.zip")) {

			// copy ���

			FileOutputStream fos = new FileOutputStream("copy.zip");

			// ��ǲ ��Ʈ���� �����ϴ� ���� ��Ʈ�� ����غ���
			BufferedInputStream bis = new BufferedInputStream(fis);

			// �ƿ�ǲ ��Ʈ���� �����ϴ� ���� ��Ʈ��
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			millisecond = System.currentTimeMillis();

			int i;
//			// ��� ��Ʈ�� ����ڵ�
//			while( (i = fis.read()) != -1) {
//				fos.write(i);
//			}

			// ���� ��Ʈ��
			while ((i = bis.read()) != -1) {
				bos.write(i);

//				fos.write(i);
			}

			millisecond = System.currentTimeMillis() - millisecond;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("������ �����ϴµ��� " + millisecond + "ms �ҿ� �Ǿ����ϴ�.");

	}
}
