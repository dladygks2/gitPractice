package ch02;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainActivityEx1 extends JFrame implements CallBackBtn2{

		double count;
		JLabel label;
		
	public MainActivityEx1() {
		count =0;
		label = new JLabel(count +"");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		setLayout(new FlowLayout());
		add(label);
		
	}
	
	
	@Override
	public void clickedAddBtn() {
		System.out.println("���ϱ�");
		count ++;
		label.setText(count + "");
		
	}

	@Override
	public void clickedMinusBtn() {
		System.out.println("����");
		count --;
		label.setText(count +"");
		
	}

	@Override
	public void passValue(double value) {
		System.out.println("value �� ���޹��� : " + value);
		label.setText(value +"");
		
	}

}
