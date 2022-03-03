package practice211028;

public class Day06_Ch09_NumberPrinter {

	private int id;
	private int waitNumber = 1;
	
	public Day06_Ch09_NumberPrinter(int id) {
		this.id =id;
	}
	
	// 번호표를 찍어 주세요
	public void printWaitNumber() {
		System.out.println(id + " 기기의 대기순번 : " + waitNumber);
		waitNumber ++;
	}
	
	
}
