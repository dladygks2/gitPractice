package ch03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMainTest1 {

	public static void main(String[] args) {
		
		// �̸� ������� �ִ� Ŭ������ ����غ� ���̴�.
		// Calendar�� ��¥ �ν��Ͻ�
		// �޷��̳� �ð� ��� ���� ����� �� ���� ����ϴ� ��ü
		
		Calendar calendar = Calendar.getInstance();
		
		// �̱��� ���� : ��ü�� ������ ���� �ϳ��� �����. ���� ����� ��� ��ü�� �����Ѱ��̴�
		
		// ����ð��� õ���� 1 ������ ����
		System.out.println(calendar.getTimeInMillis());
		
		// ���� �����ϱ� ������ ������ ���� ����� �� �ִ�.
		// formating
		// ��¥�� ��ȯ ��� ����
		
		//DateFormat �� ������� �ִ� �޼���, ��¥ ������ �ٲ��ִ� �ִ�
		DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		
		// ���� �ð��� ���� ���� format �������� ��ȯ
		String date = dateFormat.format(calendar.getTimeInMillis());
		System.out.println(date);
		
		// ���� ���̹� ��α׿� Calendar class �� �� �÷�������
		
		
		
		
		
	}
}
