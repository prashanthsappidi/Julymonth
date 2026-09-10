package july4th;

import java.util.HashSet;
import java.util.Scanner;

public class Pangram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().toLowerCase();

        HashSet<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                set.add(ch);
            }
        }

        if (set.size() == 26)
            System.out.println("Pangram");
        else
            System.out.println("Not Pangram");

        sc.close();
    }
}