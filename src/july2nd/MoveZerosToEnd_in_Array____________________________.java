package july2nd;

import java.util.Scanner;

public class MoveZerosToEnd_in_Array____________________________{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array");

		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter the " + n + " array elements");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				if (i != j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

				j++;
			}
		}
		for (int w : arr) {
			System.out.print(w + "  ");
		}
	}

}
