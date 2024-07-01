package ch04;

import java.util.Scanner;

public class SsnExam {

	public static void main(String[] args) {
		// 주민번호 7번째 글자를 입력받아 남, 녀 파악용
		//str.equalsIgnoreCase("yes") -> 문자열의 내용이 yes인지 검증(대소문자 구분 안함)
		
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.print("주민번호 7번째 숫자 입력 : ");
		int ssn = input.nextInt();
		
		String who1 = "boy";
		String who2 = "girl";
		String military = "yes";
		String boy = military;
		
		if (ssn%2 == 1 && ssn <9) { 
			System.out.println("당신은 "+who1+" 입니다." );
			System.out.println("당신은 군대 의무입니다.");
		}
		
		if (ssn%2 == 0 && ssn <9) {
			System.out.println("당신은 "+who2+"입니다.");
		}
		
		if(ssn >=9 || ssn < 1) {
			System.out.println("오류 : 입력오류 이유 - > 1이상 9 미만으로 입력해주세요.");
		}
		
	
		
		
	}

}
