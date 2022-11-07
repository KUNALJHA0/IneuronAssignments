package Assignment;

import java.util.Scanner;
 class QuickSort{
	 void swapTheElements(int[] arr, int i, int j)
	    {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	 int partition(int arr[] ,int pivot, int high, int low) {
		 int i = (low - 1);
		  
	        for (int j = low; j <= high - 1; j++) {
	  
	            // If current element is smaller
	            // than the pivot then we need to move it to left hence we will use "i" for that
	            if (arr[j] < pivot) {
	  
	                // Increment index of
	                // smaller element
	                i++;
	                swapTheElements(arr, i, j);
	            }
	        }
	        swapTheElements(arr, i + 1, high);
	        return (i + 1);
	 }
	 void quickSortArray(int[] arr,int low,int high) {
		 if (low < high) {
			  
	            // pi is partitioning index, arr[p],that is we are getting index of pivot element
	            
	            int pi = partition(arr,arr[high],high,low);
	  
	            // Separately sort elements before
	            // partition and after partition
	            quickSortArray(arr, low, pi - 1);
	            quickSortArray(arr, pi + 1, high);
	        }
		 
		 
	 }
 }

public class SecondAssignmentQuestion2 {

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
	      QuickSort sortArray=new QuickSort();
	      sortArray.quickSortArray(arr,0,n-1);
	      System.out.println("The Sorted Array is");
	      for(int i=0;i<n;i++) {
	    	  System.out.print(arr[i]+" ");
	      }

	}

}
