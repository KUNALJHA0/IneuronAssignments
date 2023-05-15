
public class Solution {

	
		// TODO Auto-generated constructor stub
		public static void main(String[] args) {
		    java.util.Scanner input = new java.util.Scanner(System.in);
		    int num;

		    try {
		      System.out.print("Enter a positive integer: ");
		      num = input.nextInt();

		      if (num < 0) {
		        throw new Exception("Negative integers are not allowed.");
		      }

		      System.out.println("The entered number is: " + num);
		    } catch (Exception e) {
		      System.out.println("Error: " + e.getMessage());
		    }
		  }
	}


