package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 인터페이스 선언한다.
interface CallbackBtnAction{
	
	public abstract void clickedAddBtn();
	public void clickedMinusBtn();
	public void clickedMultipleBtn();
	public void clickedDevisionBtn();
	public void clickedCircleAreaBtn();
	
	// 문제 2) 메서드 3개 추가 생성
	
	// 매개변수로 값전달 가능한 기능을 만들것이다.
	public void passValue(int value);
	
	
}	// end of interface

/////////////////////////////////////////////////////////////////////////////
// 콜백받는 객체 : CallbackBtnAction 인터페이스를 구현해서 메서드를 정의한다.
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
		// 콜백 되어지는 메서드 : 
		System.out.println(this.getClass().getName() + "콜백 받았습니다.");
		count++;
		label.setText(count + "");	// 얘는 Text 입력만 받으니까 뒤에 "" 붙이는거다

		
		
	}

	@Override
	public void clickedMinusBtn() {
		System.out.println("마이너스 콜백 받았습니다.");
		count --;
		label.setText(count + "");
		
		if(count <= 0) {
			System.out.println("더 뺄 수 없습니다.");
			count = 1;
		}
		
	}

	@Override
	public void clickedMultipleBtn() {
		System.out.println("곱셈 콜백 받음");
		count = (count*2);
		label.setText(count +"");
		
		
	}

	@Override
	public void clickedDevisionBtn() {
		System.out.println("나누기 콜백 받음");
		count = (count/2);
		label.setText(count +"");
		
		
	}

	@Override
	public void clickedCircleAreaBtn() {
		System.out.println("원 넓이 콜백 받음");
		count = count*3.141592;
		label.setText(count +"");
		
		
	}

	@Override
	public void passValue(int value) {
		System.out.println("value  값을 전달 받음 : " + value );
		label.setText(value +"");
		
	}
	
	
}// end of MainActivity

//////////////////////////////////////////////////////////////////////////////////////

// 콜리 (호출자) : 콜백 받는 객체의 주소값을 알고 있어야 메서드가 호출 되었다고 알릴 수 있다.
class SubActivity extends JFrame implements ActionListener{
	
	JButton btnAdd;
	JButton btnMinus;
	// 문제 1 )))). 버튼 3개 생성
	
	JButton btnMultiple;
	JButton btnDevision;
	JButton btnCircleArea;
	
	JButton btnPassValue;
	
	
	// 1. 멤버변수로 선언을 해준다.
	CallbackBtnAction callbackBtnAction;
	

	
	public SubActivity(CallbackBtnAction callbackBtnAction) {
	
		// 중요!
		this.callbackBtnAction = callbackBtnAction;
		
		
		setSize(300,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnAdd = new JButton("더하기 버튼");
		btnMinus = new JButton("뺴기 버튼");
		btnMultiple = new JButton("곱하기 버튼");
		btnDevision = new JButton("나누기 버튼");
		btnCircleArea = new JButton("원넓이 버튼");
		btnPassValue = new JButton("값전달 버튼");
		
		
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
		
		// 버튼 구분
		JButton targetBtn = (JButton)e.getSource();
				
		if(targetBtn == btnAdd) {
			//더하기 버튼
			callbackBtnAction.clickedAddBtn();
		}else if(targetBtn == btnMinus) {
			//빼기 버튼
			callbackBtnAction.clickedMinusBtn();
		}else if(targetBtn == btnMultiple) {
			//곱하기 버튼
			callbackBtnAction.clickedMultipleBtn();
		}else if(targetBtn == btnDevision) {
			//나누기 버튼
			callbackBtnAction.clickedDevisionBtn();
		}else if(targetBtn == btnCircleArea) {
			//원넓이 구하기 버튼
			callbackBtnAction.clickedCircleAreaBtn();
		}else if(targetBtn == btnPassValue) {
			
			callbackBtnAction.passValue(100);
		}
				
//		System.out.println("더하기 버튼이 클릭되었습니다.");
//		callbackBtnAction.clickedAddBtn();
		
	}
	
}
/////////////////////////////////////////////////////////////////////////////

public class CallbackTest {

	public static void main(String[] args) {
		
		/* 
		 * 콜백 메서드... 야근을 줄여주게 될 것이다.
		 */
		MainActivity mainActivity = new MainActivity();
		
		new SubActivity(mainActivity);
	}
}
