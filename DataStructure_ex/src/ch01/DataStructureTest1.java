package ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



class Student{
	String name;
	int grade;
}


public class DataStructureTest1 {

	public static void main(String[] args) {

		List list0;

		// 순서가 있고 (인덱스), 중복이 가능하다.
		ArrayList<Integer> list = new ArrayList<>();
		// 래퍼 클래스라고 한다....
		
		ArrayList<Student> member = new ArrayList<Student>();
		ArrayList<Integer> num = new ArrayList<>();
		
		// 선언과 동시에 초기화
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3));
		
		// 값 추가 방법
		list.add(3); // index 0
		list.add(null); // index 1
		list.add(1, 10);// index 1번째에 10을 삽입한다. (null은 인덱스 2번으로 밀려난다.)
		
		System.out.println("값 확인 : " + list);
		
		
		// 값 삭제 방법
		list.remove(2);
		
		System.out.println("값 삭제 확인 : " + list);

//		list.clear();
//		System.out.println("clear()후에 값 삭제 확인 : " + list);		
		
		// 값 출력 방법
		System.out.println("값 출력 방법 : " + list.get(1));
		
		for (Integer i : list) {
			System.out.println("for 사용방법 : " + i);
		}
		
		
		//while 사용방법
		// 요소 순회(반복자) 컬렉션 프레임워크에 저장된 요소들을 하나씩 차례로 참조하는 것
		Iterator<Integer> iter = list.iterator();	// 타입 변환
		
		// 다음 요소가 있으면 true, 없으면 false
		while(iter.hasNext()) {
			System.out.println("while 사용방법 : " + iter.next());
			
		}
		
		// 값 검색 방법
		
		// list에 1을 포함하고 있는가???
		System.out.println(list.contains(1));
		// list에 10을 포함하고 있는가???
		System.out.println(list.contains(10));
		
		// contains : 값이 있으면 인덱스의 번호를 반환, 없으면 -1을 반환하는 녀석.
		System.out.println(list.indexOf(10));	//'1번째 인덱스'에 10이 있다는 의미
		System.out.println(list.indexOf(300)); // 값이 없으면 -1을 반환한다.
		System.out.println(list.indexOf(3));	// 3은 '0번째 인덱스'에 있다.
		
		// 문제 1
		ArrayList<String> names = new ArrayList<String>();
		
		// 스캐너 사용
		// 이름값을 입력하면 names 리스트에 저장 기능 while문으로 여러번 저장가능
		// 0을 눌러서 저장 종료기능
		// 화면에 입력한 이름을 뿌려주세요.
		
//		System.out.println("이름값을 입력");
//		Scanner sc = new Scanner(System.in);
//		
//		String name = sc.next();
		
//		while(sc != null ) {
//			names.add(name);
//				
//		}
//		System.out.println(names);
		System.out.println("이름값을 입력");
		Scanner sc = new Scanner(System.in);
		while(true) {
			names.add(sc.next());
			if(names.size() >5) {
				System.out.println(names);
				break;
			}
		}
		
	}
}
