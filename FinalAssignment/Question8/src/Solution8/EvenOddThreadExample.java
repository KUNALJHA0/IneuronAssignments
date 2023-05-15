package Solution8;

public class EvenOddThreadExample {

	 public static void main(String[] args) {
	        Thread evenThread = new Thread(new EvenNumberPrinter());
	        Thread oddThread = new Thread(new OddNumberPrinter());
	        
	        evenThread.start();
	        oddThread.start();
	    }

}
