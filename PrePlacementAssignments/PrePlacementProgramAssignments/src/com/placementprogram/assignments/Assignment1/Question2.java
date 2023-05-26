package com.placementprogram.assignments.Assignment1;

import java.util.Arrays;

import java.util.Scanner;

public class Question2 {

	public Question2() {
		// TODO Auto-generated constructor stub
	}
	
	
	private static int value(int[] nums, int target, int n) {
		// TODO Auto-generated method stub
		
        int k = 0; // Number of elements not equal to val
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target) {
                // Move the element to the front of the array
                nums[k] = nums[i];
                k++;
            }
        }
        
        return k;
		
		
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
	        
	        System.out.print("Enter the value");
	        int target = scanner.nextInt();
	        
	        int result = value(nums, target,n);
	        
	        System.out.println(result);
	        for (int i = 0; i < n; i++) {
	        	
	        	System.out.print(nums[i]);
	        	
	        }
	        
	        scanner.close();
	    }






	

}
