package july5th;

public class Reverse_Each_Word_in_StringBuilder {

	public static void main(String[] args) {
		String sen = "The mirzapur is a good movie";
		String[] words = sen.split("\\s+");
		for (String word : words) {
			
			StringBuilder sb = new StringBuilder(word);
			sb.reverse();
			
			System.out.print(sb.toString() + " ");
		}

	}

}
