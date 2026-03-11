An integer matrix of size R × C is given as input. Another integer N (which is a perfect square) is also given. The program must check whether there exists a submatrix of size √N × √N that contains N integers where all the integers are either all odd or all even. If such a submatrix exists, print Yes. Otherwise print No.

Boundary Conditions
1 ≤ R, C ≤ 100
1 ≤ Matrix element value ≤ 1000
1 ≤ √N ≤ 10

Input Format
The first line contains R and C separated by a space.
The next R lines each contain C integers separated by a space.
The (R + 2)th line contains N.

Output Format
The first line contains Yes or No.




import java.util.*;
public class evenorodd {
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
        int n1=sc.nextInt();
        int n=(int)Math.sqrt(n1);
        boolean found=false;
        for(int u=0;u<=r-n;u++){
            for(int j=0;j<=c-n;j++){
                boolean even=true;
                boolean odd=true;
                for(int x=u;x<n-u;x++){
                    for(int y=j;y<n-j;j++){
                        if(mat[x][y]%2==0)odd=false;
                        else{
                            even=false;
                        }
                    }
                }
                if(odd || even){
                    found=true;
                    break;
                }
                
            }
        }
        if(found){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

Time complexity: O(r * c * n^2).
Space complexity: O(r * c).