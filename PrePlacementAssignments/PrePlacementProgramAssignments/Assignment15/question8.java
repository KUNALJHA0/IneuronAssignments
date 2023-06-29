package Assignment15;

class WaterTrapping {
    public static int trapWater(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int waterTrapped = 0;

        while (left <= right) {
            if (heights[left] <= heights[right]) {
                if (heights[left] > leftMax) {
                    leftMax = heights[left];
                } else {
                    waterTrapped += leftMax - heights[left];
                }
                left++;
            } else {
                if (heights[right] > rightMax) {
                    rightMax = heights[right];
                } else {
                    waterTrapped += rightMax - heights[right];
                }
                right--;
            }
        }

        return waterTrapped;
    }
}
public class question8 {
    public static void main(String[] args) {
        int[] heights = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        int waterTrapped = WaterTrapping.trapWater(heights);

        System.out.println("Amount of Water Trapped: " + waterTrapped); // Output: 6
    }
}

