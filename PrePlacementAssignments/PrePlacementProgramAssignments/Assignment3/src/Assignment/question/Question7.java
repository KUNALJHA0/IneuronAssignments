package Assignment.question;

import java.util.ArrayList;
import java.util.List;

public class Question7 {
    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> missingRanges = new ArrayList<>();

        // Helper function to add a range to the result list
        // Handles the case where lower = upper
        // If lower == upper, it appends the number itself to the list
        // If lower < upper, it appends the range in the form "lower->upper"
        // and handles the edge case where lower + 1 = upper
        // to avoid adding duplicate numbers
        // (e.g., if lower = 3 and upper = 5, it appends "3->5" instead of "4")
        addRangeToList = (start, end) -> {
            if (start == end) {
                missingRanges.add(String.valueOf(start));
            } else {
                missingRanges.add(start + "->" + end);
            }
        };

        // Check if there are missing numbers before the first element of nums
        if (lower < nums[0]) {
            addRangeToList.accept(lower, nums[0] - 1);
        }

        // Check for missing numbers between adjacent elements in nums
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] > 1) {
                addRangeToList.accept(nums[i - 1] + 1, nums[i] - 1);
            }
        }

        // Check if there are missing numbers after the last element of nums
        if (nums[nums.length - 1] < upper) {
            addRangeToList.accept(nums[nums.length - 1] + 1, upper);
        }

        return missingRanges;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 3, 50, 75 };
        int lower = 0;
        int upper = 99;
        List<String> result = findMissingRanges(nums, lower, upper);
        for (String range : result) {
            System.out.println(range);
        }
    }
}

