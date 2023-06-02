package Assignment.question;
import java.util.Arrays;

public class Question1 {

	

	
	    public static int threeSumClosest(int[] nums, int target) {
	        Arrays.sort(nums);  // Sort the array in ascending order
	        int n = nums.length;
	        int closestSum = Integer.MAX_VALUE;  // Variable to store the closest sum

	        for (int i = 0; i < n - 2; i++) {
	            int left = i + 1;
	            int right = n - 1;

	            while (left < right) {
	                int currentSum = nums[i] + nums[left] + nums[right];
	                if (currentSum == target) {
	                    return currentSum;
	                }

	                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
	                    closestSum = currentSum;
	                }

	                if (currentSum < target) {
	                    left++;
	                } else {
	                    right--;
	                }
	            }
	        }

	        return closestSum;}
	    

	    public static void main(String[] args) {
	        int[] nums = { -1, 2, 1, -4 };
	        int target = 1;
	        int result = threeSumClosest(nums, target);
	        System.out.println("Closest sum: " + result);
	    }
	

}

