package july2nd;

import java.util.*;

public class DuplicateElements_in_Array {
    public static void main(String[] args) {

        int[] arr = {0, 2, 3, 2, 3, 4, 5, 6, 7, 8, 21, 7, 4, 3, -1};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for (int n : arr) {
            if (!set.add(n)) {
                duplicate.add(n);
            }
        }

        System.out.println(duplicate);
    }
}