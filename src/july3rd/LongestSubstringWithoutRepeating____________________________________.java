package july3rd;

import java.util.*;

public class LongestSubstringWithoutRepeating____________________________________ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;
        String longest = "";

        for (int right = 0; right < str.length(); right++) {

            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));

            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                longest = str.substring(left, right + 1);
            }
        }

        System.out.println("Longest Substring: " + longest);
        System.out.println("Length: " + maxLength);

        sc.close();
    }
}