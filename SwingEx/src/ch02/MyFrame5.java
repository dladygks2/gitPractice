package ch02;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame5 extends JFrame {

	JLabel label;
	
	public MyFrame5() {
		initData();
		setInitLayout();
		addEventListener();
		
	}
	private void initData() {
		setTitle("마우스 이벤트");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		label = new JLabel("hello java ~ ");
		label.setSize(150, 50);
	}
	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		add(label);
		// label 뜬거 잡고 움직이게 하는 방법??
		label.setLocation(12, 40);		// label 초기위치를 잡아주는거
		
	}
	private void addEventListener() {
				
		// 마우스 이벤트를 받아내기
		// 익명구현객체 : 괄호안에 바로 new MoseListener()를 넣는것을 말함
		this.addMouseListener(new MouseListener() {
		
			// 마우스가 떨어졌을 때 실행되는 메서드
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("클릭버튼 뗄 때?");
			}
			
			// 마우스가 눌러졌을 때 실행되는 메서드
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("버튼 누를 때?");
				label.setLocation(e.getX(), e.getY());
			}
			
			// 마우스 커서가 나갔을 때 실행되는 메서드
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("화면에서 커서가 나갈때");
			}
			
			// 마우스 커서가 들어왔을 때 실행되는 메서드
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("화면으로 커서가 들어올 때");
			}
			
			// 마우스가 클릭되었을 때 실행되는 메서드
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("버튼 누르고 떼는 행동이 완료될 때????");
				System.out.println( "x 좌표값 : " + e.getX());
				System.out.println( "y 좌표값 : " + e.getY());
				label.setLocation(e.getX(), e.getY());
			}
		});
		
		
	}	// end of addEventListener
	
	
	// main function
	public static void main(String[] args) {
		new MyFrame5();
		
	}
	
	
	
}
