Smallest 5-Digit Integer

The program must accept an integer **S** as the input.
The program must print the smallest **5-digit integer** whose **sum of digits** is equal to **S**.
If it is not possible to form such an integer, then the program must print **-1** as the output.

**Boundary Condition(s):**
1 ≤ S ≤ 50

**Input Format:**
The first line contains **S**.

**Output Format:**
The first line contains the smallest 5-digit integer whose sum of digits is equal to **S**.

---

**Example Input/Output 1:**
Input:
10

Output:
10009

**Explanation:**
Here S = 10.
The smallest possible 5-digit integer that can be formed is **10009**
(1 + 0 + 0 + 0 + 9 = 10).

**Example Input/Output 2:**
Input:
46

Output:
-1


**Example Input/Output 3:**
Input:
25

Output:
10699

import java.util.*;

public class dc271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();

        if (s < 1 || s > 45) {
            System.out.print(-1);
        } else {
            int r = s;
            StringBuilder d = new StringBuilder();

            for (int i = 0; i < 5; i++) {
                int m = Math.max((i == 0 ? 1 : 0), r - 9 * (4 - i));
                d.append(m);
                r -= m;
            }

            System.out.print(d.toString());
        }
    }
}

both time and space complexities are constant, O(1).