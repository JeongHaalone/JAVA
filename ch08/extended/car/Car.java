package ch08.extended.car;

public class Car {// 부모 자동차
	// 필드
	public int speed;

	// 생성자
	public Car() { } // 기본 생성자
	// Car car = new Car();
	// 메서드

	public void speedup() {
		speed += 1;

	}// 메서드 호출시 속도가 1씩 증가

	public final void stop() {
		System.out.println("자동차가 멈춥니다.");
		speed =0;
	}
}
