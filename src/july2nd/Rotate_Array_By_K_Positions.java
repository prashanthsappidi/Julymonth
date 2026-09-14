package july2nd;

import java.util.Scanner;

public class Rotate_Array_By_K_Positions

{

	public static void main(String[] args) 
	
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array  ");

		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter " + n + " array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the k value  ");
		
		int k = sc.nextInt();
		
		int originalK=k;
		
		k=k%n;
		
		int result [] = new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			result[(i+k)%n]=arr[i];
		}
		
		System.out.println("After roating array by "+originalK+" times, the result of the array is given as");
		
		for(int t:result)
		{
			System.out.print(t+"   ");
		}
		
		sc.close();
	}

}
