package Assignment19;

import java.util.*;

class ArrayIntersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        List<Integer> intersection = new ArrayList<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                intersection.add(num);
                set.remove(num);
            }
        }

        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }

        return result;
    }
}
public class question7 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] intersection = ArrayIntersection.intersection(nums1, nums2);

        // Print the intersection array
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }
}
