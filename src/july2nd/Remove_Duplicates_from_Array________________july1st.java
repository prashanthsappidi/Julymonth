package july2nd;

import java.util.Scanner;

public class Remove_Duplicates_from_Array________________july1st {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array  ");

		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter " + n + " array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Array after removing duplicates:");

		for (int i = 0; i < arr.length; i++) {
			boolean duplicate = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					duplicate = true;
					break;
				}
			}

			if (!duplicate) {
				System.out.print(arr[i] + " ");
			}
		}
		sc.close();
	}

}
