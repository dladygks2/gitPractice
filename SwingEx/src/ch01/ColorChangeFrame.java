package ch01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChangeFrame extends SuperMyFrame implements ActionListener{

	BorderLayout borderLayout;
	
	JPanel panel1;
//	JPanel panel2;
//	JPanel panel3;
//	JPanel panel4;
//	JPanel panel5;
	
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	
	
	
	
	public ColorChangeFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	@Override
	protected void initData() {
	
		super.initData();
		setTitle("이벤트 리스너 연습3");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		borderLayout = new BorderLayout(); // 배경
				
		panel1 = new JPanel();	// 스위치 놓는곳
//		panel2 = new JPanel();
//		panel3 = new JPanel();
//		panel4 = new JPanel();
//		panel5 = new JPanel();
//		
		
		button1 = new JButton("빨간색");
		button2 = new JButton("노란색");
		button3 = new JButton("초록색");
		button4 = new JButton("파란색");
		button5 = new JButton("검은색");
		
		
	}
	
	protected void setInitLayout() {
		setVisible(true);
		super.setInitLayout();
		setLayout(borderLayout);
		
		panel1.setBackground(Color.gray);
		panel1.setLayout(new FlowLayout());
		panel1.setPreferredSize(new Dimension(10, 10));
		add(panel1, BorderLayout.CENTER);
		
		panel1.setBackground(Color.white);
		panel1.setLayout(new FlowLayout());
		panel1.setPreferredSize(new Dimension(10,10));
		add(panel1, BorderLayout.CENTER);
		
		panel1.setBackground(Color.green);
		panel1.setLayout(new FlowLayout());
		panel1.setPreferredSize(new Dimension(10,10));
		add(panel1, BorderLayout.CENTER);
		
		panel1.setBackground(Color.blue);
		panel1.setLayout(new FlowLayout());
		panel1.setPreferredSize(new Dimension(10,10));
		add(panel1, BorderLayout.CENTER);
		
		panel1.setBackground(Color.black);
		panel1.setLayout(new FlowLayout());
		panel1.setPreferredSize(new Dimension(10,10));
		add(panel1, BorderLayout.CENTER);
		
		
				
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
		panel1.add(button5);
		
	}
	
	protected void addEventListener() {
		super.addEventListener();
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		// 1 버튼이 눌러졌으면 panel1 색상이 빨간색으로 변경
		// 2 버튼이 눌러졌으면 panel1 색상이 노란색으로 변경
		JButton clickedButton = (JButton) e.getSource();
		clickedButton.getBackground();
//		System.out.println(clickedButton.getText());
		
		if(clickedButton.getText().equals(button1.getText())) {
			panel1.setBackground(Color.red);
		}else if (clickedButton.getText().equals(button2.getText())) {
			panel1.setBackground(Color.yellow);
			
		}else if (clickedButton.getText().equals(button3.getText())) {
			panel1.setBackground(Color.green);
		}else if (clickedButton.getText().equals(button4.getText())) {
			panel1.setBackground(Color.blue);
		}else if (clickedButton.getText().equals(button5.getText())) {
			panel1.setBackground(Color.black);
		}
	}
	
	public static void main(String[] args) {
		new ColorChangeFrame();
	}
}
