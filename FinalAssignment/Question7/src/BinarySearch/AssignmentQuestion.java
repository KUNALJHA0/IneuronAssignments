package BinarySearch;

import java.util.*;
public class AssignmentQuestion {

	
	public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value to search: ");
        int target = scanner.nextInt();
        BinarySearch b=new BinarySearch();
        int result = b.binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Value not found in the array.");
        } else {
            System.out.println("Value found at index " + result);
        }
        scanner.close();
    }

}
