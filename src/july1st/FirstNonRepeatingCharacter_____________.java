package july1st;

import java.util.*;
import java.util.Scanner;

public class FirstNonRepeatingCharacter_____________ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.nextLine();
		sc.close();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (char ch : s.toCharArray()) {
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}

		boolean found = false;

		for (char ch : s.toCharArray()) {
			if (hm.get(ch) == 1) {
				System.out.println("First Non-repeating character is ." + ch);
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("No non-repeating character found.");
		}

	}
}