import java.util.*;

public class uppercase_lowercase_vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int lower = 0;
        int upper = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Lowercase vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                lower++;
            }

            // Uppercase vowels
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                upper++;
            }
        }

        if (lower == 0 || upper == 0) {
            System.out.println("-1");
        } else {
            System.out.println(lower + " " + upper);
        }
    }
}