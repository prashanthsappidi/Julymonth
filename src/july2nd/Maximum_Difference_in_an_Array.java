package july2nd;

public class Maximum_Difference_in_an_Array {

	public static void main(String[] args) {
		int arr[] = { 1, 9, 2, 4, 6, 3, 5, 9, 0, 15};
		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		int diff = max - min;
		System.out.println(diff);
	}

}
