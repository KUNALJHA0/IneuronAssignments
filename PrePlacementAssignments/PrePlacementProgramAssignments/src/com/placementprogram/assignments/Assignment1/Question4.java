package com.placementprogram.assignments.Assignment1;

import java.util.Arrays;

import java.util.Scanner;

public class Question4 {

	public Question4() {
		// TODO Auto-generated constructor stub
	}
	
	 public static int[] plusOne(int[] digits) {
	        int n = digits.length;

	        // Iterate from the rightmost digit
	        for (int i = n - 1; i >= 0; i--) {
	            // Increment the digit by 1
	            digits[i]++;

	            // Check if there is a carry-over
	            if (digits[i] < 10) {
	                // No carry-over, return the updated array
	                return digits;
	            }

	            // Carry-over, set the current digit to 0
	            digits[i] = 0;
	        }

	        // If the leftmost digit requires a carry-over
	        int[] result = new int[n + 1];
	        result[0] = 1;
	        return result;
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
	        
	       
	        int[] result = plusOne(nums);
	        
	        for(int i=0;i<n;i++) {
	        System.out.print(result[i]);}
	        
	        scanner.close();
	    }






	

}
