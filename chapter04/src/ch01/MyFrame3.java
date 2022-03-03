package ch01;

import javax.swing.JFrame;

public class MyFrame3 extends JFrame {

	public MyFrame3() {
		setTitle("첫번째 GUI 프로그래밍 작성");
		setSize(400, 400);
		//화면 종료시 콘솔창도 정지
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame3();
	}
}
