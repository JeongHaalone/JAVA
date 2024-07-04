package ch14.collection.hashmap;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExam {

	public static void main(String[] args) {
		// keyboard typed id and password using login success test
		
		Map<String, String> login = new Hashtable<>();
		//hashtable
		login.put("kkw1", "1");
		login.put("kkw2", "2");
		login.put("kkw3", "3");
		login.put("kkw4", "4");
		login.put("kkw5", "5"); //<is,pw>
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("아이디를 입력하세요.");
			System.out.print(">>>");
			String id = scanner.next();
			
			System.out.println("비밀번호를 입력하세요.");
			System.out.print(">>>");
			String pw = scanner.next();
			
			if (login.containsKey(id)) { // 테이블에 k가 id와 같은 것을 find
				if(login.get(id).equals(pw)) { // id & pw same
					System.out.println("login successfully access");
					break;
				} else {
					System.out.println("password error");
				} // password same if function
			} else {
				System.out.println("no id is here");
			}// id same if function close
			
		}
		
	}

}
