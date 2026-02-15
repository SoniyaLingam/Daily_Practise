You are given a character matrix of size R × C.

You are also given an integer K, such that R and C are divisible by K.

🔹 Task

Divide the matrix into non-overlapping K × K submatrices.

Identify the first K × K submatrix that does not repeat anywhere else in the matrix.

Print that submatrix.

If all K × K submatrices repeat, print:

-1

🔹 Input Format

First line contains two integers R and C.

Next R lines contain C characters each (space separated).

Last line contains integer K.

🔹 Output Format

Print the first non-repeated K × K submatrix.

If none exists, print -1.

🔹 Constraints

1 ≤ R, C ≤ 50

R and C are divisible by K


import java.util.*;
public class block{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        sc.nextLine();
        char[][] mat=new char[r][c];
        for(int u=0;u<r;u++){
            String[]a=sc.nextLine().split(" ");
            for(int j=0;j<c;j++){
                mat[u][j]=a[j].charAt(0);
            }
        }
        int n=sc.nextInt();
        int ro=r/n;
        int co=c/n;
        HashMap<String,Integer>freq=new HashMap<>();
        for(int u=0;u<ro;u++){
            for(int j=0;j<co;j++){
                StringBuilder d=new StringBuilder();
                for(int z=u*n;z<u*n+n;z++){
                    for(int y=j*n;y<j*n+n;y++){
                        d.append(mat[z][y]);
                    }
                }
                String blo=d.toString();
                freq.put(blo,freq.getOrDefault(blo,0)+1);
            }
        }
        for(int u=0;u<ro;u++){
            for(int j=0;j<co;j++){
                StringBuilder d=new StringBuilder();
                for(int z=u*n;z<u*n+n;z++){
                    for(int y=j*n;y<j*n+n;y++){
                        d.append(mat[z][y]);
                    }
                }
                String blo=d.toString();
                
            if(freq.get(blo)==1){
                for(int up=u*n;up<u*n+n;up++){
                    for(int jp=j*n;jp<j*n+n;jp++){
                        System.out.print(mat[up][jp]+" ");
                    }
                    System.out.println();
                }
                return;
            }
        }

        
        }
        System.out.print(-1);
}
}


Time complexity: O(r * c)
Space complexity: O(r * c)