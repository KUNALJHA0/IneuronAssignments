package com.placementprogram.assignments.Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {

	public Question1() {
		// TODO Auto-generated constructor stub
	}
	

	    public static int arrayPairSum(int[] nums) {
	        Arrays.sort(nums);

	        int maxSum = 0;
	        for (int i = 0; i < nums.length; i += 2) {
	            maxSum += nums[i];
	        }

	        return maxSum;
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
	        int maxSum = arrayPairSum(nums);
	        System.out.println("Maximized sum: " + maxSum);
	        scanner.close();
	}
	}


