package ch08.extended.package2;

import ch08.extended.package1.A;

public class C extends A {
	//field
	//constructer
	public C() {
		super();
		this.field ="자바"
		this.method();
	}//다른 클래스에서는 생성자로 부모 객체를 연결
	
	//method
	public void method() {
		super();
		//A a = new A();
		//a.field ="김기원";
	}
}
