package july3rd;

import java.util.*;

public class FrequencyOfArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read array size at runtime
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read array elements at runtime
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Store frequencies
		HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Print frequencies
        System.out.println("Frequency of each element:");
        
        //System.out.println(freq);

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        sc.close();
    }
}