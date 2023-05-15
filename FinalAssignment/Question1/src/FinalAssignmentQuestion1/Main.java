package FinalAssignmentQuestion1;

public class Main {
		  public static void main(String[] args) {
		    Shape circle = new Circle(5.0);
		    System.out.println("Area of circle: " + circle.calculateArea());
		    
		    System.out.println("Perimeter of circle: " + circle.calculatePerimeter());

		    Shape triangle = new Triangle(3.0, 4.0, 5.0);
		    System.out.println("Area of triangle: " + triangle.calculateArea());
		    System.out.println("Perimeter of triangle: " + triangle.calculatePerimeter());
		  }
		}
		
