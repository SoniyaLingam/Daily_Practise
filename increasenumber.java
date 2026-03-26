Given a matrix of size R × C, modify the matrix such that:

Each element in the first row is increased by 1
Each element in the second row is increased by 2
Each element in the third row is increased by 3
and so on...

Finally, print the updated matrix.

📌 Input Format
First line: Two integers R and C (number of rows and columns)
Next R lines: Each line contains C integers representing the matrix
📌 Output Format
Print the modified matrix
Each row in a new line
Elements printed with spaces (as per your code)




import java.util.*;
public class increasenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int k=1;
        int[][]mat=new int[r][c];
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                mat[u][j]=sc.nextInt();
            }
        }
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                mat[u][j]=mat[u][j]+k;
                System.out.print(mat[u][j]+" ");
            }
            k++;
            System.out.println();
        }
        
    }
}

Time complexity:O(r * c).
Space complexity:O(r * c).