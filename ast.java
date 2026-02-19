You are given a matrix of size R × C consisting of:

Integers

The character "*"

Your task is to rearrange the matrix such that:

Every "*" is replaced by some integer from the matrix.

The integers are moved towards the "*" positions.

Remaining positions should be filled appropriately after swapping.

🔹 Input Format

First line contains two integers:

R C


where:

R = number of rows

C = number of columns

Next R lines contain C space-separated elements (either integers or "*").

🔹 Example Input
4 4
11 2 4 5
* 2 4 9
* * * *
* 9 8 *

🔹 Expected Behavior (Based on Your Code Logic)

Whenever "*" is found,

Replace it by swapping with a non-"*" value found from the right side of the matrix.

Continue until all possible replacements are done.


import java.util.*;
public class ast{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        String[][] mat=new String[r][c];
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                mat[u][j]=sc.next();
            }
        }
        
        for(int j=0;j<c;j++){
            for(int u=0;u<r;u++){
                int f=0;
                if(mat[u][j].equals("*")){
                    for(int n=c-1;n>j;n--){
                        for(int k=0;k<r;k++){
                            if(!mat[k][n].equals("*")){
                                String temp=mat[u][j];
                                mat[u][j]=mat[k][n];
                                mat[k][n]=temp;
                                f=1;
                                break;

                            }
                        }
                        if(f==1){
                            break;
                        }
                    }
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


- Time complexity: approximately O(r^2 * c^2) in the worst case.
- Space complexity: O(r * c).