package com.placementprogram.assignments.Assignment2;


import java.util.Arrays;


import java.util.Scanner;

public class Question5 {

	public Question5() {
		// TODO Auto-generated constructor stub
	}
	

	public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int length = nums.length;

        // Scenario 1: Product of three largest elements
        int product1 = nums[length - 1] * nums[length - 2] * nums[length - 3];

        // Scenario 2: Product of two smallest elements and the largest element
        int product2 = nums[0] * nums[1] * nums[length - 1];

        return Math.max(product1, product2);
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
	        int maxSum = maximumProduct(nums);
	        System.out.println(maxSum);
	        scanner.close();
	}
	}


