package july2nd;

import java.util.Scanner;

public class LargestElementinArray {

	public static void main(String[] arrgs)

	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array ");

		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter the " + n + " array elements");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("The Largest element in the array is " + max);
		
		sc.close();

	}

}
