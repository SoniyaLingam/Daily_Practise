import java.util.*;

public class four_equal_substring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next().trim();
        int b = a.length() / 2;

        System.out.println(a.substring(0, b).equals(a.substring(b)) ? "yes" : "no");
    }
}