import java.util.*;

public class reverse_middle_word_in_a_string{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] a = sc.nextLine().split(" ");

        System.out.print(a[0] + " ");

        for (int b = 1; b < a.length - 1; b++) {
            System.out.print(new StringBuilder(a[b]).reverse().toString() + " ");
        }

        System.out.println(a[a.length - 1]);
    }
}