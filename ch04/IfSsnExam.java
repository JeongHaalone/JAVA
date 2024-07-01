package ch04;

import java.util.Scanner;

public class IfSsnExam {

	public static void main(String[] args) {
		// 주민번호를 이용한 태어난 계절 알아보기
		
		Scanner input = new Scanner(System.in);
		System.out.println("주민번호를 (-)하이픈을 빼고 입력하세요. : ");
		
		String ssn = input.next(); //ssn(주민번호)를 입력받음
		char num = ssn .charAt(6);//String 타입 문자열 -> char 타입 문자
				
		//성별 계산
		if (num%2 == 0) {
			System.out.println("당신은 여자입니다.");
		}
		if (num%2 ==1) {
			System.out.println("당신은 남자입니다.");
		}
 
		//나이 계산
		int ssn2 = Character.getNumericValue(num);// 숫자 형태 char(한자리 숫자)를 int로 변환

		int year = Integer.parseInt(ssn.substring(0,2)); 
		if (ssn2 == 3 || ssn2 == 4 || ssn2 == 7 || ssn2 == 8) {
			System.out.println("당신의 나이는 : " + (2024-(2000 + year)-1));// 현재 나이 = 이번년도 - 출생년도 - 1
			
		if (ssn2 == 1 || ssn2 ==2 || ssn2 ==5 || ssn2 ==6) {
			System.out.println("당신의 나이는 : " + (2024-(1900 + year)-1));
		}
		
		int month = Integer.parseInt(ssn.substring(2,4));
		if (month <=0 || month >=13) {
			System.out.println("입력오류입니다. 1~12값을 입력하세요.");
		}
		if (month <=2 || month >=11 ) {
			System.out.println("추운 겨울에 태어나셨습니다. 맞나요?");
		}
		if (month <=5 || month >=3 ) {
			System.out.println("따듯한 봄에 태어나셨습니다. 맞나요?");
		}
		if (month <=7 || month >=4 ) {
			System.out.println("화창한 여름에 태어나셨습니다. 맞나요?");
		}
		if (month <=10 || month >=8 ) {
			System.out.println("따사로운 가을 태어나셨습니다. 맞나요?");
		}
		
		
		}
	}

}
