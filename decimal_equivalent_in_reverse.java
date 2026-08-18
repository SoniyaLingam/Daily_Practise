import java.util.*;

public class decimal_equivalent_in_reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        // Decimal to binary
        String s = Long.toBinaryString(n);

        // Reverse binary
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        // Reversed binary to decimal
        long q = Long.parseLong(sb.toString(), 2);

        System.out.print(q);
    }
}