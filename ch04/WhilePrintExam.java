package ch04;

public class WhilePrintExam {

	public static void main(String[] args) {
		// While문은 괄호 안에 값이 true일 때 무한 반복한다.
		// While(true) -> 반복실행 -> while(false) -> 종료
		// 대부분 최댓값이 없는 반복문일때 활용됨. ->메뉴용으로 활용(관리자에 의한 종료)
		
		int i =1;
		while (i<=10) { // 1부터 10까지는 ture이고 11은 false가 나온다(while문 종료)
			
			//반복 실행문 작성
			System.out.println(i);
			i++ ;
			
			
		}//While문 종료
		
		System.out.println("프로그램이 정상 종료 되었습니다.");
		
		

	}

}
