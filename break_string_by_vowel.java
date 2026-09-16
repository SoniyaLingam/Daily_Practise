import java.util.*;

public class break_string_by_vowel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().trim();
        int t = 0;
        String k = "";
        String v = "aeiou";

        for (char i : s.toCharArray()) {
            if (t == 1 && v.indexOf(i) != -1) {
                System.out.println(k);
                k = "";
            } else if (v.indexOf(i) != -1) {
                t = 1;
            }
            k += i;
        }

        System.out.println(k);
    }
}