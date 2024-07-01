package ch04;

public class WhileSumExam {

	public static void main(String[] args) {
		// 1~100까지 합을 구하려고 한다.

		int i =1;//반복용 상자
		int sum =0;//합을 출력하는 상자
		
		while (i<=100) {
			
			sum= sum +i;//i값이 1부터 100까지 나오니까 sum에 누적함.
			i ++;//i 가 1부터 100까지 증가
		}
		System.out.println("합은 : "+ sum);
		
	}

}
