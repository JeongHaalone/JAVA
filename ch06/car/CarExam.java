package ch06.car;

public class CarExam {

	public static void main(String[] args) {
		// 객체를 호출하는 메인 매서드
		
		Car myCar = new Car ();
		Car yourCar = new Car("페라리","458이탈리아","노란색", 350, false);
		
		System.out.println("myCar : " + myCar.toString());
		System.out.println("yourCar :" + yourCar.toString());
		
		
	}

	//board[i].toString(); -> i번째 배열을 문자열로 가져옴  
	
	
}
