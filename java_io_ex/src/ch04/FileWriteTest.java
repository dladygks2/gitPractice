package ch04;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {

	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("writer.txt", true)){
			
			fw.write('A');
			
			char buf[] = { 'B', 'C', 'D','E','F','G','H'};
			fw.write(buf);
			
			fw.write(buf, 1,5);
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
