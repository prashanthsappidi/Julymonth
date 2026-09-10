package july4th;

import java.util.Scanner;

public class PrimeInRange_______________________ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Prime Numbers:");

        for (int i = start; i <= end; i++) {

            if (i <= 1)
                continue;

            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}