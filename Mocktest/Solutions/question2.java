package Solutions;

import java.util.Scanner;

public class question2 {
    public static int firstNonRepeatingCharIndex(String s) {
        int[] charCount = new int[26]; // Assuming lowercase English alphabet characters

        // Count the frequency of each character in the string
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Find the index of the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charCount[c - 'a'] == 1) {
                return i;
            }
        }

        return -1; // No non-repeating character found
    }

    public static void main(String[] args) {
        String s = "";
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        int index = firstNonRepeatingCharIndex(s);

        if (index != -1) {
            System.out.println("The first non-repeating character is '" + s.charAt(index) + "' at index " + index);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }
        sc.close();
    }
}
