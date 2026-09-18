import java.util.*;

public class Inverted_l_pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        // Print odd numbers
        for (int i = 1; i <= a; i += 2)
            System.out.print(i + " ");

        System.out.println();

        // Print even numbers
        for (int i = 2; i < a; i += 2)
            System.out.println(i);
    }
}