package ch03;

import java.util.Scanner;

public class PrintfExam {

	public static void main(String[] args) {
		// sysout.out.printf는 포맷팅용 출력을 진행해준다.
		// 대부분 규격을 맞출 때 활용함.

		Scanner input = new Scanner(System.in);
		//키보드로 입력받을 객체
		
		System.out.println("----------------------");
		System.out.print("이름 : ");
		String name = input.next(); //문자열 입력용
		/*
		 * next() : 통째로가 사용자가 입력한 문자열 값(엔터치기 전 공백은 포함되지 않는다.)
		 * nextInt() : 통째로가 사용자가 입력한 정수 값 
		 * nextLine() : 통째로가 사용자가 입력한 문자열 값(엔터치기 전 공백까지 포함한다.)
		 */
		
		System.out.print("나이 : ");
		int age = input.nextInt();  //정수 입력용
		
		System.out.print("평균 : ");
		double avg = input.nextDouble(); //실수 입력용
		
		System.out.printf("현재 당신의 이름은 %s\n 당신의 나이는 %d\n 평균은 %5.2f\n 입니다. ", name, age, avg ); 
	
		
	}

}
