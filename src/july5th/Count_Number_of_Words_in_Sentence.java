package july5th;

import java.util.*;

public class Count_Number_of_Words_in_Sentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string value ");
		String s = sc.nextLine();
		String[] sen = s.split("\\s+");
		int n = sen.length;
		System.out.println("The number of words in the given sentence is " + n);
		sc.close();
	}
}
