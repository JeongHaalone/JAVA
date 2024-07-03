package ch12.sharethread;

public class CalcExam {

	public static void main(String[] args) {
		// 만든 스레드를 동작
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		//Calculator calculator = new Calculator();
		User2 user2 = new User2();
		user2.setCalculator(calculator); //객체 공유
		user2.start();

	}

}
