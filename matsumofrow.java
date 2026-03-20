A matrix of size R × C is given as input.
The program must add the elements in the first row (row 0) column-wise to the elements in the rows below by equally dividing them.

If the value cannot be divided evenly, ignore the decimal part (integer division).

Task

For each column:

Take the element from the first row

Divide it by (R - 1)

Add the result to each element in the rows below (same column)

Boundary Conditions
1 ≤ R, C ≤ 100
Input Format

First line: Two integers R and C

Next R lines:

Each line contains C integers (space-separated)

Output Format

Print the modified matrix

Output should contain R rows and C columns

Example
Input
3 4
24 4 2 19
8 10 5 1
7 13 12 14
Output
24 4 2 19
20 12 6 10
19 15 13 23




import java.util.*;
public class matsumofrow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][]arr=new int[r][c];
       
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                arr[u][j]=sc.nextInt();
            }
        }
        for(int u=1;u<r;u++){
            for(int j=0;j<c;j++){
                arr[u][j]=arr[u][j]+(arr[0][j]/(r-1));
            }
        }
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                System.out.print(arr[u][j]+" ");
            }
            System.out.println();
        }
    }
}

- Time Complexity: O(r * c)
- Space Complexity: O(r * c)