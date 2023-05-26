package com.placementprogram.assignments.Assignment1;

import java.util.Arrays;

import java.util.Scanner;

public class Question7 {

	public Question7() {
		// TODO Auto-generated constructor stub
	}
	
	public static void moveZeros(int[] nums) {
        int left = 0;
        int right = 0;

        while (right < nums.length) {
            if (nums[right] != 0) {
                // Move nonzero element to the left side of the array
                nums[left] = nums[right];
                left++;
            }
            right++;
        }

        // Fill the remaining elements with zeros
        while (left < nums.length) {
            nums[left] = 0;
            left++;
        }
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
	        
	       
	        moveZeros(nums);
	        
	        
	        
	        for (int i = 0; i <n; i++) {
	        	System.out.print(nums[i]);
	        }
	        
	        scanner.close();
	    }






	

}
