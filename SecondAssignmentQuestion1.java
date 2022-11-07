package Assignment;

import java.lang.reflect.Array;
import java.util.*;

public class SecondAssignmentQuestion1 {

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
      
      //sorting the array
      Arrays.sort(arr);
     //Finding the duplicates in array while traversing it
      int countOfDuplicates=0;
      for(int i=0;i<n-2;i++) {
    	  if(arr[i]==arr[i+1]) {
    		  countOfDuplicates++;
    		  int c=arr[i];
    		  while(arr[i]==arr[i+1]) {
    			 i++; 
    		  }
    		  System.out.println(c);
    		  
    	  }
    	  
      }
      
      if(countOfDuplicates==0) {
    	  System.out.println("No Duplicate Elements"); 
      }else if(countOfDuplicates==1) {
    	  System.out.println(countOfDuplicates+" Duplicate Element"); 
      }
      else {
    	  System.out.println(countOfDuplicates+" Duplicate Elements"); 
      }
      
	}

}
