package com.placementprogram.assignments.Assignment1;

import java.util.Arrays;

import java.util.Scanner;

public class Question1 {

	public Question1() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	 static int binarysearch(int arr[], int n, int i,
             int Totalsum)
 {
          int l = 0, r = n - 1, index = -1; // initialize as -1

            while (l <= r) {
            int mid = (l + r) / 2;

         int Pairsum = arr[mid] + arr[i]; // pair sum
         int Restsum = Totalsum - Pairsum; // Rest sum

              if (Pairsum == Restsum) {
                    if (index != i) // checking a pair has same
                 // position or not
               {
                index = mid;
                } // Then update index -1 to mid

 // Checking for adjacent element
        else if (index == i && mid > 0
          && arr[mid - 1] == arr[i]) {
     index = mid - 1;
     } // Then update index -1 to mid-1

     else if (index == i && mid < n - 1
          && arr[mid + 1] == arr[i]) {
     index = mid + 1;
       } // Then update index-1 to mid+1
     break;
   }
         else if (Pairsum > Restsum) {
 // If pair sum is greater than rest sum ,
 // our index will be in the Range [mid+1,R]
           l = mid + 1;
          }
    else {
 // If pair sum is smaller than rest sum ,
 // our index will be in the Range [L,mid-1]
        r = mid - 1;
      }
      }
// return index=-1 if a pair not exist with arr[i]
// else return index such that arr[i]+arr[index] ==
// sum of rest of arr
          return index;
  }
	
	
	
	 public static int[] twoSum(int[] nums, int target,int n) {
	        // Create a map to store the numbers and their indices
	        
		 
		 
		 Arrays.sort(nums);
		 int Totalsum = 0;
		 for (int i = 0; i < n; i++) {
	            Totalsum += nums[i];
	        }
		 for (int i = 0; i < n; i++) {
	            // If index is -1 , Means arr[i] can't pair with
	            // any element else arr[i]+a[index] == sum of
	            // rest of the arr
	            int index = binarysearch(nums, n, i, Totalsum);
	 
	            if (index != -1) {
	                System.out.println("Pair elements are "
	                                   + nums[i] + " and"
	                                   + nums[index]);
	                int[] answer = new int[n]; 
	                answer[0]=nums[i];
	                answer[1]=nums[index];
	                return answer;
	               
	            }
	        }

	        // If no solution is found, return an empty array
	        return new int[]{};
	    }

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();
	        
	        int[] nums = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            nums[i] = scanner.nextInt();
	        }
	        
	        System.out.print("Enter the target sum: ");
	        int target = scanner.nextInt();
	        
	        int[] result = twoSum(nums, target,n);
	        
	        if (result.length == 2) {
	            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
	            System.out.println("Numbers: " + nums[result[0]] + ", " + nums[result[1]]);
	        } else {
	            System.out.println("No solution found.");
	        }
	        
	        scanner.close();
	    }

}
