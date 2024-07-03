package ch12.beeptest;

import java.awt.Toolkit;

public class BeepExam {

	public static void main(String[] args) {
		// 소리와 자막이 동시에 나오고 싶은 프로그램
		
		 Runnable beepTask = new BeepTask();
		 //스레드 run 용 객체 생성
		 
		 Thread th1 = new Thread(beepTask);
		 // run 메서드가 들어 잇ㄴ느 객체를 스레드에 넣음
		 
		 th1.start(); // 스레드 시작
		
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //객체화
		for(int i  =0; i< 10; i++) {
			toolkit.beep(); // 사운드로 경고음이 출력됨
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
				e.printStackTrace();
			} //1초 동안 대기 상태
 		}//for
		for(int i =0; i < 10; i++) {
			System.out.println("띠리링");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //1초 동안 대기 상태
		}//자막 for문 종료
		

	}

}
