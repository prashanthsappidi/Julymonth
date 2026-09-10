package july5th;
import java.util.*;

public class ReverseString_Using_StringBuilder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string value :");
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder(s);
		String r=sb.reverse().toString();
		System.out.println(r);
		if(r.equals(s)) {
			System.out.println("The string is a palindrome");
		}
		else {
			System.out.println("The string is not a palindrome");
		}
		sc.close();

	}

}
