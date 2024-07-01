package ch02;

public class CastingExam {

	public static void main(String[] args) {
		// Casting은 강제타입 변환으로 큰 타입을 작은 타입으로 강제 주입할 때 사용된다.
		// 단 손실이 발생 -> 2진법에 영향을 받음
		// int 변수명 = (int) double값 ;
		
		int intValue =12345678;
		byte byteValue = (byte) intValue ; //Type mismatch: cannot convert from int to byte
		
		System.out.println("int 값 : " + intValue);
		System.out.println("byte 값 : " + byteValue);

		

		System.out.println("---------");		
		int intValue1 = 10;
		double doubleValue1 = 5.5;
		double result1 = intValue1 + doubleValue1;//자동타입변환
		
		System.out.println("int 10 + double 5.5 = " + result1); 
		
		
		
		System.out.println("----------정수로 결과를 봄-------");
		int result2 = (int) (intValue1 + doubleValue1);//강제타입변환
		//int result2 = intValue1 + (int)doubleValue1 ; ->가능
		System.out.println("int10 + double5.5 = " + result2);
		
	}

}
