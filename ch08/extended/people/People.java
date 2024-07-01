package ch08.extended.people;

public class People {//부모 클래스
	public String name;
	public String ssn; //주민번호
	
	public People(String name, String ssn) {
		//field
		this.name = name;
		this.ssn = ssn;
		
		
		
	}//커스텀 생성자 People people = new People("김기원", "주민번호");
	//내가 생성자를 만들면 기본 생성자는 생성할 수 없다.

}
