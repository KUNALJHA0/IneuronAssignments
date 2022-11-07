package Assignment;
import java.lang.reflect.Array;
import java.util.*;
class BubbleSort{
	void bubbleSortArray(int[] arr,int n) {
		 for (int i = 0; i < n - 1; i++)
	            for (int j = 0; j < n - i - 1; j++)
	                if (arr[j] > arr[j + 1]) {
	                    // swap arr[j+1] and arr[j]
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	}
}

public class SecondAssignmentQuestion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	      int n;
	      System.out.println("Enter the array size");
	      n=sc.nextInt();
	      int[] arr = new int[n];
	      System.out.println("Enter array values");
	      for(int i=0;i<n;i++) {
	    	  arr[i]=sc.nextInt();
	      }
	      BubbleSort sortArray=new BubbleSort();
	      sortArray.bubbleSortArray(arr, n);
	      System.out.println("The Sorted Array is");
	      for(int i=0;i<n;i++) {
	    	  System.out.print(arr[i]+" ");
	      }
	}

}
