package ch08.extended.abstractexam;

public class PhoneExam {

	public static void main(String[] args) {
		//Phone phone = new Phone("김기원");
		//Phone class에 abstract가 되어있어 객체로 사용할 수 없다.
		//사용하려면 구현 class(조원) 상속받아 활용해야 한다.(강제)
		
		SmartPhone smartphone = new SmartPhone("이정상");
		smartphone.turnOn();//부모
		System.out.println(smartphone.owner);
		smartphone.internetSearch(); //자식
		smartphone.turnOff();//부모
		
		
	}

}
