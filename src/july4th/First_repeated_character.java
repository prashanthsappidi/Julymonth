package july4th;

import java.util.*;

public class First_repeated_character {

	public static void main(String[] args) {
		String s = "abcde";
		HashSet<Character> set = new HashSet<>();
		for (char ch : s.toCharArray()) {
			if (set.contains(ch)) {
				System.out.println("First repeated character " + ch);
				return;
			}
			set.add(ch);
		}
		System.out.println("There is no repeated character");
	}
}
