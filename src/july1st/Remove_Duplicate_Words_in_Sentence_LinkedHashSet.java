package july1st;

import java.util.*;

public class Remove_Duplicate_Words_in_Sentence_LinkedHashSet {

	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String:");

		String s = sc.nextLine();

		sc.close();

		String[] words = s.split("\\s+");

		LinkedHashSet<String> set = new LinkedHashSet<String>();

		for (String word : words) {
			set.add(word);
		}
		for (String w : set) {
			System.out.print(w + " ");
		}

	}

}
