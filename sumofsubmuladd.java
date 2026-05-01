import java.util.*;

public class sumofsubmuladd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long result = (a + b) + (a - b) + (a * b);

        System.out.println(result);
    }
}
