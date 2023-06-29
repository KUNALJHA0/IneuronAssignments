package Assignment19;

import java.util.Arrays;

class SmallerElementsCounter {
    public static int[] countSmaller(int[] nums) {
        int[] counts = new int[nums.length];
        int[] indices = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            indices[i] = i;
        }
        mergeSort(nums, indices, counts, 0, nums.length - 1);
        return counts;
    }

    private static void mergeSort(int[] nums, int[] indices, int[] counts, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(nums, indices, counts, start, mid);
        mergeSort(nums, indices, counts, mid + 1, end);
        merge(nums, indices, counts, start, mid, end);
    }

    private static void merge(int[] nums, int[] indices, int[] counts, int start, int mid, int end) {
        int[] merged = new int[end - start + 1];
        int left = start;
        int right = mid + 1;
        int mergedIndex = 0;
        int smallerCount = 0;

        while (left <= mid && right <= end) {
            if (nums[indices[left]] <= nums[indices[right]]) {
                counts[indices[left]] += smallerCount;
                merged[mergedIndex++] = indices[left++];
            } else {
                smallerCount++;
                merged[mergedIndex++] = indices[right++];
            }
        }

        while (left <= mid) {
            counts[indices[left]] += smallerCount;
            merged[mergedIndex++] = indices[left++];
        }

        while (right <= end) {
            merged[mergedIndex++] = indices[right++];
        }

        System.arraycopy(merged, 0, indices, start, merged.length);
    }
}
public class Question2 {
    public static void main(String[] args) {
        int[] nums = {5, 2, 6, 1};
        int[] counts = SmallerElementsCounter.countSmaller(nums);

        // Print the counts of smaller elements to the right of each number
        System.out.println(Arrays.toString(counts));
    }
}
