package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame4 extends JFrame {

	
	private JButton[] buttons = new JButton[6];
	
//	private JButton button1;
//	private JButton button2;
//	private JButton button3;
//	private JButton button4;
//	private JButton button5;
//	private JButton button6;

	//
//	ArrayList<JButton> buttons = new ArrayList<JButton>();
	
	
	// 생성자
	public MyFrame4() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("FLow Layout 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new FlowLayout(FlowLayout.LEFT, 1, 10));

//		buttons[0] = new JButton("1 번쨰 버튼");
//		buttons[1] = new JButton("2 번쨰 버튼");
//		buttons[2] = new JButton("3 번쨰 버튼");
//		buttons[3] = new JButton("4 번쨰 버튼");
//		buttons[4] = new JButton("5 번쨰 버튼");
//		buttons[5] = new JButton("6 번쨰 버튼");

		for( int i =0 ;  i < buttons.length ; i++) {
			buttons[i] = new JButton( i + " 번째 버튼");
		}
		
	}// end of initData

	private void setInitLayout() {
		setVisible(true);
//		add(buttons[0]);
//		add(buttons[1]);
//		add(buttons[2]);
//		add(buttons[3]);
//		add(buttons[4]);
//		add(buttons[5]);

		for( int j =0 ; j < buttons.length; j++) {
			add(buttons[j]);
		}
	}// end of setInitLayout

}

public class FlowLay {

	public static void main(String[] args) {

		new MyFrame4();

	}
}
