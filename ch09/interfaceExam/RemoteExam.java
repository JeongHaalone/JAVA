package ch09.interfaceExam;

import java.util.Scanner;

public class RemoteExam {

	public static void main(String[] args) {
		// 인터페이스를 사용한 구현 클래스를 이용해본다.
		
		System.out.println("리모컨 인터페이스를 사용합니다.");
		Scanner scanner = new Scanner(System.in);
		RemoteControl rc= null; //인터페이스를 변수에 연결
		
		boolean condition = true;
		while (condition) {
			
			
			System.out.println("---------------------");
			System.out.println("1. TV 2. 오디오 3. 스마트TV 4. 종료");
			System.out.println("---------------------");
			System.out.print(">>>");
			int select = scanner.nextInt();
			switch (select) {
			case 1:
				rc = new Television(); //RemoteController rc = new Television();
				rc.turnOn();
				rc.turnOff();
				rc.setMute(true);
				rc.setMute(false);
				break;
			case 2:
				rc = new Audio(); //RemoteController rc = new Audio();
				rc.turnOn();
				rc.turnOff();
				
				break;
			case 3:
				rc = new SmartTelevision(); //RemoteController rc = new SmartTelevsion();
				rc.turnOn();
				Searchable se = new SmartTelevision();
				System.out.println("인터넷 검색을 시작합니다.");
				System.out.print(">>>");
				String sc = scanner.next();
				se.search(sc);
				rc.turnOff();
				break;
			case 4 :
				condition = false;
				break;
			default:
				System.out.println("1~2의 값을 넣어주세요.");
			}//스위치 문
//			rc.turnOn();
//			rc.turnOff();
		}
		

	}

}
