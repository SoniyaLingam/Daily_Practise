import java.util.*;

public class replace_odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().trim();

        for (char ch : s.toCharArray()) {
            if ("13579".indexOf(ch) != -1)
                System.out.print("1");
            else
                System.out.print("0");
        }
    }
}