
import java.util.Scanner;

public class product_of_the_digits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        String[] words = sc.nextLine().split("\\s+");

        for (String b : words) {
            int c = 1;

            for (int i = 0; i < b.length(); i++) {
                int d = b.charAt(i) - '0';
                c *= d;
            }

            System.out.print(c + " ");
        }

        sc.close();
    }
}
