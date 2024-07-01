package chap05;

import java.util.Scanner;

public class GradeExam {

// 학생 이름 테이블 -> String[]
// 점수 테이블 -> byte[]
// 총점 테이블 -> int[]
// 평균 테이블 -> double[]

	public static void main(String[] args) {
		// 주메뉴 구현용
		Scanner mainSC = new Scanner(System.in);
		System.out.println("초기작업 : 학생 수를 입력하세요.");
		int count = mainSC.nextInt();// 학생수 등록
		String[] name = new String[count];// 배열 = 학생수
		byte[] engScores = new byte[count];
		byte[] korScores = new byte[count];
		int[] totalScores = new int[count];
		double[] avgScores = new double[count];

		boolean run = true;
		while (run) {

			System.out.println("=========MBC 교육센터 성적 관리 프로그램===========");
			System.out.println("1. 학생 관리 | 2. 성적관리 | 3. 통계 | 4. 종료");// 자격증 관리
			System.out.println("=========================================");
			System.out.print(">>>");
			int select = mainSC.nextInt();// 키보드 입력이 select에 들어감(1~4까지 정수 입력 후 분기 설정)

			switch (select) {
			case 1:
				System.out.println("학생 관리 메서드로 진입합니다.");
				student(name);// 매서드 이름
				break;
			case 2:
				System.out.println("성적 관리 메서드로 진입합니다.");
				scores(count, name, engScores, korScores);//
				break;
			case 3:
				System.out.println("통계 관리 메서드로 진입합니다.");
				scoreAdmin(count, name, engScores, korScores, totalScores, avgScores);
				break;
			case 4:
				System.out.println("종료 합니다.");
				run = false;
				break;

			}// 주메뉴 switch종료
		} // while 문 종료
	}// main 종료

	public static void scores(int count, String[] name, byte[] engScores, byte[] korScores) {// 변수 선언

		Scanner studentGrade = new Scanner(System.in);
		boolean run = true; // while문 반복실행위해
		while (run) {

			System.out.println("=========학생 성적관리 메뉴==========");
			System.out.println("1. 학생 성적 등록 2. 학생 성적 보기 3. 삭제 4. 나가기");
			System.out.println("=============================");
			System.out.print(">>>");

			int select = studentGrade.nextInt();
			switch (select) {
			case 1:
				for (int i = 0; i < name.length; i++) {
					System.out.println(name[i] + "의 영어 성적을 등록하세요.");
					engScores[i] = studentGrade.nextByte();
					System.out.println(name[i] + "의 국어 성적을 등록하세요");
					korScores[i] = studentGrade.nextByte();

				}
				break;

			case 2:
				for (int i = 0; i < name.length; i++) {
					System.out.println(name[i] + "의 영어 성적은 " + engScores[i] + " 국어 성적은 " + korScores[i]);
				}
				break;

			case 3:
				System.out.println("삭제할 학생을 입력하세요.");
				int deleteGrade = studentGrade.nextInt();
				name[deleteGrade - 1] = null;
				engScores[deleteGrade - 1] = 0;
				korScores[deleteGrade - 1] = 0;
				break;//성적을 삭제하면 이름도 삭제된다.

			case 4:
				System.out.println("이용해주셔서 감사합니다. 다음 메뉴를 선택해주세요.");
				run = false;
				break;

			default:
				System.out.println("입력값오류 : 1에서 4번만 입력하세요.");

			}// switch 종료

		} // while 종료

	}// main 종료

	public static void scoreAdmin(int count, String[] name, byte[] engScores, byte[] korScores, int[] totalScores,
			double[] avgScores) {
		Scanner studentGrade2 = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("\n================== 통계 관리 메뉴 ==================");
			System.out.println("1. 학생 총점, 평균 보기 2. 전체 평균 보기 3. 등수 보기 4. 나가기");

			int select = studentGrade2.nextInt();
			switch (select) {
			
			case 1:
				for (int i = 0; i < name.length; i++) {
					totalScores[i] = engScores[i] + korScores[i];
					avgScores[i] = totalScores[i] / 2;
					if (name[i] != null) {
						System.out.println(name[i] + "님의 총점은 " + totalScores[i] + " 평균은 " + avgScores[i]);
					}
				}
				break;
			
			case 2:
			    double everyAvg = 0;
			    int validStudentCount = 0;
			    int sum = 0; // 합계를 저장할 변수 초기화

			    for (int i = 0; i < name.length; i++) {
			        if (name[i] != null) {
			            sum += totalScores[i]; // 배열 totalScores의 값을 합계에 추가
			            validStudentCount++; // 유효한 학생 수 증가
			        }
			    }

			    if (validStudentCount > 0) {
			        everyAvg = (double) sum / validStudentCount; // 유효한 학생 수로 나누어 평균 계산
			        System.out.println("이 반의 평균은 " + everyAvg);
			    } else {
			        System.out.println("등록된 학생이 없습니다.");
			    }
			    break;
			    
			case 3:
				System.out.println("준비중");
				break;
				
			case 4:
				System.out.println("이용해주셔서 감사합니다. 다음 메뉴를 선택해주세요.");
				run = false;
				break;
			default :
				System.out.println("0에서 4의 값만 입력해주세요.");

			}// switch 종료

		} // while 종료
	}// main 종료

	public static String[] student(String[] name) {
		// 학생 관리용 crud를 함.
		Scanner studentSC = new Scanner(System.in);

		boolean run = true; // while문 반복실행위해
		while (run) {

			System.out.println("=========학생 관리 메뉴==========");
			System.out.println("1. 학생 등록 2. 학생 보기 3. 학생 수정  4. 삭제 5. 나가기");
			System.out.println("=============================");
			System.out.print(">>>");
			int select = studentSC.nextInt();

			switch (select) {
			case 1:
				for (int i = 0; i < name.length; i++)
					System.out.println("학생등록을 시작합니다.");
				System.out.println("총 학생 수는 : " + name.length);
				for (int i = 0; i < name.length; i++) {// 학생이름 반복문
					System.out.println((i + 1) + "번 학생 이름을 등록하세요.");
					name[i] = studentSC.next(); // 키보드 문자로 받은 값을 배열 i에 넣는다.
				}
				System.out.println("학생 등록 완료");
				break;

			case 2:
				System.out.println("학생리스트 출력");
				for (int i = 0; i < name.length; i++) {
					System.out.println((i + 1) + "번 :" + name[i]);
				}
				break;

			case 3:
				System.out.println("학생이름 수정을 시작합니다.");
				System.out.println("수정할 학생 번호를 입력하세요. : ");
				int nameNum = studentSC.nextInt();
				System.out.println("수정할 학생 이름을 입력하세요.");
				String nameMOD = studentSC.next();
				name[nameNum - 1] = nameMOD;// 3번이 왔을 때 2번 인덱스가 수정됨.
				System.out.println("수정 완료");
				break;

			case 4:
				System.out.println("삭제할 학생번호를 입력하세요.");
				int deleteNum = studentSC.nextInt();
				name[deleteNum - 1] = null;// 객체는 null로 지울수 있음
				break;
				
			case 5 :
				System.out.println("이용해주셔서 감사합니다. 다음 메뉴를 선택해주세요.");
				run = false;
				break;
			default:
				System.out.println("입력값오류 : 1에서 4번만 입력하세요.");

			}// switch 문 종료

		} // while문 종료

		return name;// name을 가지고 논다음에 String배열로 돌려줌
	}// student method종료

}// class 종료
