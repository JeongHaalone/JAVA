package ch04;

import java.util.Scanner;

public class SwitchCharExam {

	public static void main(String[] args) {
		// switch 문은 동등 비교연산자로 문자(char)도 동등비교할수 있다.
		
		Scanner inChar = new Scanner(System.in); //char용 스캐너 객체 생성
		System.out.print("회원등급을 입력하세요. (A~C)");
		
		String gradeStr = inChar.next(); // 문자열로 데이터를 입력받아 String에 넣음
		
		char gradeChar = gradeStr.charAt(0); // 문자열 0번 인덱스 문자를 char 타입 변수에 넣음
		
		//char gradeChaStr =inChar.next().charAt(0); //문자열로 받은 값을 문자 처리
		
		System.out.println("검증 코드용(2줄) : " + gradeChar);
		//System.out.println("검증 코드용(1줄) : " + gradeChaStr);
		
		
		switch (gradeChar) {
		case 'a':
		case'A':
		System.out.println("우수회원입니다.");
		break;
		
		case 'b':
		case'B':
		System.out.println("일반회원입니다.");
		break;
		
		case 'c':
		case'C':
		System.out.println("사업자회원입니다.");
		break;
		
		default :
			System.out.println("손님 처음이십니까?");
			System.out.print("회원가입하시려면 yes를 입력해주세요.");
			String newMember = inChar.next();
			if (newMember.equalsIgnoreCase("yes")) {
				System.out.println("회원가입을 진행합니다.");
				System.out.println("ID : ");
				String id = inChar.next();
				System.out.println(id + "님 회원가입을 축하합니다.");
				break;
			}
			else 
				System.out.println("안녕히 가세요. 다음 기회에 뵙겠습니다.");
				System.out.println("단 2번 다시 못들어오실수 있습니다.");
				break;
		//회원가입 
			
		} //스위치문 종료
		
		
	}//메인 종료

}// class종료
