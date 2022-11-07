package Assignment;

import java.util.*;
class SubsetOfArray{
	boolean searchTheElemnet(int[] array1,int element,int n) {
		///Binary search to search all the elements
		int low=0;
		int high=n-1;
		
		while(high-low>1) {
			int mid=(low+high)/2;
			if(array1[mid]==element) {
				return true;}
			else if(array1[mid]<element) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		if(array1[low]==element) {
			return true;}
				
		if(array1[high]==element) {
			return true;}
		return false;
	}
	boolean subsetOfArray(int[] array1,int[]array2,int n,int m) {
		for(int i=0;i<m;i++) {
			if(searchTheElemnet(array1,array2[i],n)==false) {
				System.out.println(array2[i]+" not found in array1");
				return false;
			}
			
		}
		
		return true;
	}
	
}
public class SecondAssignmentQuestion6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		int n,m;
		System.out.println("Enter the array1 size");
	      n=sc.nextInt();
	      System.out.println("Enter the array2 size");
	      m=sc.nextInt();
		int[] array1 = new int[n];
		int[] array2 = new int[m];
		 System.out.println("Enter array1 values");
	      for(int i=0;i<n;i++) {
	    	  array1[i]=sc.nextInt();
	      }
	      
	      System.out.println("Enter array2 values");
	      for(int j=0;j<m;j++) {
	    	  array2[j]=sc.nextInt();
	      }
	     //sorting the arrays 
	      Arrays.sort(array1);
	      //Arrays.sort(array2);
	      SubsetOfArray sub=new SubsetOfArray();
	      boolean p=sub.subsetOfArray(array1,array2,n,m);
	      if(p)
	      System.out.println("Array2 is subset of Array1");
	      else {
	    	  System.out.println("Array2 is not subset of Array1");  
	      }
	      
	}

}
