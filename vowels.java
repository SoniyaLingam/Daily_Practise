import java.util.*;

public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int b = sc.nextInt();

        StringBuilder c = new StringBuilder();

        for (char d : a.toCharArray()) {
            if ("aeiouAEIOU".indexOf(d) != -1) {
                c.append(d);
            }
        }

        if (c.length() >= b)
            System.out.println(c.substring(0, b));
        else
            System.out.println(-1);
    }
}