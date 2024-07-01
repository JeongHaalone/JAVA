package ch06.singleton;

public class SingletonExam {
	public static void main(String[] args) {
		//SINGLETON 사용해보자.
		
		//생성자의 private을 붙여 불가능
		//Singleton obj1 = new Singleton();
		//Singleton obj2 = new Singleton();
		Singleton obj3 = Singleton.getInstace(); //객체 연결
		Singleton obj4 = Singleton.getInstace();
		
		if(obj3 == obj4) {
			System.out.println("같은 싱글톤 객체입니다.");
		}
		else {
			System.out.println("다른 싱글톤 객체입니다.");
		}
	}
}
