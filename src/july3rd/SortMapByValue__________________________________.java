package july3rd;

import java.util.*;

public class SortMapByValue__________________________________ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();

        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter Key: ");
            String key = sc.nextLine();

            System.out.print("Enter Value: ");
            int value = sc.nextInt();
            sc.nextLine();

            map.put(key, value);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, (a, b) -> a.getValue().compareTo(b.getValue()));

        System.out.println("\nSorted Map:");

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        sc.close();
    }
}