package ch06.ranking;

import java.util.Scanner;

public class RankingExam {

	public static void main(String[] args) {
		// 열거타입을 사용하려면 객체로 생성하여 활용한다.(new 사용 안됨)
		
		
		//Ranking rk = new Ranking();
		Ranking rk = Ranking.GUEST;
		String rkString = rk.name(); //enum 타입의 상수 값을 문자열로 변환해준다.
		
		System.out.println("enum값  : " +rk);
		Ranking rk1 = Ranking.GUEST;
		Ranking rk2 = Ranking.GUEST;
		System.out.println(rk1 == rk2);
		
		 
		
		//스캐너 안됨.
		Scanner input = new Scanner(System.in);
		System.out.println("키보드 입력 : " );
		System.out.print(">>>");
		String rank = input.next();
		
		System.out.println("값 비교 " + (rkString == rank)); //false
		System.out.println("equals 비교" + (rkString.equals(rank))); //true
		
		int enumindex = rk.ordinal();
		System.out.println("열거 순서 파악 : " + enumindex);
		
		
	
	}

}
