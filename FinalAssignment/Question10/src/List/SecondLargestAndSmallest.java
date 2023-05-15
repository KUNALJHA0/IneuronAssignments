package List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondLargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        System.out.print("Enter a set of integers: ");

        String[] input = scanner.nextLine().split(" ");
        for (String s : input) {
            numbers.add(Integer.parseInt(s));
        }

        if (numbers.size() < 2) {
            System.out.println("At least two integers are required.");
            return;
        }

        int secondSmallest = findSecondSmallest(numbers);
        int secondLargest = findSecondLargest(numbers);

        System.out.println("Second smallest: " + secondSmallest);
        System.out.println("Second largest: " + secondLargest);
        scanner.close();
    }

    private static int findSecondSmallest(List<Integer> numbers) {
        Collections.sort(numbers);
        return numbers.get(1);
    }

    private static int findSecondLargest(List<Integer> numbers) {
        Collections.sort(numbers, Collections.reverseOrder());
        return numbers.get(1);
    }
    
}