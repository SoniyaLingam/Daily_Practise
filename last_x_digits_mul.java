import java.util.*;

public class last_x_digits_mul{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next().trim();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(Integer.parseInt(a.substring(a.length() - b)) * c);
    }
}