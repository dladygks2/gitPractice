package ch02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SubActivityEx1 extends JFrame implements ActionListener {

	JButton btnAdd;
	JButton btnMinus;
	JButton btnPassValue;
	
	CallBackBtn2 callbackBtnAction;
	
	
	public SubActivityEx1(CallBackBtn2 callbackBtnAction) {
		this.callbackBtnAction = callbackBtnAction;
		
		
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnAdd = new JButton("더하기 버튼");
		btnMinus = new JButton("빼기 버튼");
		btnPassValue = new JButton("값전달 버튼");
		
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 30,30));
		
		add(btnAdd);
		add(btnMinus);
		add(btnPassValue);
		
		btnAdd.addActionListener(this);
		btnMinus.addActionListener(this);
		btnPassValue.addActionListener(this);
		
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		JButton targetBtn = (JButton)e.getSource();
		
		if(targetBtn == btnAdd) {
			callbackBtnAction.clickedAddBtn();
		}else if(targetBtn == btnMinus) {
			callbackBtnAction.clickedMinusBtn();
		}else if(targetBtn == btnPassValue) {
			callbackBtnAction.passValue(100);
		}
		
	}

}
