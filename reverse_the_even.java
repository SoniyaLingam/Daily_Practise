
import java.util.Scanner;

public class reverse_the_even{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        StringBuilder a = new StringBuilder();

        // Traverse the input in reverse and keep only even digits
        for (int i = input.length() - 1; i >= 0; i--) {
            char b = input.charAt(i);

            if ("02468".indexOf(b) != -1) {
                a.append(b);
            }
        }

        // Remove leading zeros
        String result = a.toString().replaceFirst("^0+", "");

        if (a.length() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(result.isEmpty() ? "0" : result);
        }

        sc.close();
    }
}
