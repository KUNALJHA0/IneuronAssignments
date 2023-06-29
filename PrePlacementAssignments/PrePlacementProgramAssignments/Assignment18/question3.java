package Assignment18;

class QuickSort {
    public static void sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private static void quickSort(int[] nums, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(nums, start, end);
            quickSort(nums, start, pivotIndex - 1);
            quickSort(nums, pivotIndex + 1, end);
        }
    }

    private static int partition(int[] nums, int start, int end) {
        int pivot = nums[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (nums[j] <= pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, end);
        return i + 1;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
public class question3 {
    public static void main(String[] args) {
        int[] nums = {5, 2, 6, 1, 3};
        QuickSort.sortArray(nums);

        // Print the sorted array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

