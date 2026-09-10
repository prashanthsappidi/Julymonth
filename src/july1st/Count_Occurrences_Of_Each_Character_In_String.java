package july1st;

import java.util.*;

public class Count_Occurrences_Of_Each_Character_In_String{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String s = sc.nextLine();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (char ch :s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}
		
		System.out.println(hm);
		sc.close();
	}
}
