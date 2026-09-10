 package july3rd;

import java.util.HashSet;
import java.util.Scanner;

public class CommonElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First Array
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter first array elements:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Second Array
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter second array elements:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        // Store first array elements
        for (int nn1 : arr1) {
            set.add(nn1);
        }

        System.out.println("Common Elements:");

        // Find common elements
        for (int nn2 : arr2) {
            if (set.contains(nn2)) {
                System.out.print(nn2 + " ");
                set.remove(nn2); // Avoid duplicate output
            }
        }

        sc.close();
    }
}