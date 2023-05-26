package com.placementprogram.assignments.Assignment1;

import java.util.Arrays;

import java.util.Scanner;

public class Question5 {

	public Question5() {
		// TODO Auto-generated constructor stub
	}
	

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Last non-zero element index in nums1
        int j = n - 1; // Last element index in nums2
        int k = m + n - 1; // Last index of the merged array

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // Copy remaining elements from nums2 to nums1 (if any)
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int m = scanner.nextInt();
    	
    	int[] nums1 = new int[m];
    	
    	System.out.println("Enter the elements of the array:");
        for (int i = 0; i <m; i++) {
            nums1[i] = scanner.nextInt();
        }
    	
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] nums2 = new int[m+n];
        
        System.out.println("Enter only "+n+ "elements of the arrayand rest all as 0");
        for (int i = 0; i <m+n; i++) {
            nums2[i] = scanner.nextInt();
        }
        
        merge(nums2, n, nums1, m);

        System.out.print("Merged Array: ");
        for (int i = 0; i < m + n; i++) {
            System.out.print(nums2[i] + " ");
        }
    }
}








