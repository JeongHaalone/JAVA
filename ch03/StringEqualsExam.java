package ch03;

public class StringEqualsExam {

	public static void main(String[] args) {
		// string은 첫글자가 대문자이다. -> 클래스다.
		// 클래스는 객체로 사용한다.
		
		String str1 = new String("김정하");
		String str2 = "김정하";
		String str3 = "김정하";
		
		System.out.println("str1 : "+ str1);
		System.out.println("str2 : "+ str2);
		System.out.println("str1 == str2"+ str1 == str2); 
		// String은 참조타입이라 ==연산은 주소를 비교한다.
		
		
		System.out.println("str2 == str3"+ str2 == str3);
		System.out.println("str1.tostring : " + str1.toString());
		System.out.println("str2.tostring : " + str2.toString());
		System.out.println("str3.tostring : " + str3.toString());
		//문자열 비교는 .equals() 매서드를 이용한다.
		System.out.println("str1.equals(str2)" + str1.equals(str2));
		System.out.println("str3.equals(str2)" + str3.equals(str2));
		System.out.println("str1.equals(str3)" + str1.equals(str3));
		
		
		
		
		
	}

}
