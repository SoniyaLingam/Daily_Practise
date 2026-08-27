import java.util.*;

public class Print_Numbers_from_B_to_A_in_Descending_Order{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        for (int i = b; i >= a; i--) {
            System.out.print(i + " ");
        }
    }
}