package july1st;

import java.util.Scanner;

public class Count_the_number_of_vowels_and_consonants 

{

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String :");
		
		System.out.println();
		
		String s = sc.nextLine();
		
		s=s.toLowerCase();
		   
		sc.close();
		
		
		int c=0,v=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch =s.charAt(i);
			
			if (ch>='a' && ch<='z')
			{
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					v++;
				}
				else
				{
					c++;
				}
			}
			
					
		}
		System.out.println();
		System.out.println("Number of vowels "+v);
		System.out.println();
		System.out.println("Number of consants "+c);
	}

}
