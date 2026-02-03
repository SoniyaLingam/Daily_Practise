String Ladder Pattern

The program must accept two string values S1, S2 and an integer N as the input. The program must print the string ladder pattern based on the following conditions. The ladder must have N rungs, where each rung must be formed by the string S2. The rungs must be evenly spaced apart. The two rails of the ladder must be formed by the string S1 and the reverse of S1 alternately as shown in the Example Input/Output section. The asterisks (*) must be printed instead of the empty spaces in the string ladder pattern.

Note: The first and last characters of S1 and S2 are always the same.

Boundary Conditions:
5 ≤ Length of S1, S2 ≤ 100
1 ≤ N ≤ 100

Input Format:
The first line contains S1.
The second line contains S2.
The third line contains N.

Output Format:
The lines contain the string ladder pattern as shown in the Example Input/Output section.

Example Input/Output 1:
Input:
classic
cryptic
2

Output:
c******c
l******l
a******a
s******s
s******s
i******i
cryptic
i*******i
s*******s
s*******s
a*******a
l*******l
cryptic
l*******l
a*******a
s*******s
s*******s
i*******i
c******c

Explanation:
Here S1 = classic, S2 = cryptic and N = 2 . So the ladder has 2 rungs . Each rung of the ladder is formed using the string S2. The two rails of the ladder are formed using the string S1, reverse of S1 and S1 alternately.

import java.util.*;

public class stringladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String q = sc.nextLine().trim();
        String w = sc.nextLine().trim();
        int n = Integer.parseInt(sc.nextLine());

        int di = 1;

        System.out.println(q.charAt(0) + "*".repeat(w.length() - 2) + q.charAt(0));

        while (n >= 0) {
            for (int i = 1; i < q.length() - 1; i++) {
                int c;
                if (di == 1) {
                    c = i;
                } else {
                    c = q.length() - i - 1;
                }

                char ch = q.charAt(c);
                System.out.println(ch + "*".repeat(w.length() - 2) + ch);
            }

            if (n != 0) {
                System.out.println(w);
            }

            di *= -1;
            n--;
        }

        System.out.println(q.charAt(0) + "*".repeat(w.length() - 2) + q.charAt(0));
    }
}


- Time complexity: O(n * q.length())
- Space complexity: O(1)