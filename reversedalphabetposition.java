import java.util.*;

public class reversedalphabetposition{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLowerCase(ch)) {
                result += (char)('z' - (ch - 'a'));
            } else if (Character.isUpperCase(ch)) {
                result += (char)('Z' - (ch - 'A'));
            } else {
                result += ch;
            }
        }

        System.out.println(result);
    }
}
