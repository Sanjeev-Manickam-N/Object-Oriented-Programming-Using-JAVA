import java.util.HashSet;
import java.util.Scanner;

public class CompareSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        sc.nextLine();

        HashSet<String> set1 = new HashSet<>();

        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextLine());
        }

        int n2 = sc.nextInt();
        sc.nextLine();

        HashSet<String> set2 = new HashSet<>();

        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextLine());
        }

        set1.retainAll(set2);

        for (String sport : set1) {
            System.out.println(sport);
        }

        sc.close();
    }
}
