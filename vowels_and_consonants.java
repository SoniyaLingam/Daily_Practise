import java.util.*;

class vowels_and_consonants {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        int n = a.length();

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        for (int i = 0; i < n; i++) {

            char ch = a.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                sb.append(ch);

            } else {

                sb1.append(ch);

            }
        }

        String res = sb.toString() + sb1.toString();

        System.out.print(res);
    }
}