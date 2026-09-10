//Approach 1

package july1st;

import java.util.Scanner;

public class ReverseEachWordInString_______________july5th {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String value: ");
		String sentence = sc.nextLine();

		// Step 1: Split sentence into words
		String[] words = sentence.split(" ");

		String reversedSentence = "";

		// Step 2: Take each word
		for (String word : words) {

			String reversedWord = "";

			// Step 3: Reverse each word
			for (int i = word.length() - 1; i >= 0; i--) {

				reversedWord = reversedWord + word.charAt(i);
			}

			// Step 4: Add reversed word to final sentence
			reversedSentence = reversedSentence + reversedWord + " ";
		}

		System.out.println("Reversed Sentence: " + reversedSentence.trim());

		sc.close();
	}

}
