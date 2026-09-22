package july3rd;

import java.util.*;

public class Most_Frequent_word_in_Sentence {

	public static void main(String[] args) {
		String sen = "iam a qa a automation engineer qa ";
		String words[] = sen.split("\\s+");

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (String word : words) {
			hm.put(word, hm.getOrDefault(word, 0) + 1);
		}

		String mostFrequent = "";
		int max = 0;

		for (String word : hm.keySet()) {
			if (hm.get(word) > max) {
				max = hm.get(word);
				mostFrequent = word;
			}
		}
		System.out.println("Most repeated word is " + mostFrequent);

	}
}
