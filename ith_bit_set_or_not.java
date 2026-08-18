import java.util.*;

public class ith_bit_set_or_not{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = sc.nextInt();

        if ((n & (1 << i)) != 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}