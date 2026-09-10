package july5th;

import java.util.*;

public class Duplicate_Characters_in_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string value :");
		String s = sc.nextLine();
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(char ch : s.toCharArray()) {
			hm.put(ch,hm.getOrDefault(ch,0) +1);
		}
		System.out.println(hm);
		
		for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" - "+entry.getValue());
			}
		}
		sc.close();

	}

}
