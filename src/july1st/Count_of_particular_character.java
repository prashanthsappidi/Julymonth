package july1st;

import java.util.Scanner;

public class Count_of_particular_character {

	public static void main(String[] args) 
	
	{
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Enter the String value");
		String o=sc.nextLine();
		
		System.out.println("Enter char char value ");
		char ch = sc.next().charAt(0);	
		
		int d=0;
		
		for(int i=0;i<o.length();i++)
		{
			if(o.charAt(i)==ch) {
				d++;
			}
		}
		System.out.println("The count a character in that string is "+d);
		sc.close();
		
		
		
	}

}
