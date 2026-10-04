import java.util.*;

public class asterisk_pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine().trim();

        for (int b = 0; b < a.length(); b++) {
            System.out.println("*".repeat(b) + a.substring(0, a.length() - b));
        }
    }
}