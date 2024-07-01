package ch02;

public class FloatDoubleExam {

	public static void main(String[] args) {
		// Float은 32bit  Double은 64bit로 실수 처리한다.
		// 소수점 연산은 부동 소수점 연산 기법을 사용한다. (지수부, 가수부)
		// Float은 소수점 뒤에  f를 붙여야 한다.
		// DOuble은 소수점의 정확성이 좋기 때문에 실제로 많이 활용됨.

		
		double var1 = 3.14 ;
		float var2 = 3.14F ; //Type mismatch: cannot convert from double to float
		
		// 정밀도 테스트 
		double var4 = 0.123456789123456789 ; //0.123456789123456789 소수 18자리까지 나오고 버림
		float var5 = 0.123456789123456789F ; // 0.12345679 소수 9자리까지 나오고 반올림
		float var6 = 0.44444444444F;
		
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
	}

}
