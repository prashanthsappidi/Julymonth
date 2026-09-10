package july5th;

public class Finding_Longest_Word {

	public static void main(String[] args) {
		String sen = "Iam a qa automation engineer";
		String arr[] = sen.split("\\s+");
		String longest_word = "";
		for(String word:arr) {
			if(word.length()>longest_word.length()) {
				longest_word=word;
			}
		}
		System.out.println("The longest word in the given string is "+longest_word);

	}

}
