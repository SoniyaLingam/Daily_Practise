Triangle Layer Sum

A matrix having (N+1)/2 rows and N columns (where N is odd) is passed as the input. A triangle with non-zero values is present in the middle of the matrix. The program must print the sum of the values in the boundary of the triangle.

Boundary Condition(s):
5 <= N <= 49

Input Format:
The first line contains N.
The next (N+1)/2 lines, each contains N integer values separated by a space.

Output Format:
The first line contains the sum of integer values in the boundary of the triangle.

Example Input/Output 1:
Input:
5
0 0 1 0 0
0 6 5 2 0
3 5 4 9 8

Output:
38

Explanation:
The integer values along the boundary are 1, 2, 8, 9, 4, 5, 3 and 6.
Their sum is 38, which is printed as the output.

import java.util.*;
public class dt261{
public static void main(String[] args){
Scanner a=new Scanner(System.in);
int b=a.nextInt(),c=(b+1)/2-1,d=0;
int[][] m=new int[(b+1)/2][b];
for(int i=0;i<(b+1)/2;i++)for(int j=0;j<b;j++)m[i][j]=a.nextInt();
d+=m[0][c];
for(int i=1;i<c;i++)d+=m[i][c-i]+m[i][c+i];
for(int i=0;i<b;i++)d+=m[c][i];
System.out.print(d);
a.close();
}
}


Time complexity: O(b^2)
Space complexity: O(b^2)