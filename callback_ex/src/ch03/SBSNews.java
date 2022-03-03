package ch03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SBSNews implements WriteArticle {

	private String printDate() {
		// 현재 날짜를 출력하는 기능
		DateFormat formater = new SimpleDateFormat("yyyy.MM.dd");
		return formater.format(Calendar.getInstance()	.getTime());
	
	}
	
	@Override
	public void printArticle(String article) {
		// TODO Auto-generated method stub
		System.out.println("MBC 문화방송 MBC");
		System.out.println();
		System.out.println(article);
		System.out.println();
		System.out.println("기사 작성일 : " + printDate());
	}

	
	
}
