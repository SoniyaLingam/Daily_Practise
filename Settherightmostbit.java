import java.util.*;

public class Settherightmostbit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if ((n & (n + 1)) == 0) {
            System.out.println(n);
        } else {
            System.out.println(n | (n + 1));
        }
    }
}