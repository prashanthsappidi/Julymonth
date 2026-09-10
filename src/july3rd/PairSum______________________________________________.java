package july3rd;


import java.util.*;

public class PairSum______________________________________________ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target sum:");
        int target = sc.nextInt();

        HashSet<Integer> seen = new HashSet<Integer>();
        boolean found = false;

        for (int num : arr) {
            int complement = target - num;

            if (seen.contains(complement)) {

                if (!found) {
                    System.out.println("Pairs are:");
                    found = true;
                }

                System.out.println(complement + " " + num);
            }

            seen.add(num);
        }

        if (!found) {
            System.out.println("No pair found.");
        }

        sc.close();
    }
}