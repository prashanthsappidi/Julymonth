package july3rd;

import java.util.*;

/**
 * This program calculates and displays the frequency
 * of each word in a given paragraph.
 */
public class WordFrequency {

    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a paragraph
        System.out.println("Enter a paragraph:");
        String paragraph = sc.nextLine();

        /*
         * Convert the paragraph to lowercase so that
         * words like "Java" and "java" are treated as the same word.
         *
         * Remove punctuation and special characters.
         */
        paragraph = paragraph.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "");
                             

        // Split the paragraph into individual words
        String[] words = paragraph.split("\\s+");

        // HashMap to store each word and its frequency
        HashMap<String, Integer> map = new HashMap<>();

        /*
         * Loop through each word.
         *
         * getOrDefault(word, 0):
         * - If the word already exists, get its current count.
         * - If the word does not exist, return 0.
         *
         * Then add 1 and store the updated frequency.
         */
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        
        System.out.println(map);

/*
        // Display the word frequency
        System.out.println("\nWord Frequency:");

        // Loop through the HashMap and print each word with its count
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
*/
        // Close the Scanner
        sc.close();
    }
}