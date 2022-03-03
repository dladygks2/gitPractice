package ch01;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame{

	BorderLayout borderLayout;
	JButton[] buttons = new JButton[5];
	String[] titles = {"북","센터","남","동","서"};
	
	// 1) directions라는 배열을 선언과 동시에 초기화
	String[] directions = {BorderLayout.NORTH,
			BorderLayout.CENTER,
			BorderLayout.SOUTH,
			BorderLayout.EAST,
			BorderLayout.WEST};
	
	
	public BorderLayoutEx() {
		initData();
		setInitLayout();
		
	}
	
	private void initData() {
		super.setTitle("BorderLayout 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		// set은 JFrame의 메서드이다. super 가능
		
		borderLayout  = new BorderLayout();
		
		
		for(int i =0 ; i<buttons.length;i++) {
			buttons[i] = new JButton(titles[i]);
			// 0 <- (북), 1<- (센터), ....
		}
	}
	
	private void setInitLayout() {
		setVisible(true);
		// 2) for 문으로 변경해 주세요.
//		super.add(buttons[0], BorderLayout.NORTH);
//		super.add(buttons[1], BorderLayout.CENTER);
//		super.add(buttons[2], BorderLayout.SOUTH);
//		super.add(buttons[3], BorderLayout.EAST);
//		super.add(buttons[4], BorderLayout.WEST);
		
		for (int i = 0; i < 5 ; i++) {
			// add JFrame
			super.add(buttons[i], directions[i]);
		}
		
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
	
	
}
