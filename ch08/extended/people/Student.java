package ch08.extended.people;

public class Student extends People {
	
	public int studentNum;
	//constructor
	public Student(String name, String ssn, int studentNum) {
		super(name, ssn); //부모는 this 대신 super로 줌
		//this.name = name;
		//this.ssn = ssn;
		this.studentNum = studentNum;
	}//커스텀 생성자 Student student= new Student("김기원", 주민번호, 2402018);
	
}
