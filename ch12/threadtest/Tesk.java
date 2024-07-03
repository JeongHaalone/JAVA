package ch12.threadtest;

public class Tesk implements Runnable {
	// implements Tunnable 멀티 스레드용
	// 멀티스레드 구축은 Runnable 인터페이스를 사용하여 구현체로 만드는 방법1
	@Override //  Runable 인터페이스에서 제공한 추상메서드를 ㅈ\ㅐ정의
	public void run() {
		// 스레드로 만든 코들르 개발자가 작성
		System.out.println("implement Runnable 인터페이스의 run() 추상메서드 실행됨");

	
	}

}
