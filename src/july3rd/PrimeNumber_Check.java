package july3rd;

import java.util.Scanner;

public class PrimeNumber_Check {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();

        boolean prime = true;

        if (n <= 1) {
        	prime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                	prime = false;
                    break;
                }
            }
        }

        if (prime) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is Not a Prime Number");
        }

        sc.close();
    }
}