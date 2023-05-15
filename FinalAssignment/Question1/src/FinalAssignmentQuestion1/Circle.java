package FinalAssignmentQuestion1;

public class Circle implements Shape {
	  private double radius;

	  public Circle(double radius) {
	    this.radius = radius;
	  }

	  public double calculateArea() {
	    return Math.PI * radius * radius;
	  }

	  public double calculatePerimeter() {
	    return 2 * 3.14 * radius;
	  }
	}
