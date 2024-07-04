package ch13.nongeneric;

public class Box /* extends Object */{
	//field
	private Object object ; //최상위 객체를 필드를 필드로 사용
	
	
	//basic contstructor
	
	
	//method
	public Object getObject() { //getter
		return object;
	}

	public void setObject(Object object) { //setter
		this.object = object;
	}
	
}
