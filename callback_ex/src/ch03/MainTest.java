package ch03;

public class MainTest {

	public static void main(String[] args) {

		// ��Ŀ���� ��ü����
		HackerNews hackerNews = new HackerNews();
		KBSNews kbsNews = new KBSNews();
		// ��� �ۼ�
		MyArticle article = new MyArticle(hackerNews, kbsNews);
		article.complete();

	}
}
