You are given a Boolean matrix of size R × C containing only 0s and 1s.

🎯 Task

Modify the matrix such that:

If a cell mat[i][j] contains 1, then all its adjacent cells are changed to 0.
📌 Adjacent Cells

For a cell (i, j), the adjacent cells are:

Top → (i-1, j)
Bottom → (i+1, j)
Left → (i, j-1)
Right → (i, j+1)

(Only consider valid positions within the matrix)

⚠️ Important Conditions
The original 1 should remain unchanged
Changes must be applied simultaneously (not during traversal)
A cell may be affected by multiple 1s
📥 Input
First line: Two integers R and C
Next R lines: Each contains C integers (0 or 1)
📤 Output
Print the modified matrix after applying the rule
📌 Example
Input:
3 3
1 1 0
0 0 0
1 1 0
Output:
0 0 0
0 0 0
0 0 0




import java.util.*;
public class adjmat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][]mat=new int[r][c];
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                mat[u][j]=sc.nextInt();
            }
        }
        boolean[][]res=new boolean[r][c];
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                if(mat[u][j]==1){
                    if(u-1>=0)res[u-1][j]=true;
                    if(u+1<r)res[u+1][j]=true;
                    if(j-1>=0)res[u][j-1]=true;
                    if(j+1<c)res[u][j+1]=true;
                }
            }
        }
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                if(res[u][j]){
                    mat[u][j]=0;
                }
            }
        }
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                System.out.print(mat[u][j]+" ");
            }
            System.out.println();
        }
        
    }
}

time complexity is O(r * c).
space complexity is O(r * c)
