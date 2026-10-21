//-------------DC--------------------(Java)
import java.util.*;

public class reverse_x_digit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine().strip();
        int b = Integer.parseInt(sc.nextLine());

        System.out.println(a.substring(0, a.length() - b)
                + new StringBuilder(a.substring(a.length() - b)).reverse());
    }
}