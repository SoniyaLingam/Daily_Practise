You are given a number N in base B. Convert the given number to its decimal (base 10) equivalent. If the number contains any invalid digit for the given base, print -1.

Input Format: First input is a string N (number in base B). Second input is an integer B (base).

Constraints: 1 ≤ B ≤ 36. Digits allowed are 0–9 (values 0 to 9) and A–Z or a–z (values 10 to 35).

Output Format: Print the decimal equivalent of N. If an invalid digit exists for the given base, print -1.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int B = sc.nextInt();

        if (B < 1 || B > 36) {
            System.out.println(-1);
            return;
        }

        long decimal = 0;

        for (int i = 0; i < N.length(); i++) {
            char ch = N.charAt(i);
            int value;

            if (ch >= '0' && ch <= '9') {
                value = ch - '0';
            } 
            else if (ch >= 'A' && ch <= 'Z') {
                value = ch - 'A' + 10;
            } 
            else if (ch >= 'a' && ch <= 'z') {
                value = ch - 'a' + 10;
            } 
            else {
                System.out.println(-1);
                return;
            }

            if (value >= B) {
                System.out.println(-1);
                return;
            }

            decimal = decimal * B + value;
        }

        System.out.println(decimal);
    }
}


- Time complexity: O(n).
- Space complexity: O(1).