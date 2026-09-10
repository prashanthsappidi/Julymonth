package july1st;

import java.util.Scanner;

public class String_Reverse {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String value : ");
		String s=sc.nextLine();		
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println("The reversed string is "+rev);
		
		if(rev.equals(s))
		{
			System.out.println("The given string is a palindrome");
		}
		else
		{
			System.out.println("The given string is a not palindrome");
		}
		sc.close();
	}
}
