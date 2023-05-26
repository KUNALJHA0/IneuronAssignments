package com.placementprogram.assignments.Assignment1;

import java.util.Arrays;

import java.util.Scanner;

public class Question3 {

	public Question3() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid; // Found the target element
            } else if (nums[mid] < target) {
                left = mid + 1; // Target is in the right half
            } else {
                right = mid - 1; // Target is in the left half
            }
        }
        
        return -1; // Target element not found
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
	        
	        int result = binarySearch(nums, target);
	        
	        System.out.println(result);
	        
	        scanner.close();
	    }






	

}
