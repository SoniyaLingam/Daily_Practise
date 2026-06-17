import java.util.*;

public class Print_floating_point_values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ((ch >= '0' && ch <= '9') || ch == '.') {
                sb.append(ch);
            } else {
                if (sb.length() > 0 && sb.indexOf(".") != -1) {
                    System.out.println(sb);
                }
                sb.setLength(0);
            }
        }

        if (sb.length() > 0 && sb.indexOf(".") != -1) {
            System.out.println(sb);
        }
    }
}