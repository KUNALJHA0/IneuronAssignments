package Assignment19;

class MergeSortedArrays {
    public static int[] mergeArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                merged[k] = nums1[i];
                i++;
            } else {
                merged[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < nums1.length) {
            merged[k] = nums1[i];
            i++;
            k++;
        }

        while (j < nums2.length) {
            merged[k] = nums2[j];
            j++;
            k++;
        }

        return merged;
    }
}
public class question6 {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 7};
        int[] nums2 = {2, 4, 6, 8};
        int[] merged = MergeSortedArrays.mergeArrays(nums1, nums2);

        // Print the merged array
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}
