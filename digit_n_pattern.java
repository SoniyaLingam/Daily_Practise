import java.util.*;

public class digit_n_pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().trim();

        for (char a : s.toCharArray()) {
            if (a != '0') {
                int n = a - '0';

                for (int i = 0; i < n; i++) {
                    System.out.print(a);
                }
                System.out.println();
            }
        }
    }
}