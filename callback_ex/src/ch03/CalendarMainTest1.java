package ch03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMainTest1 {

	public static void main(String[] args) {
		
		// 미리 만들어져 있는 클래스를 사용해볼 것이다.
		// Calendar는 날짜 인스턴스
		// 달력이나 시간 계산 등을 사용할 때 많이 사용하는 객체
		
		Calendar calendar = Calendar.getInstance();
		
		// 싱글톤 패턴 : 객체를 여러개 만들어도 하나만 저장됨. 위의 방법을 써야 객체를 생성한것이다
		
		// 현재시간을 천분의 1 단위로 생성
		System.out.println(calendar.getTimeInMillis());
		
		// 보기 불편하기 때문에 형식을 만들어서 사용할 수 있다.
		// formating
		// 날짜로 변환 방법 지정
		
		//DateFormat 도 만들어져 있는 메서드, 날짜 형식을 바꿔주는 애다
		DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		
		// 현재 시간을 내가 정한 format 형식으로 변환
		String date = dateFormat.format(calendar.getTimeInMillis());
		System.out.println(date);
		
		// 강사 네이버 블로그에 Calendar class 에 글 올려놨다함
		
		
		
		
		
	}
}
