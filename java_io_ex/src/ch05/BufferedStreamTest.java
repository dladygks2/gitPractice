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

		// 기반 스트림을 읽을 때는 FileInputStream 사용
		try (FileInputStream fis = new FileInputStream("a.zip")) {

			// copy 기능

			FileOutputStream fos = new FileOutputStream("copy.zip");

			// 인풋 스트림을 보조하는 보조 스트림 사용해보기
			BufferedInputStream bis = new BufferedInputStream(fis);

			// 아웃풋 스트림을 보조하는 보조 스트림
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			millisecond = System.currentTimeMillis();

			int i;
//			// 기반 스트림 사용코드
//			while( (i = fis.read()) != -1) {
//				fos.write(i);
//			}

			// 보조 스트림
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

		System.out.println("파일을 복사하는데에 " + millisecond + "ms 소요 되었습니다.");

	}
}
