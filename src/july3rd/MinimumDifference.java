package july3rd;

import java.util.*;

public class MinimumDifference {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Create the array
        int[] array = new int[n];

        // Read array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Sort the array in ascending order
        Arrays.sort(array);

        // Initialize minimum difference with the maximum possible integer value
        int minimumDifference = Integer.MAX_VALUE;

        // Variables to store the pair with minimum difference
        int firstElement = 0;
        int secondElement = 0;

        /*
         * Compare adjacent elements.
         * Since the array is sorted, the minimum difference
         * will always be found between two adjacent elements.
         */
        for (int i = 0; i < n - 1; i++) {

            int difference = array[i + 1] - array[i];

            // Update the minimum difference and pair
            if (difference < minimumDifference) {
                minimumDifference = difference;
                firstElement = array[i];
                secondElement = array[i + 1];
            }
        }

        // Display the result
        System.out.println("Pair with minimum difference: "
                + firstElement + ", " + secondElement);

        System.out.println("Minimum difference: " + minimumDifference);

        sc.close();
    }
}