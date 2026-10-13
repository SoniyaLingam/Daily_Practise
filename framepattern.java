
import java.util.Scanner;

public class framepattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();

        String[] c = new String[a];

        for (int i = 0; i < a; i++) {
            c[i] = sc.nextLine().trim();
        }

        // Print the top border
        System.out.print("* ".repeat(b + 2));
        System.out.println();

        // Print each row with borders
        for (String d : c) {
            System.out.println("* " + d + " *");
        }

        // Print the bottom border
        System.out.print("* ".repeat(b + 2));
        System.out.println();

        sc.close();
    }
}
