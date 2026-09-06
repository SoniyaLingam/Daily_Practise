import java.util.*;

public class l_shaped_paths{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + b - 1);

        for (int c = 1; c <= b; c++)
            System.out.println(1 + " " + c);

        for (int d = 2; d <= a; d++)
            System.out.println(d + " " + b);
    }
}