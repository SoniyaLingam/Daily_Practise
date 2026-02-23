The program must accept N integers and an integer K as input.
The program must calculate and print the number of ways W to form the integer K by adding two integers among the N integers.

The sign of the integers can be changed (i.e., you may use positive or negative sign for each selected integer) to form K.

Boundary Conditions

2
≤
𝑁
≤
1000
2≤N≤1000

−
2
×
10
5
≤
𝐾
≤
2
×
10
5
−2×10
5
≤K≤2×10
5

−
10
5
≤
−10
5
≤ Each integer value 
≤
10
5
≤10
5

Input Format

The first line contains N and K separated by a space.

The second line contains N integers separated by spaces.

Output Format

The first line contains an integer representing the number of ways to form K based on the given conditions.

Example Input/Output 1
Input
3 5
-2 3 -3
Output
2
Explanation

The 2 possible ways are:

-2 and -3 → 2 + 3 = 5

-2 and 3 → 2 + 3 = 5

Example Input/Output 2
Input
5 -3
-1 -2 2 1 4
Output
6



import java.util.*;

public class addtwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int a = arr[i];
                int b = arr[j];

                if ( a + b == k ||
                     a - b == k ||
                    -a + b == k ||
                    -a - b == k ) {

                    count++;
                }
            }
        }

        System.out.println(count);
    }
}


- Time complexity: O(n^2)
- Space complexity: O(n)