package ch04;

public class IfDiceExam {

	public static void main(String[] args) {
		// if문을 활용하여 주사위값을 추출해본다.
		// Math.random 매서드는 컴퓨터 시간에 초를 활용하여 난수를 발생시킨다.
		
		int num = (int)(Math.random()*6+1);//1부터 6사잇값이 랜덤으로 나옴.
		System.out.println("주사위 값은 : "+ num);

	}

}
