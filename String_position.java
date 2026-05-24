import java.util.*;

public class String_position {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int x = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2 * x) {

            for (int j = i; j < i + x && j < s.length(); j++) {
                sb.append(s.charAt(j));
            }
        }

        System.out.print(sb.toString());
    }
}