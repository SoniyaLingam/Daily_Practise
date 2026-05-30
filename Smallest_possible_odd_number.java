import java.util.*;

public class Smallest_possible_odd_number{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n1 = sc.next();
        String n2 = sc.next();

        String s = n1 + n2;

        int oddIndex = -1;
        char oddDigit = '0';

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if ((ch - '0') % 2 == 1) {

                if (oddIndex == -1 || ch > oddDigit) {
                    oddDigit = ch;
                    oddIndex = i;
                }
            }
        }

        if (oddIndex == -1) {
            System.out.print("-1");
            return;
        }

        char[] arr = new char[s.length() - 1];
        int k = 0;

        for (int i = 0; i < s.length(); i++) {

            if (i != oddIndex) {
                arr[k++] = s.charAt(i);
            }
        }

        Arrays.sort(arr);

        int firstNonZero = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != '0') {
                firstNonZero = i;
                break;
            }
        }

        StringBuilder sb = new StringBuilder();

        if (firstNonZero != -1) {

            sb.append(arr[firstNonZero]);

            for (int i = 0; i < arr.length; i++) {

                if (i != firstNonZero) {
                    sb.append(arr[i]);
                }
            }
        }

        sb.append(oddDigit);

        System.out.print(sb);
    }
}