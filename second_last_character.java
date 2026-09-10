import java.util.*;

public class second_last_character{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<String> b = new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();

            int digit = s.charAt(s.length() - 2) - '0';

            if (digit % 2 == 0) {
                b.add(s);
            } else {
                c.add(s);
            }
        }

        if (b.size() == c.size()) {
            System.out.println(-1);
        } 
        else if (b.size() > c.size()) {
            for (String s : b) {
                System.out.print(s + " ");
            }
        } 
        else {
            for (String s : c) {
                System.out.print(s + " ");
            }
        }
    }
}