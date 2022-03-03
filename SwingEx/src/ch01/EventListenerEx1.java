package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame1 extends JFrame implements ActionListener {

	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;


	public MyFrame1() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("이벤트 리스너 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("이벤트 버튼1 ");
		button2 = new JButton("이벤트 버튼2 ");
		button3 = new JButton("이벤트 버튼3 ");
		button4 = new JButton("이벤트 버튼4 ");
		button5 = new JButton("이벤트 버튼5 ");

	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
	}

	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
	}

	// 시스템 콜백
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("시스템 콜백 실행");
//		System.out.println("버튼이 클릭 되었습니다.");
//		System.out.println(e.toString());
		JButton clickedButton = (JButton) e.getSource();
		System.out.println(clickedButton.getText());

		// 문자열을 비교해서
		// 1번 버튼이 클릭 되었습니다.
		// 2번 버튼이 클릭 되었습니다.

		if (clickedButton.getText().equals(button1.getText())) {
			System.out.println("1 버튼이 클릭되었습니다.");
		} else if (clickedButton.getText().equals(button2.getText())) {
			System.out.println("2 버튼이 클릭되었습니다.");
		} else if (clickedButton.getText().equals(button3.getText())) {
			System.out.println("3 버튼이 클릭되었습니다.");
		} else if (clickedButton.getText().equals(button4.getText())) {
			System.out.println("4 버튼이 클릭되었습니다.");
		} else {
			System.out.println("5 버튼이 클릭되었습니다.");
		}

//		if(button.equals(button)) {
//			System.out.println("1번 버튼이 클릭 되었습니다.");
//		}else if (button.equals(button2)){
//			System.out.println("2번 버튼이 클릭 되었습니다.");
//		}		
	}

}

public class EventListenerEx1 {

	public static void main(String[] args) {

		new MyFrame1();

	}
}
