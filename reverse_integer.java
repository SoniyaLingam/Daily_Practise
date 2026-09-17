import java.util.*;

public class reverse_integer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine().trim();

        if (a.charAt(0) != '-') {
            System.out.println(Integer.parseInt(new StringBuilder(a).reverse().toString()));
        } else {
            System.out.println(Integer.parseInt(a.charAt(0) + a.substring(0, a.length() - 1)));
        }
    }
}