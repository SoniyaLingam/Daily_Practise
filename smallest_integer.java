//-------------DT--------------------(Java)
import java.util.*;

public class smallest_integer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] b = sc.nextLine().split("\\s+");

        int sum = 0;
        for (String s : b) {
            int min = 9;
            for (char c : s.strip().toCharArray()) {
                min = Math.min(min, c - '0');
            }
            sum += min;
        }

        System.out.println(sum);
    }
}