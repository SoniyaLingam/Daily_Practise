import java.util.*;

public class Pattern18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {

            for(int j = i; j >= 0; j--) {

                char ch = (char)('A' + n - j - 1);

                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}