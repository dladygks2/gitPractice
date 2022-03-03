package ch03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// 외국인 개발자들이 주로 사용하는 사이트이름이란다. HackerNews

// 콜백 받는 역할
public class HackerNews implements WriteArticle {
	
	private String printDate() {
		// 현재 날짜를 출력하는 기능
		DateFormat formater = new SimpleDateFormat("yyyy.MM.dd");
		return formater.format(Calendar.getInstance()	.getTime());
	}

	@Override
	public void printArticle(String article) {
		System.out.println("*** HackerNews ***");
		System.out.println();
		System.out.println(article);
		System.out.println();
		System.out.println("기사 작성일 : " + printDate());
		
	}
	
	

	
	
}
