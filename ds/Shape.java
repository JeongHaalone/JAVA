package ds;

public abstract class Shape {
	protected String color;
	
	public Shape(String color) {
		this.color = color;
	}
	//Abstract method
	public abstract double calculateArea();
	
	//concrete method
	public void displayColor() {
		System.out.println("This shape is " + color);
	}
}
