import java.util.*;

public class alternate_alphabet{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine().trim();
        int b = a.length() / 2;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < b; i++) {
            result.append(a.charAt(b + i));
            result.append(a.charAt(i));
        }

        System.out.println(result);
    }
}