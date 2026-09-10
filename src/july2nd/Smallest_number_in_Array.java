package july2nd;

import java.util.Scanner;

public class Smallest_number_in_Array {

	public static void main(String[] arrg) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size of the array ");
		
		int n = sc.nextInt();
		
		System.out.println("Enter the "+n+" elements in the array");
		
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int min=arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("The Smallest element in the array is " + min);
		
		sc.close();

		
	}

}
