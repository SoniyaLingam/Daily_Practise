
import java.util.Scanner;

public class find_single_if_other{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int xor = 0;

        for (int i = 1; i <= n; i++) {
            xor = xor ^ i;
        }

        System.out.println("XOR = " + xor);

        sc.close();
    }
}
