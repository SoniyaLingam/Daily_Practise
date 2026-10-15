
import java.util.Scanner;

public class triangle_binary_pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Convert the integer to a binary string
        String a = Integer.toBinaryString(n);

        // Print each suffix with increasing stars
        for (int b = 0; b < a.length(); b++) {
            System.out.println("*".repeat(b) + a.substring(b));
        }

        sc.close();
    }
}
