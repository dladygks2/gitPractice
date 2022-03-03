package ch02;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame7 extends JFrame implements KeyListener {

	// 앞에 대문자이니 참조타입, 클래스타입이다. .연산자 가능
	JTextArea area;

	public MyFrame7() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("키 이벤트 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();
	}

	private void setInitLayout() {
		setVisible(true);
		this.add(area);
	}

	private void addEventListener() {
//		area.addKeyListener(this);
		area.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});

	}

	// 문자를 눌렀을 때 호출, 문자키에만 반응한다. 화살표 이런거 반응 안한다.
	@Override
	public void keyTyped(KeyEvent e) {

//		System.out.println("keyTyped : " + e.getID());

	}

	// 키보드를 눌렀을 때 호출, 모든 키보드에 반응한다.
	@Override
	public void keyPressed(KeyEvent e) {
//		System.out.println("keyPressed : " + e.getID());
//		e.getKeyCode();
//		System.out.println(e.getKeyCode());
//		area.setText(e.getKeyCode() + "");
//		area.append(e.getKeyCode() + "\n");
		// 위쪽 방향키 눌러짐(38)
		// 아래쪽 방향키 눌러짐(40)
		// 왼쪽 방향키 눌러짐(37)
		// 오른쪽 방향키 눌러짐(39)

		// 프로그램에서 정해진 상수가 있다. 16진수로 표현되긴했지만

		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			area.append("왼쪽 눌러짐\n");
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			area.append("위쪽 눌러짐\n");
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			area.append("오른쪽 입력됨\n");
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			area.append("아래쪽 입력됨\n");
		}

	}

	// 키보드를 뗐을 때 호출, 모든 키보드에 반응한다.
	@Override
	public void keyReleased(KeyEvent e) {
//		System.out.println("keyReleased : " + e.getID());

	}

}
