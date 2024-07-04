package ch14.collection.list;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VectorExam {
	public static void main(String[] args) {
		// vector is list collection child object(객체) , method is same.
		// 동기화된 메서드로 구성되어 있어 멀티스레드가 동시에 이 메서드를 실행할 수 있고
		// 하나의 스레드가 실행을 완료해야 다른 스레드를 실행할 수 있다.
		// 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제 (좌석 예약, 상품 재고)

		List<BoardDTO> listB = new Vector<BoardDTO>();
		// 10 array, all object go into array
		listB.add(new BoardDTO("제목1", "내용1", "작성자1")); // 0
		listB.add(new BoardDTO("제목2", "내용2", "작성자2")); // 1
		listB.add(new BoardDTO("제목3", "내용3", "작성자3"));
		listB.add(new BoardDTO("제목4", "내용4", "작성자4"));
		listB.add(new BoardDTO("제목5", "내용5", "작성자5"));
		listB.add(new BoardDTO("제목6", "내용6", "작성자6"));

		BoardDTO boardDTO = listB.get(1);
		System.out.println("==== vector object's 1 index information====");
		System.out.println(boardDTO.getSubject() + " 제목 ");
		System.out.println(boardDTO.getContent() + " 내용 ");
		System.out.println(boardDTO.getWriter() + " 작성자 ");

		Scanner scanner = new Scanner(System.in);

		BoardDTO newBoardDTO = new BoardDTO(); // basic constructor

		System.out.println("제목을 입력하세요.");
		System.out.print(">>>");
		newBoardDTO.setSubject(scanner.next()); // if using setter
		// String title = scanner.next();

		System.out.println("내용을 입력하세요.");
		System.out.print(">>>");
		newBoardDTO.setContent(scanner.next());
		// String content = scanner.next();

		System.out.println("작성자를 입력하세요.");
		System.out.print(">>>");
		newBoardDTO.setWriter(scanner.next());
		// String writer = scanner.next();
		// BoardDTO newBoardDTO = new BoardDTO(title, content, writer);
		listB.add(newBoardDTO);
		// System.out.println(newBoardDTO.getSubject() + "가 등록되었습니다.");
		System.out.println(newBoardDTO.toString()); // toString is test function

		System.out.println("-----all list print-----");
		for (BoardDTO list : listB) // vector list = listB -> into the list
			System.out.println(list.getContent() + " : " + list.getSubject() + " : " + list.getWriter());
	}

}
