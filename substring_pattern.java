import java.util.*;

public class substring_pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        int b = a.length();

        for (int c = 0; c <= b / 2; c++) {
            String s = a.substring(c, b - c);

            if (c % 2 == 1)
                s = new StringBuilder(s).reverse().toString();

            System.out.println("*".repeat(c) + s);
        }
    }
}