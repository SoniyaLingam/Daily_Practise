import java.util.*;

class Calculator_With_Shift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int shift = sc.nextInt();

        int idx = -1;
        char op = ' ';

        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                idx = i;
                op = ch;
                break;
            }
        }

        int x = Integer.parseInt(s.substring(0, idx));
        int y = Integer.parseInt(s.substring(idx + 1));

        if (shift == 1) {
            if (op == '+')
                op = '-';
            else if (op == '-')
                op = '+';
            else if (op == '*')
                op = '/';
            else if (op == '/')
                op = '*';
        }

        if (op == '+')
            System.out.println(x + y);
        else if (op == '-')
            System.out.println(x - y);
        else if (op == '*')
            System.out.println(x * y);
        else
            System.out.println(x / y);
    }
}