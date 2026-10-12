import java.util.Scanner;

public class digit_pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().trim();

        for (int i = 0; i < input.length(); i++) {
            int a = Character.getNumericValue(input.charAt(i));

            System.out.println("|" + "*".repeat(a));
        }

        sc.close();
    }
}