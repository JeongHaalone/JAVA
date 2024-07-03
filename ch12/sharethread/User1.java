package ch12.sharethread;

public class User1 extends Thread {
	//필드
	private Calculator calulator ;
	
	//생성자
	
	
	//메서드
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calulator = calculator;
		
	}
	public void run() {
		calulator.setMemory(100);
	}
}
