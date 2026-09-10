package july1st;

public class EvenOdd_in_Array {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 9, 4, 2, 7, 9 };

		System.out.println("The even numbers are ");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
			System.out.println();
			System.out.println("The odd numbers are ");

			for (int j = 0; j < arr.length; j++) {
				if (arr[j] % 2 != 0) {
					System.out.print(arr[j] + " ");
				}
			}
	}

}

