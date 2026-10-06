import java.util.*;

public class inverted_pyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int b = 0; b < a; b++) {

            // Print "*" b times
            System.out.print("*".repeat(b));

            // Character equivalent to Python chr(64-a-b)
            char ch = (char)(64 - a - b);

            // Repeat character (a-1-b)*2+1 times with spaces
            int count = (a - 1 - b) * 2 + 1;

            for (int i = 0; i < count; i++) {
                System.out.print(ch);

                if (i < count - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}