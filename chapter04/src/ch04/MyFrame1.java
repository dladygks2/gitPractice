package ch04;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel{
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
//		g.drawString("안녕하세요.", 10, 20);
//		g.drawLine(20, 30, 100, 100);	// 선을 긋다. 방식 : (시작점 x좌표, 시작점 y좌표, 종료점 x좌표, 종료점 y좌표);
		
	//	g.drawRect(100, 100, 150, 150);	// ( 왼쪽 위 모서리 x좌표, 왼쪽 위 모서리 y좌표, 가로길이, 세로길이)
		
		g.drawLine(150, 150, 250, 50 );		// 지붕
		g.drawLine(250, 50, 350, 150 );
		g.drawRect(150, 150, 200, 200);	// 집 몸체
		////
		g.drawRect(180, 180, 40,	40);		// 2층 작은 창문
		
		g.drawLine(220, 200, 180, 200);
		g.drawLine(200, 220, 200, 180);
		////
		g.drawRect(150, 275, 100, 75);		// 주차장 사각형
		g.drawLine(150, 285, 250, 285);
		g.drawLine(150, 295, 250, 295);
		g.drawLine(150, 305, 250, 305);
		g.drawLine(150, 315, 250, 315);
		g.drawLine(150, 325, 250, 325);
		g.drawLine(150, 335, 250, 335);
		////
		g.drawRect(280, 270, 50, 80);
		
//		g.drawString("(넣고싶은 문자)",x좌표, y좌표);		글자쓰기
		
		
	}
	
}


public class MyFrame1 extends JFrame {

	MyPanel myPanel;
	
	// 생성자
	public MyFrame1() {
		initData();
		setInitLayout();
	}
	// 메서드 2개 만들어 주세요
	private void initData() {
		setTitle("java 2D Test");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myPanel = new MyPanel();
	}
	
	private void setInitLayout() {
		setVisible(true);
		add(myPanel);
		
	}
	
	
	// 내부 클래스 , static(정적 내부 클래스) static 없으면 그냥 인스턴스 또는 내부 클래스라고함
	static class MyPanel extends JPanel{
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			
//			g.drawString("안녕하세요.", 10, 20);
//			g.drawLine(20, 30, 100, 100);	// 선을 긋다. 방식 : (시작점 x좌표, 시작점 y좌표, 종료점 x좌표, 종료점 y좌표);
			
		//	g.drawRect(100, 100, 150, 150);	// ( 왼쪽 위 모서리 x좌표, 왼쪽 위 모서리 y좌표, 가로길이, 세로길이)
			
			g.drawLine(150, 150, 250, 50 );		// 지붕
			g.drawLine(250, 50, 350, 150 );
			g.drawRect(150, 150, 200, 200);	// 집 몸체
			////
			g.drawRect(180, 180, 40,	40);		// 2층 작은 창문
			
			g.drawLine(220, 200, 180, 200);
			g.drawLine(200, 220, 200, 180);
			////
			g.drawRect(150, 275, 100, 75);		// 주차장 사각형
			g.drawLine(150, 285, 250, 285);
			g.drawLine(150, 295, 250, 295);
			g.drawLine(150, 305, 250, 305);
			g.drawLine(150, 315, 250, 315);
			g.drawLine(150, 325, 250, 325);
			g.drawLine(150, 335, 250, 335);
			////
			g.drawRect(280, 270, 50, 80);
			
//			g.drawString("(넣고싶은 문자)",x좌표, y좌표);		글자쓰기
			
	
		}
	// 메인함수 작성
	public static void main(String[] args) {
		
		new MyFrame1();
		
	}
	
	}
}