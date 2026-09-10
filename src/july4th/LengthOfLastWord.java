package july4th;

import java.util.Scanner;

public class LengthOfLastWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a sentence: ");
		String str = sc.nextLine().trim();

		String[] words = str.split("\\s+");

		System.out.println("Length of Last Word: " + words[words.length - 1].length());

		sc.close();
	}
}