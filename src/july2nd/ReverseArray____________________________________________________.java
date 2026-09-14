package july2nd;

import java.util.Scanner;

public class ReverseArray____________________________________________________

{

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

		// int arr[]= {2,3,1,6,9,2,0,4,2,1,9};

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;

		}

		for (int w : arr) {
			System.out.print(w + "  ");
		}

		
		sc.close();
	}

}
