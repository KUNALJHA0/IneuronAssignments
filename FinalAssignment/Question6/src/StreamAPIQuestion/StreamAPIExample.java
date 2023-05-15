package StreamAPIQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 2, 6, 5, 3, 8, 7, 9, 10);
        
        // Sorting the numbers in ascending order
        List<Integer> sortedNumbers = numbers.stream()
                                             .sorted()
                                             .collect(Collectors.toList());
        System.out.println("Sorted numbers: " + sortedNumbers);
        
        // Filtering the even numbers
        List<Integer> evenNumbers = numbers.stream()
                                            .filter(n -> n % 2 == 0)
                                            .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);
        
    }
}