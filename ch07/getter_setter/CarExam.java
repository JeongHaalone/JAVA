package ch07.getter_setter;

public class CarExam {

	public static void main(String[] args) {
		// 
		Car myCar = new Car();
		
		//myCar.setSpeed =10;
		//private 접근제한자의 영향으로 직접 접근 불가
		//검증된 동작인 메서드로 접근하여 데이터를 삽입한다.(마이너스 스피드 x)
		
		myCar.setSpeed(10);
		//System.out.println("현재 속도" + myCar.speed);
		System.out.println("현재 킬로미터를 마일로 변환 : " +myCar.getSpeed());
	}

}
