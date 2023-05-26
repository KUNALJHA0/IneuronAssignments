package com.placementprogram.assignments.Assignment1;

import java.util.Arrays;

import java.util.Scanner;

public class Question6 {

	public Question6() {
		// TODO Auto-generated constructor stub
	}
	
	 public static boolean uniqueOrDistinct(int[] digits) {
	        int n = digits.length;
	        Arrays.sort(digits);

	        // Iterate from the rightmost digit
	        for (int i =1; i<n; i++) {
	            // Increment the digit by 1
	            

	            // Check if there is a carry-over
	            if (digits[i] == digits[i-1]) {
	                // No carry-over, return the updated array
	                return true;
	            }

	            // Carry-over, set the current digit to 0
	            digits[i] = 0;
	        }

	        
	        return false;
	    }
	
	
	

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();
	        
	        int[] nums = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i <n; i++) {
	            nums[i] = scanner.nextInt();
	        }
	        
	       
	        boolean result = uniqueOrDistinct(nums);
	        
	        
	        System.out.print(result);
	        
	        scanner.close();
	    }






	

}
