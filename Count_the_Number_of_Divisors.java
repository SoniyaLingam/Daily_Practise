import java.util.*;

public class Count_the_Number_of_Divisors{
    static int c = 0;

    static void f(int n, int x) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % x == 0) {
                c++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        f(n, x);
        System.out.println(c);
    }
}