import java.util.*;
public class reverseoddposition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                even.append(s.charAt(i));
            } else {
                odd.append(s.charAt(i));
            }
        }
        even.reverse();
        StringBuilder result = new StringBuilder();
        int e = 0, o = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                result.append(even.charAt(e++));
            } else {
                result.append(odd.charAt(o++));
            }
        }
        System.out.print(result.toString());
    }
}