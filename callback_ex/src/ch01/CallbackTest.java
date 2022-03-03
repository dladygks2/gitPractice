package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// �������̽� �����Ѵ�.
interface CallbackBtnAction{
	
	public abstract void clickedAddBtn();
	public void clickedMinusBtn();
	public void clickedMultipleBtn();
	public void clickedDevisionBtn();
	public void clickedCircleAreaBtn();
	
	// ���� 2) �޼��� 3�� �߰� ����
	
	// �Ű������� ������ ������ ����� ������̴�.
	public void passValue(int value);
	
	
}	// end of interface

/////////////////////////////////////////////////////////////////////////////
// �ݹ�޴� ��ü : CallbackBtnAction �������̽��� �����ؼ� �޼��带 �����Ѵ�.
class MainActivity extends JFrame implements CallbackBtnAction {
	
	double count;
	JLabel label;
	
	public MainActivity() {
		count = 0;
		label = new JLabel(count + "");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		setLayout(new FlowLayout());
		add(label);
	}

	@Override
	public void clickedAddBtn() {
		// �ݹ� �Ǿ����� �޼��� : 
		System.out.println(this.getClass().getName() + "�ݹ� �޾ҽ��ϴ�.");
		count++;
		label.setText(count + "");	// ��� Text �Է¸� �����ϱ� �ڿ� "" ���̴°Ŵ�

		
		
	}

	@Override
	public void clickedMinusBtn() {
		System.out.println("���̳ʽ� �ݹ� �޾ҽ��ϴ�.");
		count --;
		label.setText(count + "");
		
		if(count <= 0) {
			System.out.println("�� �� �� �����ϴ�.");
			count = 1;
		}
		
	}

	@Override
	public void clickedMultipleBtn() {
		System.out.println("���� �ݹ� ����");
		count = (count*2);
		label.setText(count +"");
		
		
	}

	@Override
	public void clickedDevisionBtn() {
		System.out.println("������ �ݹ� ����");
		count = (count/2);
		label.setText(count +"");
		
		
	}

	@Override
	public void clickedCircleAreaBtn() {
		System.out.println("�� ���� �ݹ� ����");
		count = count*3.141592;
		label.setText(count +"");
		
		
	}

	@Override
	public void passValue(int value) {
		System.out.println("value  ���� ���� ���� : " + value );
		label.setText(value +"");
		
	}
	
	
}// end of MainActivity

//////////////////////////////////////////////////////////////////////////////////////

// �ݸ� (ȣ����) : �ݹ� �޴� ��ü�� �ּҰ��� �˰� �־�� �޼��尡 ȣ�� �Ǿ��ٰ� �˸� �� �ִ�.
class SubActivity extends JFrame implements ActionListener{
	
	JButton btnAdd;
	JButton btnMinus;
	// ���� 1 )))). ��ư 3�� ����
	
	JButton btnMultiple;
	JButton btnDevision;
	JButton btnCircleArea;
	
	JButton btnPassValue;
	
	
	// 1. ��������� ������ ���ش�.
	CallbackBtnAction callbackBtnAction;
	

	
	public SubActivity(CallbackBtnAction callbackBtnAction) {
	
		// �߿�!
		this.callbackBtnAction = callbackBtnAction;
		
		
		setSize(300,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnAdd = new JButton("���ϱ� ��ư");
		btnMinus = new JButton("���� ��ư");
		btnMultiple = new JButton("���ϱ� ��ư");
		btnDevision = new JButton("������ ��ư");
		btnCircleArea = new JButton("������ ��ư");
		btnPassValue = new JButton("������ ��ư");
		
		
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		
		add(btnAdd);
		add(btnMinus);
		add(btnMultiple);
		add(btnDevision);
		add(btnCircleArea);
		add(btnPassValue);
		
		btnAdd.addActionListener(this);
		btnMinus.addActionListener(this);
		btnMultiple.addActionListener(this);
		btnDevision.addActionListener(this);
		btnCircleArea.addActionListener(this);
		btnPassValue.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// ��ư ����
		JButton targetBtn = (JButton)e.getSource();
				
		if(targetBtn == btnAdd) {
			//���ϱ� ��ư
			callbackBtnAction.clickedAddBtn();
		}else if(targetBtn == btnMinus) {
			//���� ��ư
			callbackBtnAction.clickedMinusBtn();
		}else if(targetBtn == btnMultiple) {
			//���ϱ� ��ư
			callbackBtnAction.clickedMultipleBtn();
		}else if(targetBtn == btnDevision) {
			//������ ��ư
			callbackBtnAction.clickedDevisionBtn();
		}else if(targetBtn == btnCircleArea) {
			//������ ���ϱ� ��ư
			callbackBtnAction.clickedCircleAreaBtn();
		}else if(targetBtn == btnPassValue) {
			
			callbackBtnAction.passValue(100);
		}
				
//		System.out.println("���ϱ� ��ư�� Ŭ���Ǿ����ϴ�.");
//		callbackBtnAction.clickedAddBtn();
		
	}
	
}
/////////////////////////////////////////////////////////////////////////////

public class CallbackTest {

	public static void main(String[] args) {
		
		/* 
		 * �ݹ� �޼���... �߱��� �ٿ��ְ� �� ���̴�.
		 */
		MainActivity mainActivity = new MainActivity();
		
		new SubActivity(mainActivity);
	}
}
