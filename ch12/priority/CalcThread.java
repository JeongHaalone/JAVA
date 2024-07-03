package ch12.priority;

public class CalcThread extends Thread { 
	
	public CalcThread(String name) {
		setName(name) ;
		
	} // CalcThread calcThread = new CalcThread("스레드이름");
	
	@Override
	public void run() {
	for (int i =0; i < 20000000 ; i++) {
		
	}
	System.out.println(getName());
	}// 0~2000000 까지 반복 후에 이름 출력
	
	
}
