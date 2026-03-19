The casino has introduced a new game in which there are M vertical chutes, each containing N single-digit (possibly zero) numbers.

You can choose any chute and draw the bottom number. When you do this, all other numbers in that chute descend by one slot.

You need to build the largest integer using this process by drawing all the numbers from the chutes.

🎯 Goal

👉 Find the largest integer that can be formed.

📌 Boundary Conditions

1 <= M <= 20

1 <= N <= 50

📥 Input Format

First line contains two comma-separated integers:

M,N

Next M lines:

Each line contains N comma-separated digits

Digits are given from top to bottom

📤 Output Format

Print one line containing the largest integer formed

🔢 Example
Input
4,4
7,5,5,2
3,6,1,7
8,7,0,4
8,7,3,9
Output
9743782557163078




import java.util.*;
public class Cassino{
    public static int funcmax(int[][]a,int c,int n1,int n2){
            int ma=-1;
            int r=0;
            for(int u=0;u<n1;u++){
                if(ma<a[u][c]){
                    ma=a[u][c];
                    r=u;
                }
                
            }
            shift(a,r,n2);
            return ma;
    }
     public static void shift(int[][]a,int r,int n2){
            for(int u=n2-1;u>0;u--){
                a[r][u]=a[r][u-1];
            }
            a[r][0]=-1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] ar=sc.nextLine().split(",");
        int n1=Integer.parseInt(ar[0]);
        int n2=Integer.parseInt(ar[1]);
        int[][]a=new int[n1][n2];
        for(int u=0;u<n1;u++){
            String[]b=sc.nextLine().split(",");
            for(int j=0;j<n2;j++){
                a[u][j]=Integer.parseInt(b[j]);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int u=0;u<n1*n2;u++){
            
            int max=funcmax(a,n2-1,n1,n2);
            sb.append(max);
            
        }
        System.out.print(sb.toString());
        
       
    }
}

Time complexity is approximately O(n1 * n2 * max(n1, n2)), and space complexity is O(n1 * n2).