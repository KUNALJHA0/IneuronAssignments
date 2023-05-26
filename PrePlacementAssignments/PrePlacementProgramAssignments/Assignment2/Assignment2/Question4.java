package com.placementprogram.assignments.Assignment2;

import java.util.Scanner;

public class Question4 {

	public Question4() {
		// TODO Auto-generated constructor stub
	}
	

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;

        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0) {
                if ((i == 0 || flowerbed[i - 1] == 0) && (i == length - 1 || flowerbed[i + 1] == 0)) {
                    flowerbed[i] = 1; // Plant a flower in the current plot
                    count++; // Increment the count of planted flowers

                    if (count >= n) {
                        return true; // Reached the required number of flowers
                    }
                }
            }
        }

        return false; // Cannot plant the required number of flowers
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
	        boolean maxSum = canPlaceFlowers(nums,n);
	        System.out.println(maxSum);
	        scanner.close();
	}
	}


