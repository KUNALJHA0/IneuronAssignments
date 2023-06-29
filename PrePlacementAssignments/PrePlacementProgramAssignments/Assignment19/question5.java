package Assignment19;

class AlternateArrangement {
    public static void arrangeAlternate(int[] nums) {
        int pos = 0;
        int neg = 0;

        while (pos < nums.length && neg < nums.length) {
            if (nums[pos] >= 0) {
                pos += 2;
            } else if (nums[neg] < 0) {
                neg += 2;
            } else {
                swap(nums, pos, neg);
                pos += 2;
                neg += 2;
            }
        }

        // Move remaining positive numbers to the end
        while (pos < nums.length) {
            if (nums[pos] >= 0) {
                pos += 2;
            } else {
                pos++;
            }
        }

        // Move remaining negative numbers to the end
        while (neg < nums.length) {
            if (nums[neg] < 0) {
                neg += 2;
            } else {
                neg++;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
public class question5 {
    public static void main(String[] args) {
        int[] nums = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        AlternateArrangement.arrangeAlternate(nums);

        // Print the modified array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

