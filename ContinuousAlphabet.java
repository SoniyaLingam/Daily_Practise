import java.util.Scanner;

public class ContinuousAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String result = "";

        for (int i = 0; i < s.length() - 1; i++) {
            String temp = "";
            temp += s.charAt(i);

            int j = i;

            while (j < s.length() - 1) {
                char current = s.charAt(j);
                char next = s.charAt(j + 1);

                if ((next - current == 1) || (current == 'z' && next == 'a')) {
                    temp += next;
                    j++;
                } else {
                    break;
                }
            }

            if (temp.length() >= 2) {
                result += temp;
                i = j;
            }
        }

        if (result.length() == 0) {
            System.out.println("-1");
        } else {
            System.out.println(result);
        }
    }
}