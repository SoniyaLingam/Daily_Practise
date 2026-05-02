import java.util.*;

public class righttriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long x = Math.max(a, Math.max(b, c));
        long y, z;

        if (x == a) {
            y = b;
            z = c;
        } else if (x == b) {
            y = a;
            z = c;
        } else {
            y = a;
            z = b;
        }

        if (x * x == y * y + z * z) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}