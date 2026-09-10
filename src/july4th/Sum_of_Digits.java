package july4th;

public class Sum_of_Digits {

	public static void main(String[] args) {

		int n = 12345;
		int sum = 0;

		while (n > 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		System.out.println("The sum of the digits of the number is " + sum);

	}

}
