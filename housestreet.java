You are given a 2D matrix of size S × H where each cell contains an integer.

You start from the top-left cell (0,0) and need to reach the bottom-right cell (S-1, H-1).

📌 Rules
From any cell, you can move only:
Right (→)
Down (↓)
🎯 Task

Find the maximum sum of values that can be collected along a path from the starting cell to the ending cell.

📥 Input Format
First line: Integer S (number of rows)
Second line: Integer H (number of columns)
Next S × H values: Elements of the matrix
📤 Output Format
Print a single integer → maximum path sum
🧠 Example
Input:
3 3
15 25 30
45 25 60
70 75 10
Output:
215




import java.util.*;
public class housestreet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][]m=new int[r][c];
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                m[u][j]=sc.nextInt();
            }
        }
        int[][]dp=new int[r+1][c+1];
       
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                dp[u+1][j+1]=Math.max(dp[u+1][j],dp[u][j+1])+m[u][j];
            }
        }
        System.out.print(dp[r][c]);
    }
}

Time complexity: O(r*c)
Space complexity: O(r*c)