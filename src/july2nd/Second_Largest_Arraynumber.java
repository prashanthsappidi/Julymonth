package july2nd;

import java.util.Scanner;

public class Second_Largest_Arraynumber {

	public static void main(String[] args)
	
	
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array ");

		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter the " + n + " array elements");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int largest = Integer.MIN_VALUE;
		
		int second_largest = Integer.MIN_VALUE;
		
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				second_largest=largest;
				largest=arr[i];
				
			}
			else if(arr[i]>second_largest && arr[i]!=largest)
			{
				second_largest=arr[i];
			}
			
			
		}
		
		if(second_largest==Integer.MIN_VALUE)
		{
			System.out.println("no second largest number");
		}
		else
		{
			System.out.println("Second largest number is "+ second_largest);
		}
		
		sc.close();

	}

}
