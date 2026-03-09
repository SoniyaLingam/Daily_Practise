Given an array of size N and an integer K, check whether the array contains all integers from 1 to K at least once. If every number from 1 to K is present in the array, print 1; otherwise print 0.

Input Format:

First line: Integer N

Second line: N space-separated integers

Third line: Integer K

Output Format:
Print 1 if all numbers from 1 to K exist in the array, otherwise print 0.

Example:

Input

5
1 1 2 3 3
3

Output

1



import java.util.*;
public class numwithinrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]mat=new int[n];
        boolean[] seen=new boolean[n+1];
        for(int u=0;u<n;u++){
            mat[u]=sc.nextInt();
        }
        int a=sc.nextInt();
        for(int u=0;u<n;u++){
            if(mat[u]<1||mat[u]>a){
                System.out.println("0");
                return;
            }
            seen[mat[u]]=true;
        }
        for(int u=1;u<=a;u++){
            if(!seen[u]){
                System.out.println("0");
                return;
            }
        }
        System.out.println("1");
    }
}

time complexity is O(n + a).
space complexity is O(n).