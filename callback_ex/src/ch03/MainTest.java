package ch03;

public class MainTest {

	public static void main(String[] args) {

		// 해커뉴스 객체생성
		HackerNews hackerNews = new HackerNews();
		KBSNews kbsNews = new KBSNews();
		// 기사 작성
		MyArticle article = new MyArticle(hackerNews, kbsNews);
		article.complete();

	}
}
