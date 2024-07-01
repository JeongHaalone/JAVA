package ch06.ScoresCard;

import java.util.Scanner;

public class ScoresMainExam {
	// 필드 -> 맴버 변수로 main에서 사용할 배열이나 객체 등을 생성함
	private static Scanner input = new Scanner(System.in);// 현클래스 내에 매서드에서 호출되어 사용함
	private static Student[] st = new Student[5]; // 학생 객체용으로 5칸 배열 생성
	// String[] string = new String[5];

	// 생성자 -> main일 경우 new를 사용하지 않음 (정적 static으로 사용하지 않음)

	// 매서드

	public static void main(String[] args) {
		// 주실행 class로 메뉴와 class.method 호출용으로 작업
		// 객체 : 학생, 성적, 통계....
		boolean run = true;// 반복 실행 시작

		while (run) {// 종료 run = false;
			System.out.println("=============학생 관리 프로그램 v2(객체)=============");
			System.out.println("1. 학생관리 2. 성적 입력 3. 통계 4. 종료 ");
			System.out.println("=====================================================");
			System.out.print(">>>");
			int select = input.nextInt();// 객체 사용 전에 private static있는지 확인
			switch (select) {
			case 1:
				System.out.println("학생 관리 클래스로 진입합니다.");
				boolean strun = true; // strun이 반복적으로 돔
				while (strun) {
					System.out.println("1. 학생 등록 2. 학생 보기 3. 학생 수정 4. 학생 삭제 5. 메인 메뉴로 복귀");
					System.out.print(">>>");
					int stSelect = input.nextInt();
					switch (stSelect) {
					case 1:
						System.out.println("학생 등록 메뉴입니다.");
						Student regStudent = new Student();// 객체 생성
						System.out.println("이름 : ");
						regStudent.name = input.next();// 키보드로 받은 이름을 regStudent에 넣는다.
						System.out.println("학번 : ");
						regStudent.number = input.nextInt();// 키보드로 받은 학번
						System.out.println("성별 : ");
						regStudent.sex = input.next(); // 키보드로 받은 성별
						System.out.println("학년 : ");
						regStudent.grade = input.nextInt(); // 키보드로 받은 학년
						System.out.println("반 : ");
						regStudent.classroom = input.nextInt(); // 키보드로 받은 반
						System.out.println("======객체 생성 완료======");
						System.out.println("======배열 빈칸을 찾아 저장======");
						for (int i = 0; i < st.length; i++) {
							if (st[i] == null) {// st배열에 빈칸인지 찾음
								st[i] = regStudent; // 위에 만든 객체를 넣음
								System.out.println("저장 성공!");
								break;// 저장 후 종료
							} // if 종료
						} // for 종료 -> null을 찾는 for문 (빈칸을 찾는)
						break;// 학생 등록용 정지

					case 2:
						System.out.println("전체 학생 보기");

						for (int i = 0; i < st.length; i++) {
							if (st[i] != null) { // st배열 칸이 null이 아니면
								System.out.println("---------------------------");
								System.out.println("이름 : " + st[i].name);// 객체에 이름을 가져옴
								System.out.println("학번 : " + st[i].number);
								System.out.println("성별 :" + st[i].sex);

							} // if 종료

						} // for st배열 전체 반복
						break;// 학생 보기 정지

					case 3:
						System.out.println("수정할 학생 명을 입력하세요. : ");
						System.out.print(">>>");
						String searchName = input.next();// 키보드로 받은 이름 찾음
						Student findstudent = find(searchName); // 아래 만든 매서드로 student 찾아옴
						if (findstudent == null) {
							System.out.println("찾은 학생이 없습니다.");
						} else {// 찾은 학생이 있으면
							System.out.println("수정할 학생 번호를 입력하세요.");
							findstudent.number = input.nextInt(); // 학번으로 찾아온 객체의 번호가 들어감.
							System.out.println("학생 정보 수정 완료");
						}
						break;

					case 4:
						System.out.println("삭제할 학생명을 입력하세요.");
						System.out.println(">>>");
						String deleteName = input.next();
						Student deleteStudent = find(deleteName); // 아래 만든 매서드로 객체를 찾아옴.
						if (deleteStudent == null) {
							System.out.println("삭제할 학생이 없습니다.");
						} else {// 삭제할 학생이 있으면
							for (int i = 0; i < st.length; i++) {
								// System.out.println(st[i].name);
								if (st[i].name.equals(deleteStudent.name)) {
									st[i] = null; // null은 삭제
									System.out.println("삭제 완료");
									break;
								} // if
							} // for
						} // else
						break;

					case 5:
						System.out.println("메인 메뉴로 복귀합니다.");
						strun = false;
						break;

					default:
						System.out.println("1에서 5까지의 값을 입력해주세요.");
					} // switch 종료

				} // while 종료

				break;
			case 2:
				System.out.println("성적 관리 클래스로 진입합니다.");
				break;
			case 3:
				System.out.println("통계 관리 클래스로 진입합니다.");
				break;
			case 4:
				System.out.println("성적료 프로그램 종료");
				run = false;
				break;
			default:
				System.out.println("1~4번 값만 입력하세요!");
				// break 안씀 (작성하면 꺼짐)

			} // switch 매서드 종료 (주 메뉴용)

		} // while 종료
		
	}// main 매서드 종료

	private static Student find(String name) {
		// 이름으로 객체를 찾아오는 매서드 -> 리턴은 Student로
		Student student = null;// 빈객체 생성
		for (int i = 0; i < st.length; i++) {
			if (st[i] != null) {
				String arrayName = st[i].name;// 배열에 있는 이름을 가져옴
				if (arrayName.equals(name)) {// 배열이름과 키보드 이름을 동등비교
					student = st[i]; // 찾은 객체를 빈객체에 넣는다.
					break;
				}
			} // if
		} // for
		return student;// return 객체 생성

	}// find 매서드 종료

}// class 종료
