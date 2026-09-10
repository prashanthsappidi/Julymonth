package july1st;

import java.util.*;

public class Remove_Duplicates_using_Collections_in_Array {

	public static void main(String[] args) {
		int[] arr = { 1, 6, 2, 3, 8, 4, 5, 9, 1, 6, 2 };
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int n : arr) {
			set.add(n);
		}
		System.out.println(set);

	}

}
