package Assignment;
import java.lang.reflect.Array;
import java.util.*;

class SelectionSort{
	void sortTheArray(int[] arr ,int n) {
	 for(int k=0;k<n;k++) {
		 for(int i=k+1;i<n;i++) {
			 if(arr[i]<arr[k]) {
				 int temp=arr[i];
				 arr[i]=arr[k];
				 arr[k]=temp;
			 }
		 }
	 }
	}
}
public class SecondAssignmentQuestion5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	      int n;
	      System.out.println("Enter the array size");
	      n=sc.nextInt();
	      int[] arr = new int[n];
	      System.out.println("Enter array values "+Array.getLength(arr));
	      for(int i=0;i<n;i++) {
	    	  arr[i]=sc.nextInt();
	      }
	      SelectionSort sortArray=new SelectionSort();
	      sortArray.sortTheArray(arr, n);
	      System.out.println("The Sorted Array is");
	      for(int i=0;i<n;i++) {
	    	  System.out.print(arr[i]+" ");
	      }
	      
	}

}
