
import java.util.Scanner;

public class first_and_last_nchar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine().trim();
        int b = Integer.parseInt(sc.nextLine().trim());

        System.out.println(a.substring(0, b) + a.substring(a.length() - b));

        sc.close();
    }
}
