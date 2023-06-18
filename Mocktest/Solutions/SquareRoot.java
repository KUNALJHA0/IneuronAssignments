package Solutions;

public class SquareRoot {
    public static int sqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        long start = 1;
        long end = x;
        long ans = 0;

        while (start <= end) {
            long mid = (start + end) / 2;
            long square = mid * mid;

            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }

        return (int) ans;
    }

    public static void main(String[] args) {
        int x = 25;
        int sqrtX = sqrt(x);
        System.out.println("Square root of " + x + " is: " + sqrtX);
    }
}
