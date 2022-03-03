package ch02;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame8CloneCoading2 extends JFrame {
// 패널을 하나 더 만들어서 밑에 버튼2개 만들고, 
// 좌우든 위아래든 기능 하도록 : 키보드말고 눌러서 기능하도록

	BufferedImage backgroundImage1;
	BufferedImage imageIcon1;
	
	MyImagePanel imagePanel;
	MyImagePanel imagePanel2;

	int xPoint = 200;
	int yPoint = 200;

	// JPanel에서 JButton을 추가해서 쓸 수 있구나
	
	public MyFrame8CloneCoading2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("이미지 백그라운드 연습3");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundImage1 = ImageIO.read(new File("Gam.jpg"));
			imageIcon1 = ImageIO.read(new File("ship.jpg"));
		} catch (Exception e) {
			System.out.println("파일이 없습니다.");
			System.exit(0);
		}
		// 생성자 
		imagePanel = new MyImagePanel();
	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setResizable(false);
		this.add(imagePanel);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {

				int keyCode = e.getKeyCode();

				if (keyCode == KeyEvent.VK_UP) {
					yPoint = (yPoint < -10) ? 0 : yPoint - 10;
				} else if (keyCode == KeyEvent.VK_DOWN) {
					yPoint = (yPoint > 390) ? 390 : yPoint + 10;
				} else if (keyCode == KeyEvent.VK_LEFT) {
					xPoint = (xPoint < -18) ? -18 : xPoint - 10;
				} else if (keyCode == KeyEvent.VK_RIGHT) {
					xPoint = (xPoint > 425) ? 425 : xPoint + 10;
				}

				repaint();

			}

		});
		this.addMouseListener(new MyMouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				xPoint = e.getX();
				yPoint = e.getY();
				
				repaint();
			}
		});
	}

	private class MyImagePanel extends JPanel {

		protected void paintComponent(Graphics g) {

			super.paintComponent(g);
			g.drawImage(backgroundImage1, 0, 0, 500, 500, null);
			g.drawImage(imageIcon1, xPoint, yPoint, 50, 50, null);

		}
	}

	// 추상 클래스는 new 키워드를 사용할 수 없다. --> 클래스에 타입으로만 존재한다.
		// 어댑터 패턴이란? 추상메서드를 다 구현하고(일반 메서드로 다 변환) {비워놓음}
		// 내부 클래스 생성
		private class MyMouseListener extends MouseAdapter {

			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				System.out.println("---------------");
				System.out.println("x 좌표값 : " + x);
				System.out.println("y 좌표값 : " + y);
			}
		}
	
	
	
	public static void main(String[] args) {

		new MyFrame8CloneCoading2();
	}

}
