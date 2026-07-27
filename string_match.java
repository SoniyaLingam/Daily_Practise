import java.util.*;

public class string_match{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        // Length difference should be exactly 1
        if (Math.abs(s1.length() - s2.length()) != 1) {
            System.out.println("NO");
            return;
        }

        // Make s1 the longer string
        if (s1.length() < s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }

        int i = 0, j = 0;
        boolean skipped = false;

        while (i < s1.length() && j < s2.length()) {

            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (skipped) {
                    System.out.println("NO");
                    return;
                }
                skipped = true;
                i++; // Skip one character in the longer string
            }
        }

        System.out.println("YES");
    }
}