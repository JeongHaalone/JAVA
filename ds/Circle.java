package ds;

public class Circle extends Shape{
	private double radius;
	
	
		
		 // Constructor
	    // Calls the superclass constructor using super()
	    public Circle(String color, double radius) {
	        super(color);
	        this.radius = radius;
	    }

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}
