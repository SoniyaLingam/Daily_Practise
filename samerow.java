You are given a matrix with R rows and C columns.

Your task is to:

Remove all rows in which all the elements are the same.

Print the remaining rows of the matrix.

If all rows are removed, print:

-1

🔹 Input Format

The first line contains two integers R and C — number of rows and columns.

The next R lines each contain C integers, representing the matrix.

🔹 Output Format

Print the matrix after removing rows where all elements are identical.

If no rows remain after removal, print -1.

🔹 Example 1

Input:

5 4
10 20 30 10
50 50 50 50
55 55 66 55
40 30 20 10
55 55 55 55


Output:

10 20 30 10
55 55 66 55
40 30 20 10


Explanation:

Row 2 → All values are same → removed

Row 5 → All values are same → removed

🔹 Example 2

Input:

3 3
4 4 4
8 8 8
2 2 2


Output:

-1


Explanation:
All rows contain identical elements, so all rows are removed.


import java.util.Scanner;

public class samerow{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] mat=new int[r][c];
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                mat[u][j]=sc.nextInt();
               
            }
        }
         boolean anyrowprinted=false;
        for(int u=0;u<r;u++){
           
            boolean remove=true;
            for(int j=1;j<c;j++){
                if(mat[u][j]!=mat[u][0]){
                    remove=false;
                    break;

                }
            }
            if(!remove){
                anyrowprinted=true;
            
                for(int j=0;j<c;j++){
                    System.out.print(mat[u][j]+" ");
                }
                System.out.println();
            
        }
        }
   if(!anyrowprinted){
    System.out.print("-1");
   }
        

        
    }
}

Time complexity: O(r * c)
Space complexity: O(r * c)