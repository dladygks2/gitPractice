package ch01;

public class ArrayMainTest3 {

	public static void main(String[] args) {

		Book book1 = new Book(1, "흐르는 강물처럼", "파울로 코엘료");
		Book book2 = new Book(2, "플러터UI실전", "김근호");
		Book book3 = new Book(3, "무궁화 꽃이 피었습니다.", "김진명");
		Book book4 = new Book(4, "리딩으로 리딩하라", "이지성");
		Book book5 = new Book(5, "사피엔스", "유발 하라리");

		// 문제
		// 1. 배열을 이용해서 shoppingCart 변수에 객체를 담아 봅시다.
		Book[] shoppingCart = new Book[5];

		// 2. 사고싶은 책을 장바구니에 담아 봅시다. 3개만
		shoppingCart[0] = book1;
		shoppingCart[1] = book2;
		shoppingCart[2] = book3;

		// 3. 장바구니에 담은 정보를 화면에 출력하세요.
		// 오류 수정 해라

//		for (int i = 0; i < shoppingCart.length; i++) {
//			if (shoppingCart[i] != null)
//
//				// if(shoppingCart[i] == null)
//				// continue;
//
//				shoppingCart[i].showInfo();
//		}

		// 4.
		shoppingCart[0] = book5;

		// 5. 인덱스 1번째에 book3을 추가해주세요
		// 인덱스 0, 1 = book3, 1-->2이 되고, 2-->3, 3-->4

		shoppingCart[0] = book2;
		shoppingCart[1] = book3;
		shoppingCart[2] = book4;
		shoppingCart[3] = book5;

		// 배열에 추가를 하려면 직접 인덱스 연산을 해서 처리해야한다.
//		for (int i = 0; i < shoppingCart.length; i++) {
//			if (shoppingCart[i] != null)
//
//				// if(shoppingCart[i] == null)
//				// continue;
//
//				shoppingCart[i].showInfo();
//		}
		
		// 삭제 -> 배열에 담겨 있는 값을 제거하려면
		// 3번째 인덱스를 지워보세요
		shoppingCart[3] = null;

		for (int i = 0; i < shoppingCart.length; i++) {
			if (shoppingCart[i] != null)

				// if(shoppingCart[i] == null)
				// continue;

				shoppingCart[i].showInfo();
		}
	}
	
	/*
	 * ArrayList
	 * 
	 * java.util 패키지에서 제공되는 ArrayList

 */
}
