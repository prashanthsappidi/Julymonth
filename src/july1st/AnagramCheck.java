package july1st;

import java.util.*;

public class AnagramCheck {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string:");
		String s1 = sc.nextLine();

		System.out.println("Enter second string:");
		String s2 = sc.nextLine();

		// Remove spaces and convert to lowercase
		s1 = s1.replaceAll("\\s+", "").toLowerCase();
		s2 = s2.replaceAll("\\s+", "").toLowerCase();

		// Check length
		if (s1.length() != s2.length()) {
			System.out.println("Not an Anagram");
			return;
		}

		// Convert strings to character arrays
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();

		// Sort character arrays
		Arrays.sort(a);
		Arrays.sort(b);

		// Compare arrays
		if (Arrays.equals(a, b)) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not an Anagram");
		}

		sc.close();
	}
}