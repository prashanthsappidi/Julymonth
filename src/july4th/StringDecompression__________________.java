package july4th;

import java.util.Scanner;

public class StringDecompression__________________ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter compressed string: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i += 2) {

            char ch = str.charAt(i);
            int count = Character.getNumericValue(str.charAt(i + 1));

            for (int j = 0; j < count; j++) {
                result.append(ch);
            }
        }

        System.out.println("Decompressed String: " + result);

        sc.close();
    }
}