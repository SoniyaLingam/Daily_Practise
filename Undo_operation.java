import java.util.*;

public class Undo_operation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        // S1
        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) == '#') {

                if (sb1.length() > 0) {
                    sb1.deleteCharAt(sb1.length() - 1);
                }

            } else {
                sb1.append(s1.charAt(i));
            }
        }

        // S2
        for (int i = 0; i < s2.length(); i++) {

            if (s2.charAt(i) == '#') {

                if (sb2.length() > 0) {
                    sb2.deleteCharAt(sb2.length() - 1);
                }

            } else {
                sb2.append(s2.charAt(i));
            }
        }

        if (sb1.toString().equals(sb2.toString())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}