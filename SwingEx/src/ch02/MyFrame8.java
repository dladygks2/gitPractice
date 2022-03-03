package ch02;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame8 extends JFrame {

	BufferedImage backgroundImage;
	BufferedImage imageIcon1;
	
	MyImagePanel imagepanel;
	
	int xPoint = 200;
	int yPoint = 200;

	public MyFrame8() {
		initData();
		setInitLayout();
		addEventListener();

	}

	private void initData() {
		setTitle("이미지 백그라운드 연습2");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon1 = ImageIO.read(new File("among1.png"));
//			imageIcon1 = ImageIO.read(new File("among2.png"));

		} catch (Exception e) {
			System.err.println("파일이 없습니다."); // 빨간 글씨로 뜬다
			System.exit(0); // 알아서 종료시키는 명령어
		}

		imagepanel = new MyImagePanel();

	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setResizable(false); // 창의 크기조절 가능한가 불가능한가
		this.add(imagepanel);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {

				// 삼항연산자로 사용해서 코드를 작성해주세요.
				// 그리고 switch문으로 바꿔주세요(21년11월04일 숙제내줌)
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_UP) {
//					yPoint -= 10;

					// yPoint = (조건식)? "결과1" : "결과2"
					yPoint = (yPoint < -10) ? 0 : yPoint - 10;

//					if( yPoint <-10) {
//						yPoint = -10;
//					}

				} else if (keyCode == KeyEvent.VK_DOWN) {
					yPoint += 10;
					if (yPoint > 390) {
						yPoint = 390;
					}
				} else if (keyCode == KeyEvent.VK_LEFT) {
					xPoint -= 10;
					if (xPoint < -18) {
						xPoint = -18;
					}
				} else if (keyCode == KeyEvent.VK_RIGHT) {
					xPoint += 10;
					if (xPoint > 425) {
						xPoint = 425;
					}
				}

				repaint();// 다시 그림을 그리게 하는 메서드

			} // end of keyPressed

		});
	}

	// 내부 클래스 생성
	private class MyImagePanel extends JPanel {

		// 색칠하는 기능
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon1, xPoint, yPoint, 80, 80, null);

		}
	}

	private void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println("-----");
		System.out.println("x 좌표값 : " + x);
		System.out.println("y 좌표값 : " + y);
	}

	public static void main(String[] args) {
		
		new MyFrame8();
	}
	
} // end of class

