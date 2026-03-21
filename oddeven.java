The program must accept an integer N as input and print an N × N matrix using the integers from 1 to N × N.

The matrix must be filled such that:

The numbers are arranged using all integers from 1 to N²
Odd and even numbers are placed alternately
Odd numbers are taken in increasing order (1, 3, 5, …)
Even numbers are taken in decreasing order (largest even ≤ N², then decreasing)
📌 Boundary Condition
1
≤
𝑁
≤
100
1≤N≤100
📥 Input Format
The first line contains an integer N
📤 Output Format
Print N lines, each containing N integers separated by space, representing the matrix
🔍 Example 1

Input:

3

Output:

1 8 3
6 5 4
7 2 9
🔍 Example 2

Input:

4

Output:

1 16 3 14
5 12 7 10
9 8 11 6
13 4 15 2
🔍 Example 3

Input:

5

Output:

1 24 3 22 5
20 7 18 9 16
11 14 13 12 15
10 17 8 19 6
21 4 23 2 25




import java.util.*;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int odd = 1;
        int even = n * n;
        if(even % 2 != 0) even--; // largest even

        int[][] mat = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if((i * n + j) % 2 == 0){
                    mat[i][j] = odd;
                    odd += 2;
                } else {
                    mat[i][j] = even;
                    even -= 2;
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}


Time complexity: O(n^2)
Space complexity: O(n^2)