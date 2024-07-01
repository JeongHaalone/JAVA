package ch04;

import java.util.Scanner;

public class CarRunExam {

	public static void main(String[] args) {
		// 자동차 주행 프로그램 만들기
		//C 시동을 건다(start)
		//R 계기판 정보 출력 (Read)
		//U 주행 (Update)
		//D 시동을 끈다(End)
		Scanner input = new Scanner(System.in);
		boolean run = true; //시동을 켠다.
		int speed =0; //차량 속도
		final int maxSpeed = 300; //최고 속도(변경안됨) 
		final int minSpeed = 0; //최소 속도(변경안됨)
		
		//maxSpeed =400; 
		//The final local variable maxSpeed cannot be assigned. It must be blank and not using a compound assignment
		
		
		System.out.println("람보르기니가 입고되었습니다.");
		System.out.println("시동을 켭니다.");
		
		while (run) {
			//무한반복중 메뉴가 출력
			System.out.println("==================");
			System.out.println("0번 메뉴 : 시동 종료");//30km/h 이상 300km/h이하 성공
			System.out.println("1번 메뉴 : 엑셀");
			System.out.println("2번 메뉴 : 브레이크");
			System.out.println("3번 메뉴 : 라디오를 켠다");
			System.out.println("4번 메뉴 : 시동종료");
			System.out.println("==================");
			System.out.print("0~4번 숫자 입력>>>>>>>");
			int select = input.nextInt();
			
			switch (select) {
			case 0 :
				System.out.println("시동을 종료합니다.");//종료 성공
				run = false;//while문이 나옴
				break;
				
			case 1 :
				System.out.println("가속을 진행합니다.");
				speed += 30;//5km씩 속도가 증가
				
				
				if(speed>=maxSpeed) {//현재속도가 최고속도보다 크거나 같으면 speed에 maxSpeed를 넣어라
					speed = maxSpeed;
				}//300이상 출력안됨
				System.out.println("현재 속도는 "+ speed +"km/h");
			
				break;
				
			case 2 :
				System.out.println("감속을 진행합니다.");
				speed -= 10;
				System.out.println("현재 속도는 "+ speed +"km/h");
				if (speed<=minSpeed) {
					speed = minSpeed;
				}
				System.out.println("현재 속도는 "+ speed +"km/h");
				
				break;
				
			case 3 :
				System.out.println("멀티미디어를 실행합니다.");
				break;
			
			case 4 :
				System.out.println("주유하기");
				break;
			
			}//switch문 종료
			
			
			
		}//while문 종료
		
		System.out.println("람보르기니 자동차가 사라집니다.");
		input.close();

	}//main문 종료

}//class문 종료
