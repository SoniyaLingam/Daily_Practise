Problem Statement

You are given two arrays of positive integers.

The first array contains M elements.

The second array contains N elements.

Your task is to determine the number of co-prime pairs such that:

One element is taken from the first array.

One element is taken from the second array.

The pair is considered valid if the GCD (Greatest Common Divisor) of the two numbers is 1.

Return the total count of such co-prime pairs.

Input Format

An integer M – size of the first array

M space-separated integers

An integer N – size of the second array

N space-separated integers

Output Format

Print a single integer — the number of co-prime pairs.

Example

Input:

5
12 45 7 10 20
4
15 67 34 40

Output:

9

import java.util.*;
public class oprime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] mat=new int[n];
        for(int u=0;u<n;u++){
            mat[u]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] mat1=new int[m];
        for(int u=0;u<m;u++){
            mat1[u]=sc.nextInt();
        }
        int count=0;
      
        for(int u=0;u<n;u++){
            for(int j=0;j<m;j++){
                int a=mat[u];
                int b=mat1[j];
                while(b!=0){
                    int temp=b;
                    b=a%b;
                    a=temp;
                }                
                if(a==1){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}

Time complexity: O(n * m * log(max_element))
Space complexity: O(n + m)