package com.placementprogram.assignments.Assignment2;


import java.util.Arrays;


import java.util.Scanner;

public class Question8 {

	public Question8() {
		// TODO Auto-generated constructor stub
	}
	

	 public static int minimumScore(int[] nums, int k) {
	        int min = Integer.MAX_VALUE;
	        int max = Integer.MIN_VALUE;

	        // Find the initial minimum and maximum elements
	        for (int num : nums) {
	            min = Math.min(min, num);
	            max = Math.max(max, num);
	        }

	        // Adjust the minimum and maximum elements based on the operation
	        for (int num : nums) {
	            if (num - k > min) {
	                min = num - k;
	            }
	            if (num + k < max) {
	                max = num + k;
	            }
	        }

	        // Calculate the final score
	        return max - min;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Enter the target");
        int target=scanner.nextInt();
	        int maxSum = minimumScore(nums,target);
	        System.out.println(maxSum);
	        scanner.close();
	}
	}


