package com.placementprogram.assignments.Assignment2;


import java.util.HashMap;

import java.util.Scanner;

public class Question3 {

	public Question3() {
		// TODO Auto-generated constructor stub
	}
	

	 public static int findLHS(int[] nums) {
	        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

	        // Count the frequency of each number
	        for (int num : nums) {
	            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	        }

	        int maxLength = 0;

	        // Iterate through the keys of the HashMap
	        for (int num : frequencyMap.keySet()) {
	            if (frequencyMap.containsKey(num + 1)) {
	                int currentLength = frequencyMap.get(num) + frequencyMap.get(num + 1);
	                maxLength = Math.max(maxLength, currentLength);
	            }
	        }

	        return maxLength;
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
	        int maxSum = findLHS(nums);
	        System.out.println("maxCandies" + maxSum);
	        scanner.close();
	}
	}


