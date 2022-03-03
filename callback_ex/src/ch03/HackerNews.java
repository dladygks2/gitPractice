package ch03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// �ܱ��� �����ڵ��� �ַ� ����ϴ� ����Ʈ�̸��̶���. HackerNews

// �ݹ� �޴� ����
public class HackerNews implements WriteArticle {
	
	private String printDate() {
		// ���� ��¥�� ����ϴ� ���
		DateFormat formater = new SimpleDateFormat("yyyy.MM.dd");
		return formater.format(Calendar.getInstance()	.getTime());
	}

	@Override
	public void printArticle(String article) {
		System.out.println("*** HackerNews ***");
		System.out.println();
		System.out.println(article);
		System.out.println();
		System.out.println("��� �ۼ��� : " + printDate());
		
	}
	
	

	
	
}
