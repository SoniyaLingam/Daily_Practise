import java.util.*;

public class string_rotation_by_2_pts{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.next().trim();
        String y = sc.next().trim();

        String result = x.substring(2) + x.substring(0, 2);

        System.out.println(y.equals(result) ? "Yes" : "No");
    }
}