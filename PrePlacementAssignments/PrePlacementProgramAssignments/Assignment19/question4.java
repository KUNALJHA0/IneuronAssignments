package Assignment19;

class PushZerosToEnd {
    public static void pushZeros(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
        }

        while (left < nums.length) {
            nums[left] = 0;
            left++;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
public class question4 {
    public static void main(String[] args) {
        int[] nums = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        PushZerosToEnd.pushZeros(nums);

        // Print the modified array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
