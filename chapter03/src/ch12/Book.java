package ch12;

public class Book {

	private int bookId;
	private String title;
	private String author;

	public Book() {

	}

	// alt + shift + s key => Generate Constructor using Fields 
	public Book(int bookId, String title, String author) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}

	// toString 메서드 재정의 해보기 / 빈 줄에 ctrl + space key에서 override 찾아서
	@Override
	public String toString() {

		return "[ 책 번호 : " + bookId + " ]\n" + "[ 책 제목 : " + title + " ]\n" + "[ 책 저자 : " + author + "]";
	}
	// 책이름, 작가까지 같아야 true
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Book) {
			Book tempBook = (Book) obj; // Object인 obj를 Book으로 다운 캐스팅
			// 논리적 설계
			if (this.title == tempBook.title && this.author== tempBook.author && this.bookId == tempBook.bookId) {
				return true;
			} else {
				return false;
			}

		}

		return false;
	}

	public static void main(String[] args) {

		Book book1 = new Book(1, "데미안", "홍길동");

		// toString()을 정의하지 않고, 출력하면 주소값이 나온다.
		System.out.println(book1);
		System.out.println(book1.toString());

	}
}
