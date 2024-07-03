package ch11.throwexam;

public class ThrowsExam {

	public static void main(String[] args) {
		// throw는 예외발생시 예외처리하는 곳으로 떠넘기는 코드
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 안흡시ㅏㅇ.");
			//e.printStackTrace();
		}
	}
	
	public static void findClass() throws ClassNotFoundException { // 클래스를 찾아주는 메서드
		Class clazz = Class.forName("java.lang.String");
		System.out.println(clazz + " 가 존재합니다.");
		
		
		
	}
	
}
