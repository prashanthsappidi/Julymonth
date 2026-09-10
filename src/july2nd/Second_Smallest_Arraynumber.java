package july2nd;

import java.util.Scanner;

public class Second_Smallest_Arraynumber {

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
		
		int smallest = Integer.MAX_VALUE;
		
		int second_smallest = Integer.MAX_VALUE;
		
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				second_smallest=smallest;
				smallest=arr[i];
				
			}
			else if(arr[i]<second_smallest && arr[i]!=smallest)
			{
				second_smallest=arr[i];
			}
			
			
		}
		
		if(second_smallest==Integer.MAX_VALUE)
		{
			System.out.println("no second smallest number");
		}
		else
		{
			System.out.println("Second smallest number is "+ second_smallest);
		}
		sc.close();

	}

}
