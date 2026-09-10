package july3rd;

import java.util.*;

public class second_most_frequent_character_______________________________________ {
    public static void main(String[] args) {

        String s = "assholeX";

        HashMap<Character, Integer> hm = new HashMap<>();

        // Count each character
        for (char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        int max1 = 0;
        int max2 = 0;
        char first = '\0';
        char second = '\0';

        // Find highest and second highest frequency
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {

            int count = entry.getValue();
            char ch = entry.getKey();

            if (count > max1) {
                max2 = max1;
                second = first;

                max1 = count;
                first = ch;
            } 
            else if (count > max2 && count < max1) {
                max2 = count;
                second = ch;
            }
        }

        System.out.println("Most frequent character: " + first);
        System.out.println("Second most frequent character: " + second);
    }
}