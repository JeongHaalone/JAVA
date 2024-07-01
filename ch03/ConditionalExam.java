package ch03;

import java.util.Scanner;

public class ConditionalExam {

	public static void main(String[] args) {
		// 삼항 연산자는 if 를 간단히 처리하기 위해 활용된다.
		// (조건식) ? 참 : 거짓
		
		int score =0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 점수를 입력하세요. : " );
		score = sc.nextInt();
		
		char grade = (score >90 ) ? 'A' : (score >80) ? 'B' : (score >70) ? 'C'  :(score >60) ? 'D' : 'F' ;
		
		System.out.println(score + "\t점은\n" +grade +"\t등급입니다.");
		

	sc.close();
	}

}
