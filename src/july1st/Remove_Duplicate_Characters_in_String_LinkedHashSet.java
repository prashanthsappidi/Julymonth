package july1st;

import java.util.LinkedHashSet;

public class Remove_Duplicate_Characters_in_String_LinkedHashSet {

	public static void main(String[] args) {

		        String str = "programming";

		        LinkedHashSet<Character> set = new LinkedHashSet<>();

		        for (char ch : str.toCharArray()) {
		            set.add(ch);
		        }

		        for (char ch : set) {
		            System.out.print(ch);
		        }
		    }
		

}


