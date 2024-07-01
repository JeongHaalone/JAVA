package ch08.extended.people;

public class Teacher extends People {
	//field
	public int employNum;

	// constructor
	public Teacher(String name, String ssn, int employNum) {
		super(name, ssn);
		this.employNum = employNum;
	}

	// method
	
}
