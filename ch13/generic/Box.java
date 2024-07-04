package ch13.generic;

public class Box<T> { // <T> 제네릭 코드로 타입을 정하고 시작한다.
	//위에 명시된 T가 String이면???????
	//field
	private T t;

	//basic constructor
	
	
	//method
	public T getT() {//getter
		return t;
	}

	public void setT(T t) { //setter
		this.t = t;
	}
}
