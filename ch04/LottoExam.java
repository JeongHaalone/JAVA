package ch04;

import java.util.Scanner;

public class LottoExam {

	public static void main(String[] args) {
		// 숫자, 정수 6개의 값을 입력받고 랜덤으로 6개의 값을 생성함.
		// 몇개가 맞았는지 파악
		
		Scanner dice = new Scanner(System.in);
		
		System.out.println("1에서 45까지의 숫자를 6번 입력해주세요. :");//키보드 입력 값을 받음
		
		int x1 = dice.nextInt();
		System.out.println("행운의 번호1 :"+ x1);
		int x2 = dice.nextInt();
		System.out.println("행운의 번호2 :"+ x2);
		int x3 = dice.nextInt();
		System.out.println("행운의 번호 3 :"+ x3);
		int x4 = dice.nextInt();
		System.out.println("행운의 번호 4 :"+ x4);
		int x5 = dice.nextInt();
		System.out.println("행운의 번호 5 :"+ x5);
		int x6 = dice.nextInt();
		System.out.println("행운의 번호 6 :"+ x6);
	
		int c1 = (int)(Math.random()*45)+1;// 45개의 랜덤한 숫자 중에서 1개
		int c2 = (int)(Math.random()*45)+1;
		int c3 = (int)(Math.random()*45)+1;
		int c4 = (int)(Math.random()*45)+1;
		int c5 = (int)(Math.random()*45)+1;
		int c6 = (int)(Math.random()*45)+1;
		
		int right =0; // 맞은 숫자
		if (x1 == c1 || x1 == c2 || x1 == c3 || x1 == c4 || x1 == c5 || x1 == c6) {
			++right;// 숫자가 맞으면 1개를 더함.
		}
		if (x2 == c1 || x2 == c2 || x2 == c3 || x2 == c4 || x2 == c5 || x2 == c6) {
			++right;
		}
		if (x3 == c1 || x3 == c2 || x3 == c3 || x3 == c4 || x3 == c5 || x3 == c6) {
			++right;
		}
		if (x4 == c1 || x4 == c2 || x4 == c3 || x4 == c4 || x4 == c5 || x4 == c6) {
			++right;
		}
		if (x5 == c1 || x5 == c2 || x5 == c3 || x5 == c4 || x5 == c5 || x5 == c6) {
			++right;
		}
		if (x6 == c1 || x6 == c2 || x6 == c3 || x6 == c4 || x6 == c5 || x6 == c6) {
			++right;
		}
		
		System.out.println("---------------------");
		System.out.println("이번주 로또 당첨 번호입니다.");
		System.out.println(c1 + " " + c2 + " "+ c3 + " " + c4 + " " + c5 + " " +c6);// 맞은 컴퓨터 로또 숫자를 나열해줌..
		System.out.println("---------------------");
		
		if (right ==0) {//로또가 0개 맞았을때
			System.out.println("당신의 번호는 하나도 맞지 않았습니다.");
		}
		else if (right ==1) {//로또가 1개 맞았을때
			System.out.println("당신의 번호는 하나 맞았습니다.");
		}
		else if (right ==2) {//로또가 2개 맞았을떄
			System.out.println("당신의 번호는 두 개 맞았습니다.");
		}
		else if (right ==3) {//로또가 3개 맞았
			System.out.println("당신의 번호는 세 개 맞았습니다.");
		}
		else if (right ==4) {
			System.out.println("당신의 번호는 네 개 맞았습니다.");
		}
		else if (right ==5) {
			System.out.println("당신의 번호는 다섯 개 맞았습니다.");
		}
		else if (right ==6) {
			System.out.println("당신의 번호는 여섯 개 맞았습니다.");
		}
		else 
			System.out.println("시스템 오류");

}
}
