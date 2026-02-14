Question

There are N empty buckets arranged in a row. Every second, a certain number of balls fall into each bucket.

The maximum capacity of each bucket is K. If the number of balls in a bucket exceeds the maximum capacity, the remaining balls will overflow.

When a bucket becomes full or overflowing, a boy collects all the balls from that bucket and empties it again.

The program must accept:

An integer matrix of size T × N, representing the number of balls that fall into N buckets in T seconds

The value of K

The program must print the total number of balls the boy can collect.

Important:

At T = 1, the balls in the last row of the matrix fall into the buckets.

At T = 2, the balls in the second last row fall into the buckets.

And so on.

Boundary Conditions

1 ≤ T, N ≤ 50

1 ≤ Matrix element value ≤ 1000

1 ≤ K ≤ 10⁴

Input Format

The first line contains T and N separated by a space.

The next T lines, each containing N integers separated by a space.

The next line contains K.

Output Format

The first line contains the total number of balls the boy can collect.


import java.util.*;
public class bucket{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int s=sc.nextInt();
        int[][] mat=new int[t][s];
        for(int u=0;u<t;u++){
            for(int j=0;j<s;j++){
                mat[u][j]=sc.nextInt();
            }
        }
        int k=sc.nextInt();
        int v=0;
        int[]b=new int[s];
        for(int u=t-1;u>=0;u--){
            for(int j=0;j<s;j++){
                b[j]+=mat[u][j];
            
            if(b[j]>=k){
                v+=k;
                b[j]=0;
            }
        }
        }
        System.out.print(v);
    }}

time complexity is O(T*N).
space complexity is O(T*N).