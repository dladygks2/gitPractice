package ch02;

import java.util.ArrayList;

import ch01.Book;

public class ArrayMainTest {

	public static void main(String[] args) {

		Book book1 = new Book(1, "흐르는 강물처럼", "파울로 코엘료");
		Book book2 = new Book(2, "플러터UI실전", "김근호");
		Book book3 = new Book(3, "무궁화 꽃이 피었습니다.", "김진명");
		Book book4 = new Book(4, "리딩으로 리딩하라", "이지성");
		Book book5 = new Book(5, "사피엔스", "유발 하라리");

		// ArrayList 선언

		// 데이터를 담을 공간 만들기
		// !ArrayList는 배열과 달리 공간의 크기를 먼저 선언할 필요가 없다.
		ArrayList<Book> shoppingCart = new ArrayList<Book>();
		// Ctrl Shift 'O'

		// 추가 방법 1
		// 데이터 추가하기
		shoppingCart.add(book1); // 인덱스 0
		shoppingCart.add(book2); // 인덱스 1
		shoppingCart.add(book3); // 인덱스 2
		System.out.println(shoppingCart.size());
		shoppingCart.add(book4); // 인덱스 3
		System.out.println(shoppingCart.size());
		System.out.println("1) ============");

		// 화면에 출력
		for (int i = 0; i < shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo();
		}
		System.out.println("2) =================");
		
		// 추가 방법 2( 삽입하는 방법, 2번 인덱스에 book5를 넣겠다.)
		shoppingCart.add(2, book5);

		for (Book b : shoppingCart) {
			System.out.println("b.showInfo() : ");
			b.showInfo();
		}
		System.out.println("3) =================");
		// 삭제하는 방법
		shoppingCart.remove(0);
		// foreach

		// clear : 전부 삭제
//		shoppingCart.clear();
		//////
		for (Book book : shoppingCart) {
			book.showInfo();
		}
		System.out.println("4) ------------------------");
		// 수정하기
		shoppingCart.set(2, book1);
		// foreach 문+ Ctrl +space 생성해서 화면에 출력
		// foreach문은 단순 반복실행에 유용
		// 값을 가공해야하면 for문이 유용

		for (Book book : shoppingCart) {
			book.showInfo();
		}

		// C R U D

		// create, read, update, delete

	}
}
