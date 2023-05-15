package FinalAssignmentQuestion1;

public class Triangle implements Shape {
	  private double sideA;
	  private double sideB;
	  private double sideC;

	  public Triangle(double sideA, double sideB, double sideC) {
	    this.sideA = sideA;
	    this.sideB = sideB;
	    this.sideC = sideC;
	  }

	  public double calculateArea() {
	    double s = (sideA + sideB + sideC) / 2.0;
	    return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
	  }

	  public double calculatePerimeter() {
	    return sideA + sideB + sideC;
	  }
	}

	






