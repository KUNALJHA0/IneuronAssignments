package Assignment;

import java.util.Scanner;
class MergeSortArray{
	void mergeArrays(int[] arr, int l, int m, int r) {
		 // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
	}
	void mergeSort(int[] arr,int low, int high) {
		if(low<high) {
			int mid=(low+high)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			mergeArrays(arr,low,mid,high);
		}
	}
}
public class SecondAssignmentQuestion4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			      
			      MergeSortArray mergeArraySort=new MergeSortArray();
			      mergeArraySort.mergeSort(arr, 0, n-1);
			      System.out.println("The Sorted Array is");
			      for(int i=0;i<n;i++) {
			    	  System.out.print(arr[i]+" ");
			      }
	}

}
