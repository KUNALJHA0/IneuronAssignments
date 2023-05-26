package com.placementprogram.assignments.Assignment2;


import java.util.HashSet;
import java.util.Scanner;

public class Question2 {

	public Question2() {
		// TODO Auto-generated constructor stub
	}
	

	public static int maxCandies(int[] candyType) {
        int maxCandies = candyType.length / 2;
        HashSet<Integer> uniqueCandies = new HashSet<>();

        for (int candy : candyType) {
            uniqueCandies.add(candy);

            // Break the loop if Alice has reached the limit of n/2 unique candies
            if (uniqueCandies.size() == maxCandies) {
                break;
            }
        }

        return uniqueCandies.size();
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
	        int maxSum = maxCandies(nums);
	        System.out.println("maxCandies" + maxSum);
	        scanner.close();
	}
	}


